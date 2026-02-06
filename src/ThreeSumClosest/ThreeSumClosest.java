package ThreeSumClosest;

import java.util.Arrays;

class Solution {
	
    public int threeSumClosest(int[] nums, int target) {
    	
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

		Arrays.sort(nums);
		int closestSum = nums[0] + nums[1] + nums[2];

		for (int i = 0; i < nums.length - 2; i++) {
			int left = i + 1;
			int right = nums.length - 1;

			while (left < right) {
				int currentSum = nums[i] + nums[left] + nums[right];

				if (Math.abs(currentSum - target) < Math.abs(closestSum - target)) {
					closestSum = currentSum;
				}

				if (currentSum < target) {
					left++;
				} else if (currentSum > target) {
					right--;
				} else {
					return currentSum; // Exact match found
				}
			}
		}
		return closestSum;
		
		 	  	
    }
        
    
	public static void main(String[] args) {
		Solution solution = new Solution();

		int[] nums1 = { -1, 2, 1, -4 };
		int target1 = 1;
		System.out.println(solution.threeSumClosest(nums1, target1)); // Output: 2

		int[] nums2 = { 0, 0, 0 };
		int target2 = 1;
		System.out.println(solution.threeSumClosest(nums2, target2)); // Output: 0
	}
}