package RomanToInteger;

import java.util.List;

public class IntegerToRoman {

	public String intToRoman(int num) {
		/*
		 * Roman numerals are formed by appending the conversions of decimal place values from highest to lowest. 
		 * Converting a decimal place value into a Roman numeral has the following rules:
		 * 
		 * If the value does not start with 4 or 9, select the symbol of the maximal value that can be subtracted from the input, 
		 * append that symbol to the result, subtract its value, and convert the remainder to a Roman numeral.
		 * 
		 * If the value starts with 4 or 9 use the subtractive form representing one symbol subtracted from the following symbol,
		 *  for example, 4 is 1 (I) less than 5 (V): IV and 9 is 1 (I) less than 10 (X): IX. Only the following subtractive 
		 *  forms are used: 4 (IV), 9 (IX), 40 (XL), 90 (XC), 400 (CD) and 900 (CM).
		 *  
		 *  Only powers of 10 (I, X, C, M) can be appended consecutively at most 3 times to represent multiples of 10. 
		 *  You cannot append 5 (V), 50 (L), or 500 (D) multiple times. If you need to append a symbol 4 times use the subtractive form.
		 *  
		 *  Given an integer, convert it to a Roman numeral.
		 *  
		 *  Constraints:1 <= num <= 3999
		 * 
		 */

		List <Integer> romanValues = List.of(1000,900,500,400,100,90,50,40,10,9,5,4,1);
		List <String> romanSymbols = List.of("M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I");
		
		String romanNumeral = "";
		
		//Has to be between 1 and 3999
		if( num < 1 || num > 3999) {
            return "INVALID INPUT";
        }
		
//		for each roman_value in descending order:
		for(Integer romanValue : romanValues) {
//		    while number is big enough:
			while ( num >= romanValues.get(romanValues.indexOf(romanValue))) {
//		        append roman_symbol
				romanNumeral += romanSymbols.get(romanValues.indexOf(romanValue));
//		        subtract roman_value
				num -= romanValues.get(romanValues.indexOf(romanValue));
			}
			
        }
		
		return romanNumeral;

	}

	public static void main(String[] args) {
		
		IntegerToRoman obj = new IntegerToRoman();
		int number = 3749; // Example input
		String romanNumeral = obj.intToRoman(number);
		System.out.println("ROMAN NUMERAL = " + romanNumeral);
		
		number = 58; // Example input
		romanNumeral = obj.intToRoman(number);
		System.out.println("ROMAN NUMERAL = " + romanNumeral);
		
		number = 1994; // Example input
		romanNumeral = obj.intToRoman(number);
		System.out.println("ROMAN NUMERAL = " + romanNumeral);
		
		number = -1994; // Example input
		romanNumeral = obj.intToRoman(number);
		System.out.println("ROMAN NUMERAL = " + romanNumeral);
		
		number = 11994; // Example input
		romanNumeral = obj.intToRoman(number);
		System.out.println("ROMAN NUMERAL = " + romanNumeral);
	}

}