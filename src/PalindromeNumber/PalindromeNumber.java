package PalindromeNumber;

public class PalindromeNumber {

    public static String reverse(String s) {
        return new StringBuilder(s).reverse().toString();
    }
    
    public static boolean isPalindrome(int x) {
    	String s = String.valueOf(x);
        return s.equals(new StringBuilder(s).reverse().toString());
    }
    
    public static boolean isPalindromeTwoPointers(String s) {
        int left = 0, right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    
    public static void main(String[] args) {
   
        
        //Palindrome
        System.out.println("is 121 a palindrome? " +isPalindrome(121)); // true
        System.out.println("is -121 a palindrome? " +isPalindrome(-121));   // false
        System.out.println("is 10 a palindrome? " +isPalindrome(10));   // false
     
        System.out.println("is 121 a palindrome using 2 pointers method? " +isPalindromeTwoPointers("121")); // true
    }
}

