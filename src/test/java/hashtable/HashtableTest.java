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

        // Collisions
        h.add("k", "Also bucket 7");
        h.add("l", "Also bucket 8");
        h.add("m", "Also bucket 9");
        assertEquals("Also bucket 7", h.table[7].head.next.value);
        assertEquals("Also bucket 8", h.table[8].head.next.value);
        assertEquals("Also bucket 9", h.table[9].head.next.value);
    }

    @Test
    public void testFind() {
    }

    @Test
    public void testContains() {
    }

    @Test
    public void testGetHash() {
    }
}