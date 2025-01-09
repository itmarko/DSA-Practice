package dsa.LinkedList;

import java.util.Scanner;

/* 									Check Linked List is palindrome or not 
 * ===============================================================================================
 * 							Given a single Linked List. Determine if it is a palindrome
 * 
 * 							Sample input 
 * 							1->2->3->2->1->NULL 
 * 							Sample output
 * 							True
 */
public class LinklistPalindrome {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		// Ask user for the number of nodes in the linked list
		System.out.print("Enter the number of nodes in the linked list: ");
		int n = scanner.nextInt();

		// Edge case if the user enters 0 (empty list)
		if (n == 0) {
			System.out.println("The list is empty.");
			scanner.close();
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

//		System.out.println("Original Linked List:");
//		print(head); // Print original list

		// Reverse the linked list
		boolean reversedHead = isPalindrome(head);

		System.out.println("\nmiddle Linked List:");
		System.out.println(reversedHead);
//		print(reversedHead); // Print reversed list
		scanner.close();
	}

	public static boolean isPalindrome(ListNode head) {
		if (head == null || head.next == null) {
			return true;
		}
		ListNode slow = head;
		ListNode fast = head;
		while (fast != null && fast.next!= null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		ListNode secound = reverse(slow.next);
		ListNode first = head;
		while (first != null && secound != null) {
			if (first.val != secound.val) {
				return false;
			}
			first = first.next;
			secound = secound.next;
		}
		return true;
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
