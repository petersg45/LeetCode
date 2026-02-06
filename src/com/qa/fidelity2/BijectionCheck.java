package com.qa.fidelity2;

import java.util.HashMap;
import java.util.Map;


/* check if two strings have a bijection mapping 
   (meaning every char in s1 maps to exactly one char in s2, 
	and no two chars map to the same char
*/


public class BijectionCheck {

    public static boolean isBijection(String s1, String s2) {

        // If lengths differ, cannot be bijection
        if (s1.length() != s2.length()) {
            return false;
        }

        Map<Character, Character> map = new HashMap<>();         // forward map
        Map<Character, Character> reverseMap = new HashMap<>();  // reverse map

        for (int i = 0; i < s1.length(); i++) {
            char c1 = s1.charAt(i);
            char c2 = s2.charAt(i);

            // If c1 already mapped, ensure consistency
            if (map.containsKey(c1)) {
                if (map.get(c1) != c2) {
                    return false;  // mismatch
                }
            } else {
                // If c2 already used by another character → violates bijection
                if (reverseMap.containsKey(c2)) {
                    return false;
                }

                // Create new mapping
                map.put(c1, c2);
                reverseMap.put(c2, c1);
            }
        }

        return true; // Passed all checks
    }

    public static void main(String[] args) {
        System.out.println(isBijection("egg", "foo"));   // true
        System.out.println(isBijection("ab", "cc"));     // false
        System.out.println(isBijection("paper", "title"));// true
        System.out.println(isBijection("hello", "world")); // false
    }
}

