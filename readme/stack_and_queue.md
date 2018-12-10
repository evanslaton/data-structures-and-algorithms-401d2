# Stacks and Queues
Learning 2 new data structures: stacks and queues.

## Challenge
* Create a Node class that has properties for the value stored in the Node, and a pointer to the next node
* Create a Stack class that has a top property and creates an empty Stack when instantiated
    * This object should be aware of a default empty value assigned to top when the stack is created
    * Define a method called push which takes any value as an argument and adds a new node with that value to the top of the stack with an O(1) Time performance
    * Define a method called pop that does not take any argument, removes the node from the top of the stack, and returns the node
    * Define a method called peek that does not take an argument and returns the node located on the top of the stack
* Create a Queue class that has a top property and creates an empty queue when instantiated
    * This object should be aware of a default empty value assigned to front when the queue is created
    * Define a method called enqueue which takes any value as an argument and adds a new node with that value to the back of the queue with an O(1) Time performance
    * Define a method called dequeue that does not take any argument, removes the node from the front of the queue, and returns the node
    * Define a method called peek that does not take an argument and returns the node located in the front of the queue

## Approach & Efficiency
Per the instructions I took the approaches that use O(1) Time, reassigning the nodes to what their next property should be instead of looping

## API
| Class |  Methods  |                                                Method Description                                                            |
|-------|-----------|------------------------------------------------------------------------------------------------------------------------------|
| Stack |  push()   | creates and adds a new node with a user specified value to the "top" of the stack                                            |
|       |   pop()   | removes the node at the "top" of the stack and return that node's value (return null if there is no node at the top)         |
|       |  peek()   | returns the value of the node at the "top" of the stack (returns null if there is no node at the top)                        |
| Queue | enqueue() | creates and adds a new node with a user specified value to the "back" of the queue                                           |
|       | dequeue() | removes the node from the "front" of the queue and returns that node's value (returns null if there is no node at the front) |
|       |  peek()   | returns the value of the node at the "front" of the queue (return null if there is no node at the front)                     |