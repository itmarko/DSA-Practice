package dsa.LinkedListOperations;

public class InsertNode {

	// Insert at head
	ListNode insertAtHead(ListNode head, int data) {
		ListNode temp = new ListNode(data);
		temp.next = head;
		return temp; // Return the new head
	}

	// Insert at a specific position
	ListNode insertAtPosition(ListNode head, int position, int data) {
		ListNode temp = head;
		int count = 1;
		while (count < position - 1 && temp != null) {
			temp = temp.next;
			count++;
		}

		// Edge case for invalid position
		if (temp == null) {
			System.out.println("Invalid position");
			return head;
		}

		ListNode nodeToInsert = new ListNode(data);
		nodeToInsert.next = temp.next;
		temp.next = nodeToInsert;

		return head;
	}

	// Insert at the tail
	ListNode insertAtTail(ListNode tail, int data) {
		ListNode temp = new ListNode(data);
		tail.next = temp;
		return temp; // Return the new tail
	}

	// Print the list
	void printList(ListNode head) {
		ListNode current = head;
		while (current != null) {
			System.out.print(current.data + "->");
			current = current.next;
		}
		System.out.println("Null");
	}

	 ListNode deleteNode(ListNode head, int position) {
		if(head==null && position <=0) {
			return head;
		}
		
		if(position ==1) {
			head = head.next;
			return head;
		}
		ListNode curr =head;
		int count = 1; // count = count
		while(count<position-1) {
			curr = curr.next;
			count++;
		}
		curr.next=curr.next.next;
		return head;
		
		
	}

	public static void main(String[] args) {
		InsertNode obj = new InsertNode();

		// Create an empty linked list
		ListNode head = null;

		// Insert elements
		head = obj.insertAtHead(head, 10); // Insert at head: 10
		head = obj.insertAtHead(head, 20); // Insert at head: 20

		ListNode tail = head; // Keep track of the tail for insertion at tail
		while (tail.next != null) {
			tail = tail.next;
		}

		tail = obj.insertAtTail(tail, 30); // Insert at tail: 30
		head = obj.insertAtPosition(head, 2, 25); // Insert at position 2: 25
		obj.printList(head);
		head = obj.deleteNode(head, 4);

		// Print the final list
		obj.printList(head);
	}
}
