package org.howard.edu.lsp.midterm.question4;

import java.util.HashMap;

/**
 * The MapUtilities class provides methods for operations on HashMaps.
 * Specifically, it includes functionality to determine the number of common key/value pairs between two HashMaps.
 */
public class MapUtilities {
    /**
     * Counts the number of common key/value pairs between two HashMaps.
     * 
     * @param map1, the first HashMap
     * @param map2, the second HashMap
     * @return the number of common key/value pairs
     * referenced this: https://sentry.io/answers/iterate-hashmap-java/
     */
    public static int commonKeyValuePairs(HashMap<String, String> map1, HashMap<String, String> map2) {
        // Check if either map is empty
        if (map1.isEmpty() || map2.isEmpty()) {
            return 0;
        }

        int count = 0;

        // Iterate through the entries of the first map
        for (HashMap.Entry<String, String> entry : map1.entrySet()) {
            // Check if the second map contains the same key and value
            if (map2.containsKey(entry.getKey()) && map2.get(entry.getKey()).equals(entry.getValue())) {
                count++;
            }
        }

        return count;
    }
}
