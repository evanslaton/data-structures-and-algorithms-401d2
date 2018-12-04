package linkedlist;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class LinkedListTest {

    @Test
    public void insertOneValue() {
        LinkedList testLinkedList = new LinkedList();
        testLinkedList.insert(1);
        assertEquals("Should be 1", 1, testLinkedList.head.value);
    }

    @Test
    public void insertTwoValues() {
        LinkedList testLinkedList = new LinkedList();
        testLinkedList.insert(10);
        testLinkedList.insert(1);
        assertEquals("Should be 10", 10, testLinkedList.head.next.value);
    }

    @Test
    public void insertThreeValues() {
        LinkedList testLinkedList = new LinkedList();
        testLinkedList.insert(100);
        testLinkedList.insert(10);
        testLinkedList.insert(1);
        assertEquals("Should be 100", 100, testLinkedList.head.next.next.value);
    }

    @Test
    public void includes1() {
        LinkedList testLinkedList = new LinkedList();
        testLinkedList.insert(100);
        testLinkedList.insert(10);
        testLinkedList.insert(1);

        assertTrue("Should be true", testLinkedList.includes(10));
    }

    @Test
    public void includes2() {
        LinkedList testLinkedList = new LinkedList();
        testLinkedList.insert(23);
        testLinkedList.insert(67);
        testLinkedList.insert(98);
        testLinkedList.insert(8);
        testLinkedList.insert(16);
        testLinkedList.insert(53);

        assertTrue("Should be true", testLinkedList.includes(16));
    }

    @Test
    public void includes3() {
        LinkedList testLinkedList = new LinkedList();
        testLinkedList.insert(87);
        testLinkedList.insert(3);
        testLinkedList.insert(45);

        assertFalse("Should be true", testLinkedList.includes(44));
    }

    @Test
    public void print() {
        LinkedList testLinkedList = new LinkedList();
        testLinkedList.insert(10);
        testLinkedList.insert(15);
        testLinkedList.insert(20);
        testLinkedList.insert(25);

        ArrayList<Integer> testArrayList = new ArrayList<Integer>();
        testArrayList.add(25);
        testArrayList.add(20);
        testArrayList.add(15);
        testArrayList.add(10);

        assertEquals("Should be [10, 15, 20, 15]", testArrayList, testLinkedList.print());
    }

    @Test
    public void print2() {
        LinkedList testLinkedList = new LinkedList();
        testLinkedList.insert(0);
        testLinkedList.insert(546);
        testLinkedList.insert(45678);
        testLinkedList.insert(100001);
        testLinkedList.insert(71);

        ArrayList<Integer> testArrayList = new ArrayList<Integer>();
        testArrayList.add(71);
        testArrayList.add(100001);
        testArrayList.add(45678);
        testArrayList.add(546);
        testArrayList.add(0);


        assertEquals("Should be the same", testArrayList, testLinkedList.print());
    }

    @Test
    public void print3() {
        LinkedList testLinkedList = new LinkedList();
        testLinkedList.insert(10);
        testLinkedList.insert(15);
        testLinkedList.insert(20);
        testLinkedList.insert(25);

        ArrayList<Integer> testArrayList = new ArrayList<Integer>();
        testArrayList.add(25);
        testArrayList.add(20);
        testArrayList.add(15);
        testArrayList.add(10);

        assertEquals("Should be 4", testArrayList.size(), testLinkedList.print().size());
    }

    @Test
    public void testAppend() {
        LinkedList testLinkedList = new LinkedList();
        testLinkedList.insert(4);
        testLinkedList.insert(107);
        testLinkedList.insert(41);
        testLinkedList.append(53);

        // Gets the length of the linkedlist
        Node current = testLinkedList.head;
        int testLinkedListLength = 0;
        while (current != null) {
            testLinkedListLength++;
            current = current.next;
        }
        assertTrue("Should return true", testLinkedList.includes(53));
        assertEquals("Should be 4", 4, testLinkedListLength);
        assertEquals("Should be 53", 53, testLinkedList.head.next.next.next.value);
    }

    @Test
    public void testInsertBefore() {
        LinkedList testLinkedList = new LinkedList();
        testLinkedList.insert(5000);
        testLinkedList.insert(10000);
        testLinkedList.insert(700000);
        testLinkedList.insertBefore(10000, 3);

        // Gets the length of the linkedlist
        Node current = testLinkedList.head;
        int testLinkedListLength = 0;
        while (current != null) {
            testLinkedListLength++;
            current = current.next;
        }
        assertTrue("Should return true", testLinkedList.includes(3));
        assertEquals("Should be 4", 4, testLinkedListLength);
        assertEquals("Should be 3", 3, testLinkedList.head.next.value);
    }

    @Test
    public void testInsertAfter() {
        LinkedList testLinkedList = new LinkedList();
        testLinkedList.insert(0);
        testLinkedList.insert(123);
        testLinkedList.insert(9999);
        testLinkedList.insert(53);
        testLinkedList.insertAfter(53, 482);

        // Gets the length of the linkedlist
        Node current = testLinkedList.head;
        int testLinkedListLength = 0;
        while (current != null) {
            testLinkedListLength++;
            current = current.next;
        }
        assertTrue("Should return true", testLinkedList.includes(482));
        assertEquals("Should be 5", 5, testLinkedListLength);
        assertEquals("Should be 842", 482, testLinkedList.head.next.value);
    }
}