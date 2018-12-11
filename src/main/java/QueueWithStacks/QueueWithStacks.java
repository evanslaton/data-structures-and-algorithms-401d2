package QueueWithStacks;

import StacksAndQueues.Stack;

public class QueueWithStacks<T>  {
    Stack<T> firstStack;
    Stack<T> secondStack;

    // Constructor
    public QueueWithStacks(){
        this.firstStack = new Stack();
        this.secondStack = new Stack();
    }

    // Adds a new node with the specified value to the back of the queue
    public void enqueue(T value) {
        if (firstStack.peek() == null) {
            firstStack.push(value);
        } else {
            while (firstStack.peek() != null) {
                secondStack.push(firstStack.pop());
            }
            firstStack.push(value);
            while (secondStack.peek() != null) {
                firstStack.push(secondStack.pop());
            }
        }
    }

    // Removes the node from the front of the queue, and returns that node's value
    public T dequeue() {
        return firstStack.peek() == null ? null : firstStack.pop();
    }

}
