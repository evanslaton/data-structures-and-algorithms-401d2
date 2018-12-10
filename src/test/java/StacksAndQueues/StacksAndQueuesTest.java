package StacksAndQueues;

import org.junit.Test;

import static org.junit.Assert.*;

public class StacksAndQueuesTest {

    // Stack Tests
    @Test
    public void testPush() {
        Stack testStack = new Stack();
        testStack.push(5);
        testStack.push("Kelly Clarkson");
        testStack.push(26);
        testStack.push(83.1);
        assertEquals("Should be 83.1", 83.1, testStack.top.value);
        assertEquals("Should be 83", 26, testStack.top.next.value);
        assertEquals("Should be Kelly Clarkson", "Kelly Clarkson", testStack.top.next.next.value);
        assertEquals("Should be 5", 5, testStack.top.next.next.next.value);
    }

    @Test
    public void testPop() {
        Stack testStack = new Stack();
        testStack.push(91);
        testStack.pop();
        assertEquals("Should be null", null, testStack.top);

        testStack.push(28);
        testStack.push("Pineapple");
        testStack.push(36);
        testStack.pop();
        assertEquals("Should be Pineapple", "Pineapple", testStack.top.value);

        testStack.pop();
        testStack.pop();
        assertEquals("Should be null", null, testStack.top);
    }

    @Test
    public void testStackPeek() {
        Stack testStack = new Stack();
        testStack.push(999999999);
        assertEquals("Should be 999999999", 999999999, testStack.peek());

        testStack.push("AAAAAA");
        assertEquals("Should be 88888888", "AAAAAA", testStack.peek());

        testStack.pop();
        assertEquals("Should be 999999999", 999999999, testStack.peek());
    }

    // Queue Tests
    @Test
    public void testEnqueue() {
        Queue testQueue = new Queue();
        testQueue.enqueue('E');
        assertEquals("Should be E", 'E', testQueue.front.value);
        assertEquals("Should be null", null, testQueue.front.next);
        assertEquals("Should be E", 'E', testQueue.rear.value);
        assertEquals("Should be null", null, testQueue.rear.next);

        testQueue.enqueue(0.25);
        assertEquals("Should be E", 'E', testQueue.front.value);
        assertEquals("Should be 0.25", 0.25, testQueue.front.next.value);
        assertEquals("Should be 0.25", 0.25, testQueue.rear.value);
        assertEquals("Should be null", null, testQueue.rear.next);

        testQueue.enqueue("Potato");
        assertEquals("Should be E", 'E', testQueue.front.value);
        assertEquals("Should be 0.25", 0.25, testQueue.front.next.value);
        assertEquals("Should be Potato", "Potato", testQueue.front.next.next.value);
        assertEquals("Should be Potato", "Potato", testQueue.rear.value);
        assertEquals("Should be null", null, testQueue.rear.next);
    }

    @Test
    public void testDequeue() {
        Queue testQueue = new Queue();
        assertEquals("Should be null", null, testQueue.dequeue());

        testQueue.enqueue("Hello");
        assertEquals("Should be Hello", "Hello", testQueue.dequeue());
        assertEquals("Should be null", null, testQueue.dequeue());

        testQueue.enqueue(0);
        testQueue.enqueue(-3.1);
        testQueue.enqueue('z');
        assertEquals("Should be 0", 0, testQueue.dequeue());
        assertEquals("Should be -3.1", -3.1, testQueue.dequeue());
        assertEquals("Should be z", 'z', testQueue.dequeue());
        assertEquals("Should be null", null, testQueue.dequeue());
    }

    @Test
    public void testQueuePeek() {
        Queue testQueue = new Queue();
        assertEquals("Should be null", null, testQueue.peek());

        int[] testIntArray = {1, 2, 3, 4};
        testQueue.enqueue(testIntArray);
        testQueue.enqueue("US of A");
        assertEquals("Should be [1, 2, 3, 4]", testIntArray, testQueue.peek());

        testQueue.dequeue();
        assertEquals("Should be US of A", "US of A", testQueue.peek());

        testQueue.dequeue();
        assertEquals("Should be null", null, testQueue.peek());
    }
}