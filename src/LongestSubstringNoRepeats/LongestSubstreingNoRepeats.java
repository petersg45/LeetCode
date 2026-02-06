package LongestSubstringNoRepeats;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstreingNoRepeats {

	public int lengthOfLongestSubstring(String s) {
		Set<Character> charSet = new HashSet<>();
		int left = 0, maxLength = 0;

		for (int right = 0; right < s.length(); right++) {
			while (charSet.contains(s.charAt(right))) {
				System.out.println("Removing character: " + s.charAt(left));
				charSet.remove(s.charAt(left));
				left++;
			}
			charSet.add(s.charAt(right));
			System.out.println("Adding character: " + s.charAt(right));
			maxLength = Math.max(maxLength, right - left + 1);
		}
		return maxLength;
        
    }
    
  

    
    public static void main(String[] args) {
    	//LongestSubstreingNoRepeats lengthOfLongestSubstring = new LongestSubstreingNoRepeats();
    	LongestSubstreingNoRepeats l1 = new LongestSubstreingNoRepeats();
    	
    	
    	System.out.println("Length of Longest Substring without Repeating Characters = "+ l1.lengthOfLongestSubstring("abcabcbb")); // 3);
    	
    	//System.out.println("Length of Longest Substring without Repeating Characters= "+ l1.lengthOfLongestSubstring("bbbbb")); // 3);
    	
    	//System.out.println("Length of Longest Substring without Repeating Characters= "+ l1.lengthOfLongestSubstring("pwwkew")); // 3);
    }
}
