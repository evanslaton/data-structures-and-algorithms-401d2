package hashtable;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;

import static org.junit.Assert.*;

public class LeftJoinTest {

    @Test
    public void testLeftJoin() {
        HashMap<String, String> h1 = new HashMap<>();
        h1.put("fond", "enamored");
        h1.put("wrath", "anger");
        h1.put("diligent", "employed");
        h1.put("outfit", "garb");
        h1.put("guide", "usher");

        HashMap<String, String> h2 = new HashMap<>();
        h2.put("fond", "averse");
        h2.put("wrath", "delight");
        h2.put("diligent", "idle");
        h2.put("guide", "follow");
        h2.put("flow", "jam");

        String[] a = {"enamored", "averse"};
        String[] a1 = {"anger", "delight"};
        String[] a2 = {"employed", "idle"};
        String[] a3 = {"garb", null};
        String[] a4 = {"usher", "follow"};

        HashMap<String, String[]> h3 = new HashMap<>();
        h3 = LeftJoin.leftJoin(h1, h2);
        assertEquals(5, h3.size());
        assertFalse(h3.containsKey("flow"));
        assertArrayEquals(a, h3.get("fond"));
        assertArrayEquals(a1, h3.get("wrath"));
        assertArrayEquals(a2, h3.get("diligent"));
        assertArrayEquals(a3, h3.get("outfit"));
        assertArrayEquals(a4, h3.get("guide"));
    }
}