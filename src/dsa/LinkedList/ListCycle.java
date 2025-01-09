package dsa.LinkedList;
/*
 * List Cycle
Problem Description

Given a linked list, return the node where the cycle begins. If there is no cycle, return null.

Try solving it using constant additional space.

 

Constraints:

0 <= size of linked list <= 106
1 <= value of nodes <= 109

 

Example:

Input: 

                  ______
                 |     |
                 \/    |
        1 -> 2 -> 3 -> 4

Return the node corresponding to node 3. 
 */
public class ListCycle {
	/**
	 * Definition for singly-linked list.
	 * class ListNode {
	 *     public int val;
	 *     public ListNode next;
	 *     ListNode(int x) { val = x; next = null; }
	 * }
	 */
	
		public ListNode detectCycle(ListNode a) {
	        ListNode slow = a, fast = a;
	        while(fast!=null && fast.next!=null){
	            slow = slow.next;
	            fast = fast.next.next;
	            if(slow==fast){
	              ListNode start = a;
	              while(start!=slow){
	                start = start.next;
	                slow = slow.next;
	              }
	              return start;
	            }
	            
	        }
	    return null;
		}
	

}
