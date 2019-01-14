package hashtable;

import org.junit.Test;

import static org.junit.Assert.*;

public class HashtableTest {

    @Test
    public void testAdd() {
        Hashtable h = new Hashtable();
        h.add("a", "Bucket 7");
        h.add("b", "Bucket 8");
        h.add("c", "Bucket 9");
        h.add("d", "Bucket 0");
        h.add("e", "Bucket 1");
        h.add("f", "Bucket 2");
        h.add("g", "Bucket 3");
        h.add("h", "Bucket 4");
        h.add("i", "Bucket 5");
        h.add("j", "Bucket 6");

        assertEquals("Bucket 7", h.table[7].head.value);
        assertEquals("Bucket 8", h.table[8].head.value);
        assertEquals("Bucket 9", h.table[9].head.value);
        assertEquals("Bucket 0", h.table[0].head.value);
        assertEquals("Bucket 1", h.table[1].head.value);
        assertEquals("Bucket 2", h.table[2].head.value);
        assertEquals("Bucket 3", h.table[3].head.value);
        assertEquals("Bucket 4", h.table[4].head.value);
        assertEquals("Bucket 5", h.table[5].head.value);
        assertEquals("Bucket 6", h.table[6].head.value);

        // COLLISIONS
        h.add("k", "Also bucket 7");
        h.add("l", "Also bucket 8");
        h.add("m", "Also bucket 9");
        h.add("u", "Also bucket 7 again");
        assertEquals("Also bucket 7", h.table[7].head.next.value);
        assertEquals("Also bucket 8", h.table[8].head.next.value);
        assertEquals("Also bucket 9", h.table[9].head.next.value);
        assertEquals("Also bucket 7 again", h.table[7].head.next.next.value);

        // Making sure the collisions didn't change the first nodes in the LinkedList
        assertEquals("Bucket 7", h.table[7].head.value);
        assertEquals("Bucket 8", h.table[8].head.value);
        assertEquals("Bucket 9", h.table[9].head.value);
    }

    @Test
    public void testFind() {
        Hashtable h = new Hashtable();
        h.add("a", "Bucket 7");
        h.add("b", "Bucket 8");
        h.add("c", "Bucket 9");
        h.add("d", "Bucket 0");
        h.add("e", "Bucket 1");
        h.add("f", "Bucket 2");
        h.add("g", "Bucket 3");
        h.add("h", "Bucket 4");
        h.add("i", "Bucket 5");
        h.add("j", "Bucket 6");

        assertEquals("Bucket 7", h.find("a"));
        assertEquals("Bucket 8", h.find("b"));
        assertEquals("Bucket 9", h.find("c"));
        assertEquals("Bucket 0", h.find("d"));
        assertEquals("Bucket 1", h.find("e"));
        assertEquals("Bucket 2", h.find("f"));
        assertEquals("Bucket 3", h.find("g"));
        assertEquals("Bucket 4", h.find("h"));
        assertEquals("Bucket 5", h.find("i"));
        assertEquals("Bucket 6", h.find("j"));

        // COLLISIONS
        h.add("k", "Also bucket 7");
        h.add("l", "Also bucket 8");
        h.add("m", "Also bucket 9");
        h.add("u", "Also bucket 7 again");
        assertEquals("Also bucket 7", h.find("k"));
        assertEquals("Also bucket 8", h.find("l"));
        assertEquals("Also bucket 9", h.find("m"));
        assertEquals("Also bucket 7 again", h.find("u"));
    }

    @Test
    public void testContains() {
        Hashtable h = new Hashtable();
        h.add("a", "Bucket 7");
        h.add("b", "Bucket 8");
        h.add("c", "Bucket 9");
        h.add("d", "Bucket 0");
        h.add("e", "Bucket 1");
        h.add("f", "Bucket 2");
        h.add("g", "Bucket 3");
        h.add("h", "Bucket 4");
        h.add("i", "Bucket 5");
        h.add("j", "Bucket 6");

        assertTrue(h.contains("a"));
        assertTrue(h.contains("b"));
        assertTrue(h.contains("c"));
        assertTrue(h.contains("d"));
        assertTrue(h.contains("e"));
        assertTrue(h.contains("f"));
        assertTrue(h.contains("g"));
        assertTrue(h.contains("h"));
        assertTrue(h.contains("i"));
        assertTrue(h.contains("j"));

        // COLLISIONS
        h.add("k", "Also bucket 7");
        h.add("l", "Also bucket 8");
        h.add("m", "Also bucket 9");

        assertTrue(h.contains("k"));
        assertTrue(h.contains("l"));
        assertTrue(h.contains("m"));

        // Checking to see if keys that aren't in the Hashtable return false
        assertFalse(h.contains("A"));
        assertFalse(h.contains("B"));
        assertFalse(h.contains("n"));
        assertFalse(h.contains("o"));
        assertFalse(h.contains("p"));
        assertFalse(h.contains("banana"));
        assertFalse(h.contains("hello"));
        assertFalse(h.contains("Supercalifragilisticexpialidocious"));

    }

    @Test
    public void testGetHash() {
        Hashtable h = new Hashtable();

        assertTrue(h.getHash("a") == 7);
        assertTrue(h.getHash("b") == 8);
        assertTrue(h.getHash("c") == 9);
        assertTrue(h.getHash("d") == 0);
        assertTrue(h.getHash("e") == 1);
        assertTrue(h.getHash("f") == 2);
        assertTrue(h.getHash("g") == 3);
        assertTrue(h.getHash("h") == 4);
        assertTrue(h.getHash("i") == 5);
        assertTrue(h.getHash("j") == 6);
        assertTrue(h.getHash("A") == 5);
        assertTrue(h.getHash("B") == 6);
        assertTrue(h.getHash("5") == 3);
        assertTrue(h.getHash("banana") == 9);
        assertTrue(h.getHash("hello") == 2);
        assertTrue(h.getHash("Supercalifragilisticexpialidocious") == 1);
    }
}