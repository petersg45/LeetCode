package LetterCominationsOfAPhoneNumber;

import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
Given a string containing digits from 2-9 inclusive, return all possible letter combinations that the number could represent. Return the answer in any order.

A mapping of digits to letters (just like on the telephone buttons) is given below. Note that 1 does not map to any letters.


 "abc","def","ghi","jkl","mno","pqrs","tuv","wxyz",""

Example 1:

Input: digits = "23"
Output: ["ad","ae","af","bd","be","bf","cd","ce","cf"]
Example 2:

Input: digits = "2"
Output: ["a","b","c"]


Constraints:

1 <= digits.length <= 4
digits[i] is a digit in the range ['2', '9'].

 */

class Solution {
	public List<String> letterCombinations(String digits) {
	    if (digits == null || digits.length() == 0) return List.of();

	    Map<Character, String> map = Map.of(
	        '2', "abc",
	        '3', "def",
	        '4', "ghi",
	        '5', "jkl",
	        '6', "mno",
	        '7', "pqrs",
	        '8', "tuv",
	        '9', "wxyz"
	    );

	    List<String> result = new ArrayList<>();
	    result.add(""); // start with empty prefix

	    for (char digit : digits.toCharArray()) {
	        String letters = map.get(digit);
	        List<String> next = new ArrayList<>();

	        for (String prefix : result) {
	            for (char c : letters.toCharArray()) {
	                next.add(prefix + c);
	            }
	        }

	        result = next;
	    }

	    return result;
	

	}

	public static void main (String[]	args) {
		Solution solution = new Solution();

		String digits1 = "23";
		System.out.println(solution.letterCombinations(digits1)); // Output:
		// ["ad","ae","af","bd","be","bf","cd","ce","cf"]

		String digits2 = "2";
		System.out.println(solution.letterCombinations(digits2)); // Output: ["a","b","c"]
	}
}