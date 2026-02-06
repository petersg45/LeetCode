package removeDuplicates;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class removeDuplicates {

	public static List<Integer> removeDuplicates(int[] arr) {
	    Set<Integer> set = new HashSet<>();
	
	    for (int num : arr) {
	        set.add(num); // duplicates automatically ignored
	    }
	
	    return new ArrayList<>(set);
	}
	
	public static void main(String[] args) {
	    int[] arr = {1, 2, 2, 3, 4, 4, 5};
	
	    List<Integer> result = removeDuplicates(arr);
	
	    System.out.println(result);  // e.g. [1, 2, 3, 4, 5] (order not guaranteed)
	}


}