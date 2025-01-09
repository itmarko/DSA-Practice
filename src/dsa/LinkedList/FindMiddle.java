package dsa.LinkedList;

import java.util.Scanner;

/*										Find Middle of the Linked List
 * ================================================================================================
 * 		Given head of the linked List. Find the middle Node.
 * 		Note -> if there are two middle node return the first one.
 * 
 * 		Sample input 
 * 		10->12->23->2->15->9->6->21->Null
 * 		Sample output
 */

public class FindMiddle {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		// Ask user for the number of nodes in the linked list
		System.out.print("Enter the number of nodes in the linked list: ");
		int n = scanner.nextInt();

		// Edge case if the user enters 0 (empty list)
		if (n == 0) {
			System.out.println("The list is empty.");
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
		int reversedHead = middleNode(head);

		System.out.println("\nmiddle Linked List:");
		System.out.println(reversedHead);
//		print(reversedHead); // Print reversed list
		scanner.close();
	}

	public static void print(ListNode head) {
		ListNode temp = head;
		while (temp != null) {
			System.out.print(temp.val + " ");
			temp = temp.next;
		}
	}

	public static int middleNode(ListNode head) {
		ListNode slow = head;
		ListNode fast = head;
		while (fast.next != null && fast.next.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}

		return slow.val;
	}
}
