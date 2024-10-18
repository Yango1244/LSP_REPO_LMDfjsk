// n

package org.howard.edu.lsp.midterm.question4;

import java.util.HashMap;

public class MapUtilities {
	
	/**
     * Returns the number of common key/value pairs between two HashMaps.
     *
     * @param map1 the first HashMap
     * @param map2 the second HashMap
     * @return number of key and values that are common
     */
    public static int commonKeyValuePairs(HashMap<String, String> map1, HashMap<String, String> map2) {
        int total = 0;

        for (String key : map1.keySet()) {
            if (map2.containsKey(key) && map1.get(key).equals(map2.get(key))) {
                total = total + 1;
            }
        }
        return total;
    }

}
