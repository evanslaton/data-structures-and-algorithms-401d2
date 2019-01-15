package hashtable;

import java.util.HashSet;

public class RepeatedWord {
    public static String findRepeat(String str) {
        String[] words = str.toLowerCase()                   // Makes all characters lowercase
                .replaceAll("[^a-z ]", "")  // Removes special characters
                .split(" ");                           // Returns an array of words
        HashSet<String> seenWords = new HashSet<>();
        for (String word : words) {
            if (seenWords.contains(word)) {
                return word;
            } else {
                seenWords.add(word);
            }
        }
        return "No repeating words";
    }
}
