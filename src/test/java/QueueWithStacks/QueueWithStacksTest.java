package QueueWithStacks;

import StacksAndQueues.Queue;
import org.junit.Test;

import static org.junit.Assert.*;

public class QueueWithStacksTest {

    @Test
    public void testQueueWithStacksConstructor() {
        QueueWithStacks testQueue = new QueueWithStacks();
        assertTrue("Should be null", testQueue.firstStack.peek() == null);
        assertTrue("Should be null", testQueue.secondStack.peek() == null);
    }

    @Test
    public void testEnqueue() {
        QueueWithStacks testQueue = new QueueWithStacks();
        testQueue.enqueue(true);
        testQueue.enqueue("Kiwi");
        testQueue.enqueue(1);
        testQueue.enqueue('g');
        assertEquals("Should be true", true, testQueue.dequeue());
        assertEquals("Should be Kiwi", "Kiwi", testQueue.dequeue());
        assertEquals("Should be 1", 1, testQueue.dequeue());
        assertEquals("Should be g", 'g', testQueue.dequeue());
        assertEquals("Should be null", null, testQueue.dequeue());
    }

    @Test
    public void testDequeue() {
        QueueWithStacks testQueue = new QueueWithStacks();
        testQueue.enqueue("A-Okay");
        testQueue.enqueue(345);
        testQueue.enqueue(false);
        testQueue.enqueue(0.0001);
        assertEquals("Should be A-Okay", "A-Okay", testQueue.dequeue());
        assertEquals("Should be 345", 345, testQueue.dequeue());
        assertEquals("Should be false", false, testQueue.dequeue());
        assertEquals("Should be 0.0001", 0.0001, testQueue.dequeue());
        assertEquals("Should be null", null, testQueue.dequeue());
    }
}