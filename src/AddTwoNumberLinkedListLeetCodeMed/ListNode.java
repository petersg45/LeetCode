package AddTwoNumberLinkedListLeetCodeMed;

/**
 * Definition for singly-linked list.
 */

public class ListNode {
	int val;
	ListNode next;

	ListNode() {
	}

	ListNode(int val) {
		this.val = val;
	}

	ListNode(int val, ListNode next) {
		this.val = val;
		this.next = next;
	}

}
/*
 * 2 -> 4 -> 3 5 -> 6 -> 4
 * 
 * 342 465 = 807 7 -> 0 -> 8
 * 
 * 
 * 
 * 
 * l1 = [9,9,9,9,9,9,9] l2 = [9,9,9,9] Output: [8,9,9,9,0,0,0,1]
 * 
 * 
 */

class AddTwoLinkedLists {

	// Function to reverse the linked list
	static ListNode reverse(ListNode head) {
		ListNode prev = null;
		ListNode curr = head;
		ListNode next;

		while (curr != null) {
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		return prev;
	}

	// Function to trim leading zeros in linked list
	static ListNode trimLeadingZeros(ListNode head) {
		while (head != null && head.val == 0) {
			head = head.next;
		}
		return head;
	}

	// Function to add two numbers represented by linked list
	static ListNode addTwoLists(ListNode num1, ListNode num2) {
		ListNode res = null;
		ListNode curr = null;
		int carry = 0;

		num1 = trimLeadingZeros(num1);
		num2 = trimLeadingZeros(num2);

		num1 = reverse(num1);
		num2 = reverse(num2);

		// Iterate till either num1 is not empty or num2 is
		// not empty or carry is greater than 0
		while (num1 != null || num2 != null || carry != 0) {
			int sum = carry;

			if (num1 != null) {
				sum += num1.val;
				num1 = num1.next;
			}

			if (num2 != null) {
				sum += num2.val;
				num2 = num2.next;
			}

			ListNode newListNode = new ListNode(sum % 10);

			carry = sum / 10;

			// If this is the first ListNode, then make this ListNode
			// as the head of the resultant linked list
			if (res == null) {
				res = newListNode;
				curr = newListNode;
			} else {

				// Append new ListNode to resultant linked list
				// and move to the next ListNode
				curr.next = newListNode;
				curr = curr.next;
			}
		}

		return reverse(res);
	}

	static void printList(ListNode head) {
		ListNode curr = head;
		while (curr != null) {
			System.out.print(curr.val);
			if (curr.next != null) {
				System.out.print(" -> ");
			}
			curr = curr.next;
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// Create l1: 2 -> 4 -> 3 (represents the number 342)
		// ListNodeClass l1 = new ListNodeClass(2, new ListNodeClass(4, new
		// ListNodeClass(3)));
		// Create l2: 5 -> 6 -> 4 (represents the number 465)
		// ListNodeClass l2 = new ListNodeClass(5, new ListNodeClass(6, new
		// ListNodeClass(4)));

		/*
		 * l1 = [9,9,9,9,9,9,9] l2 = [9,9,9,9] Output: [8,9,9,9,0,0,0,1]
		 */
		ListNode l1 = new ListNode(9);
		l1.next = new ListNode(9);
		l1.next.next = new ListNode(9);
		l1.next.next.next = new ListNode(9);
		l1.next.next.next.next = new ListNode(9);
		l1.next.next.next.next.next = new ListNode(9);
		l1.next.next.next.next.next.next = new ListNode(9);

		ListNode l2 = new ListNode(9);
		l2.next = new ListNode(9);
		l2.next.next = new ListNode(9);
		l2.next.next.next = new ListNode(9);

		ListNode sum = addTwoLists(l1, l2);
		printList(reverse(sum));
	}
}
