package hashtable;

import java.util.HashMap;

public class LeftJoin {
    public static HashMap<String, String[]> leftJoin(HashMap<String, String> h1, HashMap<String, String> h2) {
        HashMap<String, String[]> result = new HashMap<>();
        for (String key : h1.keySet()) {
            String[] s = new String[2];
            s[0] = h1.get(key);
            s[1] = h2.containsKey(key) ? h2.get(key) : null;
            result.put(key, s);
        }
        return result;
    }
}
