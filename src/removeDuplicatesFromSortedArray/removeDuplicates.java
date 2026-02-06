package removeDuplicatesFromSortedArray;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class removeDuplicates {

	public static int removeDuplicates(int[] nums) {
	    Set<Integer> set = new HashSet<>();
	
	    for (int num : nums) {
	        set.add(num); // duplicates automatically ignored
	    }
	    
	    
	    System.out.println(set.size() + " nums = "+set.toString());
	    return set.size();
	}
	
	public static void main(String[] args) {
	    int[] n = {1, 2, 2, 3, 4, 4, 5};
	    removeDuplicates(n);
	    int[] nums = {1,1,2};
	    removeDuplicates(nums);
	
	    
	}


}