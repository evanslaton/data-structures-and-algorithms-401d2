package QueueWithStacks;

import StacksAndQueues.Stack;

public class QueueWithStacks<T>  implements {
    Stack<T> firstStack;
    Stack<T> secondStack;

    // Constructor
    public QueueWithStacks(){
        this.firstStack = new Stack();
        this.secondStack = new Stack();
    }

    //
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

    public T dequeue() {
        return firstStack.pop();
    }

}
