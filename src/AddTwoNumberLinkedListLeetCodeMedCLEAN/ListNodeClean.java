package AddTwoNumberLinkedListLeetCodeMedCLEAN;

/**
 * Definition for singly-linked list.
 */

public class ListNodeClean {
	int val;
	ListNodeClean next;
	ListNodeClean(int x) { val = x; }

}




class Solution {
	public ListNodeClean addTwoNumbers(ListNodeClean l1, ListNodeClean l2) {
		ListNodeClean dummy = new ListNodeClean(0);
		ListNodeClean current = dummy;

		int carry = 0;

		while (l1 != null || l2 != null || carry != 0) {
			int x = (l1 != null) ? l1.val : 0;
			int y = (l2 != null) ? l2.val : 0;

			int sum = x + y + carry;
			carry = sum / 10;

			current.next = new ListNodeClean(sum % 10);
			current = current.next;

			if (l1 != null) l1 = l1.next;
			if (l2 != null) l2 = l2.next;
		}

		return dummy.next;
	}

	public static void main(String[] args) {
		// Build first list: [2,4,3]
		ListNodeClean l1 = new ListNodeClean(2);
		l1.next = new ListNodeClean(4);
		l1.next.next = new ListNodeClean(3);

		// Build second list: [5,6,4]
		ListNodeClean l2 = new ListNodeClean(5);
		l2.next = new ListNodeClean(6);
		l2.next.next = new ListNodeClean(4);

		Solution sol = new Solution();
		ListNodeClean result = sol.addTwoNumbers(l1, l2);

		// Print result list
		printList(result);

		//Example 2:
		//Input: l1 = [0], l2 = [0]
		//Output: [0]
		l1 = new ListNodeClean(0);
		l2 = new ListNodeClean(0);
		sol = new Solution();
		result = sol.addTwoNumbers(l1, l2);

		// Print result list
		printList(result);
		//Example 3:
		//Input: l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
		//Output: [8,9,9,9,0,0,0,1]

		l1 = new ListNodeClean(9);
		l1.next = new ListNodeClean(9);
		l1.next.next = new ListNodeClean(9);
		l1.next.next.next = new ListNodeClean(9);
		l1.next.next.next.next = new ListNodeClean(9);
		l1.next.next.next.next.next = new ListNodeClean(9);
		l1.next.next.next.next.next.next = new ListNodeClean(9);

		l2 = new ListNodeClean(9);
		l2.next = new ListNodeClean(9);
		l2.next.next = new ListNodeClean(9);
		
		sol = new Solution();
		result = sol.addTwoNumbers(l1, l2);
		// Print result list
		printList(result);






	}

	private static void printList(ListNodeClean node) {
		while (node != null) {
			System.out.print(node.val);
			if (node.next != null) System.out.print(" -> ");
			node = node.next;
		}
		System.out.println();
	}

}