# Trees
First assignment regarding the tree data structure

## Challenge
* Create a Node class that has properties for the value stored in the node, the left child node, and the right child node.
* Create a BinaryTree class and define a method for each of the depth first traversals called preOrder, inOrder, and postOrder which returns an array of the values, ordered appropriately
* Create a BinarySearchTree class:
    * Define a method named add that accepts a value, and adds a new node with that value in the correct location in the binary search tree
    * Define a method named contains that accepts a value, and returns a boolean indicating whether or not the value is in the tree at least once

## Approach & Efficiency
I used recursion in each of the methods. Because the input of each method determines how much time and space the method uses, they are all O(n) for both space and time.

## API
|      Class       |   Methods    |                                    Method Description                                                   |
|------------------|--------------|---------------------------------------------------------------------------------------------------------|
| BinaryTree       |  preOrder()  | returns an array of the values in pre-order                                                             |
|                  |   inOrder()  | returns an array of the values in order                                                                 |
|                  |  postOrder() | returns an array of the values in post-order                                                            |
| BinarySearchTree |     add()    | accepts a value, and adds a new node with that value in the correct location in the binary search tree  |
|                  |  contains()  | accepts a value, and returns a boolean indicating whether or not the value is in the tree at least once |

## Notes
A special shoutout to https://www.baeldung.com/ for helping me wrap my head around recursion.