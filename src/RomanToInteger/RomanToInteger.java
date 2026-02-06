package RomanToInteger;

import java.util.HashMap;

public class RomanToInteger {

	public static int romanToInt(String s) {

		/*
		 * Symbol Value I 1 V 5 X 10 L 50 C 100 D 500 M 1000
		 * 
		 * I can be placed before V (5) and X (10) to make 4 and 9. X can be placed
		 * before L (50) and C (100) to make 40 and 90. C can be placed before D (500)
		 * and M (1000) to make 400 and 900.
		 * 
		 */

		HashMap<Character, Integer> romanMap = new HashMap<>();
		romanMap.put('I', 1);
		romanMap.put('V', 5);
		romanMap.put('X', 10);
		romanMap.put('L', 50);
		romanMap.put('C', 100);
		romanMap.put('D', 500);
		romanMap.put('M', 1000);

		int next = 0;
		int total = 0;

		System.out.println("NUMBER length = " + s.length());
		for (int curr = 0; curr <= s.length() - 1; curr++) {

			System.out.println("curr====> " + curr);
			next = curr + 1;
			int currVal = romanMap.get(s.charAt(curr));
			System.out.println("Current Char: " + s.charAt(curr) + " Value: " + currVal);
			try {
				System.out.println("Next Char: " + s.charAt(next) + " Value: " + romanMap.get(s.charAt(next)));

				int nextVal = romanMap.get(s.charAt(next));
				System.out.println("Next Char: " + s.charAt(next) + " Value: " + nextVal);
				if (nextVal <= currVal) {
					total += (currVal);
					System.out.println("Current Total: " + total + "\n");
				} else {
					total = total + (nextVal - currVal);
					System.out.println("IN ELSE Current Total: " + total);
					curr++;
				}

			} catch (Exception e) {
				total += (currVal);
				System.out.println("Current Total: " + total + "\n");
				System.out.println("Next Char: NULL");
				
			}

		}
		return total;

	}

	public static void main(String[] args) {
		String romanNumeral = "";

		romanNumeral = "MCM"; // Example input
		System.out.println("\n\n\n This is Roman NUmber ===>" + romanNumeral);
		romanToInt(romanNumeral);
		System.out.println("-------------------------");
		romanNumeral = "III"; // Example input
		System.out.println("\n\n\n This is Roman NUmber ===>" + romanNumeral);
		romanToInt(romanNumeral);

		System.out.println("-------------------------");
		
		
		romanNumeral =  "LVIII";
		System.out.println("\n\n\n This is Roman NUmber ===>" + romanNumeral);
		romanToInt(romanNumeral);
		
System.out.println("-------------------------");
		
		
		romanNumeral =  "LVIII";
		System.out.println("\n\n\n This is Roman NUmber ===>" + romanNumeral);
		romanToInt(romanNumeral);
		

	}

}