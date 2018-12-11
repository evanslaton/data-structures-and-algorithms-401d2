package QueueWithStacks;

import StacksAndQueues.Stack;

public class QueueWithStacks<T> {
    Stack<T> firstStack;
    Stack<T> secondStack;

    // Constructor
    public QueueWithStacks(){
        this.firstStack = new Stack();
        this.secondStack = new Stack();
    }

}
