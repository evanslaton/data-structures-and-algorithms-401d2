package hashtable;

public class Hashtable<T> {
    private int DEFAULT_CAPACITY;
    protected LinkedList[] table;

    // Constructor if the user wants to use the hard-coded default capacity
    public Hashtable() {
        this.DEFAULT_CAPACITY = 10;
        this.table = new LinkedList[DEFAULT_CAPACITY];
        Hashtable.addLinkedListsToTable(this.table);
    }

    // Constructor if the user wants to specify their own default capacity
    public Hashtable(int DEFAULT_CAPACITY) {
        this.DEFAULT_CAPACITY = DEFAULT_CAPACITY;
        this.table = new LinkedList[DEFAULT_CAPACITY];
        Hashtable.addLinkedListsToTable(this.table);
    }

    protected static void addLinkedListsToTable(LinkedList[] table) {
        for (int i = 0; i < table.length; i++) {
            table[i] = new LinkedList();
        }
    }

    // Adds a node containing a key/value pair to the HashTable
    public void add(String key, T value) {
        int hashedKey = this.getHash(key);
        this.table[hashedKey].append(key, value);
    }

    // Adds a node containing a key/value pair to the HashTable
    public T find(String key) {
        int hashedKey = this.getHash(key);
        return (T) this.table[hashedKey].findValue(key);
    }

    // Returns true if the input key exists in the Hashtable
    public boolean contains(String key) {
        int hashedKey = this.getHash(key);
        return this.table[hashedKey].includes(key);
    }

    // Hashes the key
    protected int getHash(String key) {
        int hash = 0;
        for (int i = 0; i < key.length(); i++) {
            hash += key.charAt(i);
        }
        return hash % DEFAULT_CAPACITY;
    }



}
