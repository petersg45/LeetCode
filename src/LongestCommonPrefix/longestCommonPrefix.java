package LongestCommonPrefix;

import java.util.concurrent.ConcurrentSkipListSet;

/*
 * Write a function to find the longest common prefix string amongst an array of strings.
	If there is no common prefix, return an empty string "".
	Example 1:
	Input: strs = ["flower","flow","flight"]
	Output: "fl"

	Example 2:
	Input: strs = ["dog","racecar","car"]
	Output: ""
	Explanation: There is no common prefix among the input strings.

	Constraints:
	1 <= strs.length <= 200
	0 <= strs[i].length <= 200
	strs[i] consists of only lowercase English letters if it is non-empty.
	
 */

class Solution {
    public String longestCommonPrefix(String[] strs) {
		if (strs == null || strs.length == 0 || strs.length > 200) {
			return "";
		}

		String prefix = strs[0];
		System.out.println("B4 FORprefix ="+ prefix);

		for (int i = 1; i < strs.length; i++) {
			if (strs[i] == null || strs[i].length() > 200) {
				return "";
			}
			System.out.println("b4 While strs ="+ strs[i]);
			while (strs[i].indexOf(prefix) != 0) {
				System.out.println("In While i ="+ i);
				System.out.println("strs[i].indexOf(prefix)==="+ strs[i].indexOf(prefix));
				prefix = prefix.substring(0, prefix.length() - 1);
				System.out.println("prefix ="+ prefix);
				if (prefix.isEmpty()) {
					return "";
				}
			}
		}

		return prefix;
    }
    	
    	
    
	public static void main(String[] args) {
		Solution sol = new Solution();
		String[] strs = { "flower", "flow", "flight" };
		String lcp = sol.longestCommonPrefix(strs);
		System.out.println("Longest Common Prefix: " + lcp); // Expected output: "fl"
	}
}