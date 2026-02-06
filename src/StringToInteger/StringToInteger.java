package StringToInteger;

class StringToInteger {
	public int myAtoi(String s) {
        int i = 0;
        int n = s.length();
        
        // 1. Skip leading spaces
        while (i < n && s.charAt(i) == ' ') {
            i++;
        }

        // 2. Handle sign
        int sign = 1;
        if (i < n && (s.charAt(i) == '+' || s.charAt(i) == '-')) {
            if (s.charAt(i) == '-') sign = -1;
            i++;
        }

        // 3. Convert digits
        long result = 0;
        while (i < n && Character.isDigit(s.charAt(i))) {
            int digit = s.charAt(i) - '0';
            result = result * 10 + digit;

            // 4. Clamp on overflow
            if (sign == 1 && result > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }
            if (sign == -1 && -result < Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }

            i++;
        }

        return (int)(sign * result);
    }


	public static void main(String[] args) {
		/*
		 * Implement the myAtoi(string s) function, which converts a string to a 32-bit signed integer.

	The algorithm for myAtoi(string s) is as follows:

	Whitespace: Ignore any leading whitespace (" ").

	Signedness: Determine the sign by checking if the next character is '-' or '+', assuming positivity if neither present.

	Conversion: Read the integer by skipping leading zeros until a non-digit character is encountered or the end of 
	the string is reached. If no digits were read, then the result is 0.

	Rounding: If the integer is out of the 32-bit signed integer range [-231, 231 - 1], then round the integer to remain in the range. 
	Specifically, integers less than -231 should be rounded to -231, and integers greater than 231 - 1 should be rounded to 231 - 1.

	Return the integer as the final result.

	Example 1:
	Input: s = "42"
	Output: 42
	Explanation:
	The underlined characters are what is read in and the caret is the current reader position.
	Step 1: "42" (no characters read because there is no leading whitespace)
	Step 2: "42" (no characters read because there is neither a '-' nor '+')
	Step 3: "42" ("42" is read in)

	Example 2:
	Input: s = " -042"
	Output: -42
	Explanation:
	Step 1: "   -042" (leading whitespace is read and ignored)
	Step 2: "   -042" ('-' is read, so the result should be negative)
	Step 3: "   -042" ("042" is read in, leading zeros ignored in the result)

	Example 3:
	Input: s = "1337c0d3"
	Output: 1337
	Explanation:
	Step 1: "1337c0d3" (no characters read because there is no leading whitespace)
	Step 2: "1337c0d3" (no characters read because there is neither a '-' nor '+')
	Step 3: "1337c0d3" ("1337" is read in; reading stops because the next character is a non-digit)

	Example 4:
	Input: s = "0-1"
	Output: 0
	Explanation:
	Step 1: "0-1" (no characters read because there is no leading whitespace)
	Step 2: "0-1" (no characters read because there is neither a '-' nor '+')
	Step 3: "0-1" ("0" is read in; reading stops because the next character is a non-digit)

	Example 5:
	Input: s = "words and 987"
	Output: 0
	Explanation:
	Reading stops at the first non-digit character 'w'.
	Constraints:
	0 <= s.length <= 200
	s consists of English letters (lower-case and upper-case), digits (0-9), ' ', '+', '-', and '.'.

		 * 
		 */

		//EX 1
		StringToInteger stringToInteger = new StringToInteger();
		System.out.println("EXAMPLE1 - NUMBER===>   " + stringToInteger.myAtoi(" 42"));
		System.out.println("Expected Output: 42");
		System.out.println();
		//EX 2
		stringToInteger = new StringToInteger();
		System.out.println("EXAMPLE 2 - NUMBER===>   " + stringToInteger.myAtoi(" -042"));
		System.out.println("Expected Output: -42");
		System.out.println();
		//EX 3
		stringToInteger = new StringToInteger();
		System.out.println("EXAMPLE3 - NUMBER===>   " + stringToInteger.myAtoi("1337c0d3"));
		System.out.println("Expected Output: 1337");
		System.out.println();
		//EX 4
		stringToInteger = new StringToInteger();
		System.out.println("EXAMPLE 4 - NUMBER===>   " + stringToInteger.myAtoi("0-1"));
		System.out.println("Expected Output: 0");


		//2147483648 max +1
		//-2147483648 min -1 
		System.out.println();
		System.out.println();
		System.out.println();
		stringToInteger = new StringToInteger();
		System.out.println("EXAMPLE MAX+1 - NUMBER===>   " + stringToInteger.myAtoi("2147483648"));
		System.out.println("Expected Output: "+ Integer.MAX_VALUE);

		System.out.println();
		System.out.println();
		System.out.println();

		System.out.println("EXAMPLE MIN-1 NUMBER===>   " + stringToInteger.myAtoi("-2147483649"));
		System.out.println("Expected Output: "+ Integer.MIN_VALUE);

		System.out.println();
		System.out.println();
		System.out.println();

		//EX POS NUMBER +14
				stringToInteger = new StringToInteger();
				System.out.println("EXAMPLE POS +1 - NUMBER===>   " + stringToInteger.myAtoi("+1"));
				System.out.println("Expected Output: 1");

	}
}