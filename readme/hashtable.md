# Hashtables
Learning a new data structure: Hash Tables.

## Challenge
Implement a Hashtable with the following capabilities:
* A method/function that takes in both the key and value. This method should hash the key and add the key and value pair to the table.
* A method/function that takes in the key and returns the value from key/value pair.
* A method/function that takes in the key and returns if the key exists in the table already.
* A method/function that takes in a key and returns the index in the array the key is stored.

## Approach & Efficiency
Each Hashtable has an array of Linked Lists that store key/value pairs.
* add()
  * O(1) time - inserts are immediate (in theory)
  * O(1) space - Creates one new Node each time
* find()
  * O(1) time - lookups are immediate (in theory)
  * O(1) space - no variables created
* contains()
  * O(1) time - lookups are immediate (in theory)
  * O(1) space - no variables created
* getHash()
  * O(n) time - looping through a string
  * O(1) space - creates only one variable


## API
|   Class   |    Methods    |                            Method Description                                          |
|-----------|---------------|----------------------------------------------------------------------------------------|
| Hashtable |add(key, value)| Adds a node containing the key/value pair in the Hashtable                             |
|           |   find(key)   | Returns the value associated with key if it is in the Hashtable, otherwise return null |
|           | contains(key) | Returns true if the key is in the Hashtable, otherwise returns false                   |
|           | getHash(key)  | Hashes the key and returns an int                                                      |
