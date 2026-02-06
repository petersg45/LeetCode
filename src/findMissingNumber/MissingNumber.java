package findMissingNumber;

public class MissingNumber {

    public static int findMissing(int[] arr, int n) {
 
        int sum = n * (n + 1) / 2;
        System.out.println("sum = "+sum);
        // Find maximum — this will be N
        
        
        
        for (int num : arr) {
            sum -= num;
        }
        	System.out.println("What sum really is by adding number up="+sum);
        return sum;
    }
    
    public static int findMax (int[] arr ) {
    	int max =0;
    	for (int num : arr) {
            if (num > max) {
                max = num;
            }
            System.out.println("Max number (n) =" + max);
        }
    	return max;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 9};  
     
		

        System.out.println("Missing number: " + findMissing(nums, findMax(nums)));
        // Output: Missing number: 3
    }
}

