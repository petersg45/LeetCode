package palindrome;

public class StringsUtils {

    public static String reverse(String s) {
        return new StringBuilder(s).reverse().toString();
    }
    
    public static boolean isPalindrome(String s) {
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
        System.out.println(reverse("hello"));  // olleh
        System.out.println(reverse("Java"));   // avaJ
        
        //Palindrome
        System.out.println("is racecar a palindrome? " +isPalindrome("racecar")); // true
        System.out.println("is level a palindrome? " +isPalindrome("level"));   // true
        System.out.println("is hello a palindrome? " +isPalindrome("hello"));   // false
     
        System.out.println("is radar a palindrome using 2 pointers method? " +isPalindromeTwoPointers("radar")); // true
    }
}

