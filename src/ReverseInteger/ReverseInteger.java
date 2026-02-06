package ReverseInteger;


class ReverseInteger {
    public int reverse(int x) {
    	long reversed = 0;  // Use long instead of int
        
        while (x != 0) {
            reversed = reversed * 10 + x % 10;
            x /= 10;
        }
        
        // Check if reversed number is out of 32-bit range
        if (reversed > Integer.MAX_VALUE || reversed < Integer.MIN_VALUE) {
            return 0;
        }
        
        return (int) reversed;
    }
    
    
    public static void main(String[] args) {
  /*
   * Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go 
   * outside the signed 32-bit integer range [-231, 231 - 1], then return 0.
   * 
   * sume the environment does not allow you to store 64-bit integers (signed or unsigned).

 

	Example 1:
	
	Input: x = 123
	Output: 321
	Example 2:
	
	Input: x = -123
	Output: -321
	Example 3:
	
	Input: x = 120
	Output: 21
	
	constraints
	MIN and MAX values
	1534236469
 
   * 
   */
    	
    int x = 1534236469;	
    ReverseInteger rInteger = new ReverseInteger();
    System.out.println( rInteger.reverse(x));
    
   x = -123;	
   System.out.println( rInteger.reverse(x));
   
   x = 123;
   	System.out.println( rInteger.reverse(x));
	}
}