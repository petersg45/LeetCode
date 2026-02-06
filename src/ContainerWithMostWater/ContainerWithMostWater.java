package ContainerWithMostWater;

import java.util.Arrays;

class ContainerWithMostWater {
	/*
	 * 
	 * 	You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).
		Find two lines that together with the x-axis form a container, such that the container contains the most water.
		Return the maximum amount of water a container can store.
	 *
	 *
	 */

	public int maxArea(int[] height) {
		
		int maxArea = 0;

		int left = 0, right = height.length - 1;

		while( left < right) {
			
			int width = right - left;
			int	areaTemp =  Math.min(height[left], height[right]) * (right - left);	
			if (areaTemp > maxArea) {
	            maxArea = areaTemp;
	        }
			System.out.println("Initial area = "+maxArea);
			// Move the pointer at the shorter line
	        if (height[left] < height[right]) {
	            left++;
	        } else {
	            right--;
	        }
		}

		return maxArea;
	}



	public static void main(String[] args) {


		ContainerWithMostWater maxArea = new ContainerWithMostWater();
		
		System.out.println("EXAMPLE 1===="+maxArea.maxArea(new int[] {1,8,6,2,5,4,8,3,7}));
		System.out.println("EXAMPLE 2====="+maxArea.maxArea(new int[] {1,1,}));
		System.out.println("EXAMPLE 3====="+maxArea.maxArea(new int[] {1,1, 100,23,78,99,200
				}));
		
	}
}