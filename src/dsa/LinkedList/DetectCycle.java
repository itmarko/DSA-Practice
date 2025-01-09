package dsa.LinkedList;

import java.util.Scanner;
/**
 * this class is used for demo of detect cle of a linked list 
 * @author MARKO
 */
/*							Detect Cycle in Linked List 
 * =========================================================================================
 * 				Given a linked list. determine if the linked list has cycle in it.
 * 
 * 				Sample input 
 * 			           ----
 * 				   	   |  |
 * 			     	  \/  |
 * 				1->2->3->4
 * 				Sample output 
 * 				True 
 * 				Time Complexity TC = O(n)
 * 				Space complexity SC = O(1)
 * 	
 */

public class DetectCycle {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		System.out.println("Please enter the number of node");
		int n = scn.nextInt();
		ListNode head = new ListNode(scn.nextInt());
		ListNode temp = head;
		ListNode temp1 = head, temp2 = head;
		while (n-- > 1) {
			temp.next = new ListNode(scn.nextInt());
			temp = temp.next;
			if (n == 4) {
				temp1 = temp;

			}
			temp2 = temp;
		}
		temp2.next = temp1;
		System.out.println("Cycle detected True or false");
		System.out.println(hasCycle(head));
		scn.close();
	}

	public static boolean hasCycle(ListNode head) {
		ListNode slow = head, fast = head;
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if (slow == fast) {
				return true;
			}
		}
		return false;
	}
}
