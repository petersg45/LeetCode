package FindFirstLastOccuranceInSortedArray;

import java.util.Arrays;

class FindFirstLastOccuranceInSortedArray {
	/*
	 * 
	 * 	Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.
		If target is not found in the array, return [-1, -1].
		You must write an algorithm with O(log n) runtime complexity.
	 *
	 *
	 */

	public int[] searchRange(int[] nums, int target) {
	
		 int[] result = new int[]{-1, -1};

		    // ----- Find first occurrence -----
		    int left = 0, right = nums.length - 1;
		    while (left <= right) {
		        int mid = left + (right - left) / 2;

		        if (nums[mid] >= target) {
		            right = mid - 1;
		        } else {
		            left = mid + 1;
		        }

		        if (nums[mid] == target) {
		            result[0] = mid;   // store first index
		        }
		    }

		    // ----- Find last occurrence -----
		    left = 0;
		    right = nums.length - 1;
		    while (left <= right) {
		        int mid = left + (right - left) / 2;

		        if (nums[mid] <= target) {
		            left = mid + 1;
		        } else {
		            right = mid - 1;
		        }

		        if (nums[mid] == target) {
		            result[1] = mid;   // store last index
		        }
		    }

		    return result;
		}



	public static void main(String[] args) {
		

		FindFirstLastOccuranceInSortedArray arr = new FindFirstLastOccuranceInSortedArray();
		 int[] test = new int[]{5,7,7,8,8,10};
		System.out.println(Arrays.toString(arr.searchRange(test,8)));



	}
}