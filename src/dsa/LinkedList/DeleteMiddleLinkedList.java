package dsa.LinkedList;

/*
 * Delete middle of the linked list
 * 
 * Given a Linked List, delete the middle node of the list and return the new head of the list.

For example, if the given list is 1->2->3->4->5, the returned linked list should be 1->2->4->5.

Note: If the given list contains 1 node, it should be deleted and new head must be returned. 
If the given list contains even number of nodes, delete the second middle node among both the middle nodes.
 For example, 1->2->3->4 shoud return 1->2->4.
 */
public class DeleteMiddleLinkedList {
	public ListNode solve(ListNode A) {
		if (A == null && A.next == null) {
			return null;
		}
		ListNode slow = A, fast = A;
		ListNode prev = null;

		while (fast != null && fast.next != null) {
			fast = fast.next.next;
			prev = slow;
			slow = slow.next;
		}
		if (prev != null) {
			prev.next = slow.next;
		}
		return A;
	}
}
