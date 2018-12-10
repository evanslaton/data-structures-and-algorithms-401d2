package StacksAndQueues;

import org.junit.Test;

import static org.junit.Assert.*;

public class StackTest {

    @Test
    public void push() {
        Stack testStack = new Stack();
        testStack.push(5);
        testStack.push(100);
        testStack.push(26);
        testStack.push(83);
        assertEquals("Should be 83", 83, testStack.top.value);
        assertEquals("Should be 83", 26, testStack.top.next.value);
        assertEquals("Should be 83", 100, testStack.top.next.next.value);
        assertEquals("Should be 83", 5, testStack.top.next.next.next.value);
    }

    @Test
    public void pop() {
        Stack testStack = new Stack();
        testStack.push(91);
        testStack.pop();
        assertEquals("Should be null", null, testStack.top);

        testStack.push(28);
        testStack.push(73);
        testStack.push(36);
        testStack.pop();
        assertEquals("Should be 73", 73, testStack.top.value);

        testStack.pop();
        testStack.pop();
        assertEquals("Should be null", null, testStack.top);
    }

    @Test
    public void peek() {
        Stack testStack = new Stack();
        testStack.push(999999999);
        assertEquals("Should be 999999999", 999999999, testStack.peek().value);

        testStack.push(88888888);
        assertEquals("Should be 88888888", 88888888, testStack.peek().value);

        testStack.pop();
        assertEquals("Should be 999999999", 999999999, testStack.peek().value);
    }
}