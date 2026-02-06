package ThreeSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class ThreeSum {
	/*
	 * Constraints:
	   3 <= nums.length <= 3000
       -10to the 5th <= nums[i] <= 10 to the 5th
	 */

	public List<List<Integer>> threeSum(int[] nums) {

	    // --- Constraint checks ---
	    if (nums.length < 3 || nums.length > 3000) {
	        throw new IllegalArgumentException("nums.length must be between 3 and 3000");
	    }

	    for (int n : nums) {
	        if (n < -100000 || n > 100000) {
	            throw new IllegalArgumentException("nums[i] must be between -10^5 and 10^5");
	        }
	    }
	    // --- End constraints ---

	    List<List<Integer>> result = new ArrayList<>();

	    // Sort first (required for two-pointer logic)
	    Arrays.sort(nums);

	    for (int i = 0; i < nums.length - 2; i++) {

	        // Skip duplicate values for i
	        if (i > 0 && nums[i] == nums[i - 1]) continue;

	        int left = i + 1;
	        int right = nums.length - 1;

	        while (left < right) {
	            int sum = nums[i] + nums[left] + nums[right];

	            if (sum == 0) {
	                result.add(Arrays.asList(nums[i], nums[left], nums[right]));

	                // Skip duplicates for left
	                while (left < right && nums[left] == nums[left + 1]) left++;

	                // Skip duplicates for right
	                while (left < right && nums[right] == nums[right - 1]) right--;

	                left++;
	                right--;
	            }
	            else if (sum < 0) {
	                left++;
	            }
	            else {
	                right--;
	            }
	        }
	    }

	    return result;
	}


	public static void main(String[] args) {


		int[] numsArr = {-1,0,1,2,-1,-4};

		ThreeSum threeSum = new ThreeSum();
		List<List<Integer>> result= threeSum.threeSum(numsArr);
		System.out.println(result);

		int[] numsArr2 = {0,1,1};
		List<List<Integer>> result2= threeSum.threeSum(numsArr2);
		System.out.println(result2);

		int[] numsArr3 = {0,0,0};
		List<List<Integer>> result3= threeSum.threeSum(numsArr3);
		System.out.println(result3);
		
		
		//[1,2,-2,-1]
		System.out.println("----------------------------------------------");
		System.out.println("EXAMPLE 4");
		int[] numsArr4 = {1,2,-2,-1};
		List<List<Integer>> result4= threeSum.threeSum(numsArr4);
		System.out.println(result4);
	}



}