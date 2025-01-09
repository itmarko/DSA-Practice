package dsa.LinkedList;

import java.util.Scanner;

/**
 * 								Reverse A Linked List 
 * =======================================================================================
 * 				Given the head of a single linked list. Reverse the
 * 				linked list in a single traversal.
 * 
 * 				Sample input: 1->2->3->4->5->NULL 
 * 				Sample Output: 5->4->3->2->1->NULL
 * 				Time complexity is O(N)
 * 				Space Complexity is O(1)
 */
class ListNode {
	public int val;
	public ListNode next;

	ListNode(int x) {
		val = x;
		next = null;
	}
}

public class ReverseLinkedList {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		// Ask user for the number of nodes in the linked list
		System.out.print("Enter the number of nodes in the linked list: ");
		int n = scanner.nextInt();

		// Edge case if the user enters 0 (empty list)
		if (n == 0) {
			System.out.println("The list is empty.");
			return;
		}

		// Create the linked list from user input
		System.out.println("Enter the values for the nodes:");
		ListNode head = new ListNode(scanner.nextInt());
		ListNode current = head;

		for (int i = 1; i < n; i++) {
			int val = scanner.nextInt();
			current.next = new ListNode(val);
			current = current.next;
		}

		System.out.println("Original Linked List:");
		print(head); // Print original list

		// Reverse the linked list
		ListNode reversedHead = reverse(head);

		System.out.println("\nReversed Linked List:");
		print(reversedHead); // Print reversed list
	}

	public static void print(ListNode head) {
		ListNode temp = head;
		while (temp != null) {
			System.out.print(temp.val + " ");
			temp = temp.next;
		}
	}

	public static ListNode reverse(ListNode head) {
		ListNode prev = null;
		ListNode curr = head;

		while (curr != null) {
			ListNode next = curr.next;
			curr.next = prev;
			// Move prev and curr
			prev = curr;
			curr = next;
		}
		return prev; 
	}
}
