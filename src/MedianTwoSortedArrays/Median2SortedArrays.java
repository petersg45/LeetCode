package MedianTwoSortedArrays;

import java.util.Arrays;

public class Median2SortedArrays {

	public double findMedianSortedArrays(int[] nums1, int[] nums2) {
	       int[] result = new int[nums1.length + nums2.length];

		    System.arraycopy(nums1, 0, result, 0, nums1.length);
		    System.arraycopy(nums2, 0, result, nums1.length, nums2.length);
		 // Sort the merged array
		    Arrays.sort(result);
	        int mid = (result.length) / 2;
	        
	        if(result.length % 2 == 0) {
	            return (((double)result[mid-1] + (double)result[mid])/2) ;
	        } else {
	            return (double)result[mid];
	        } 
	    }
	
	
	public static void main(String[] args) {
//	    int[] n = {1, 2};
//	    int[] m = {3, 4};
		 int[] n = {1, 3};
		 int[] m = {2};
		 
	    Median2SortedArrays median2SortedArrays = new Median2SortedArrays();
	    
	    System.out.println(median2SortedArrays.findMedianSortedArrays(n,m));
	    
/*	    int[] result = new int[n.length + m.length];

	    System.arraycopy(n, 0, result, 0, n.length);
	    System.arraycopy(m, 0, result, n.length, m.length);
	 // Sort the merged array
	    Arrays.sort(result);
	    
	    System.out.println("Merge array = " + Arrays.toString(result));

	    if(result.length % 2 == 0) {
	    	System.out.println("Array is even number");
	    	int mid = (result.length) / 2;
	    	System.out.println("med==="+ mid);
	    	System.out.println(("med==="+ ((double)result[mid-1] + (double)result[mid])/2) );
	    	
	    }else {
	    	System.out.println("Array is Odd number");
	    	//Get the mid of array and thats median as a Double
	    	System.out.println("length==="+  result.length);
	    	int mid = (result.length) / 2;
	    	System.out.println("med==="+ (double)result[mid]);
	    }
*/	    
	}
}
