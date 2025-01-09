package dsa.LinkedList;

import java.util.Scanner;



public class ReverseNode {
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

        // Reverse the linked list
        ListNode reversedHead = kReverse(head, 3);

        System.out.println("Reversed Linked List:");
        print(reversedHead); // Print reversed list
        scanner.close();
    }

    public static ListNode kReverse(ListNode head, int k) {
        if (k <= 1 || head == null) {
            return head;
        }

        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode pointer = dummy;

        while (pointer != null) {
            // check if there are k nodes available or not
            ListNode node = pointer;
            for (int i = 0; i < k && node != null; i++) {
                node = node.next;
            }
            if (node == null) {
                // there are less than k nodes available
                break;
            }

            // reverse k nodes
            ListNode prev = null, curr = pointer.next;
            for (int i = 0; i < k; i++) {
                ListNode next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }

            ListNode tail = pointer.next;
            pointer.next = prev;
            tail.next = curr;
            pointer = tail;
        }
        return dummy.next;
    }

    public static void print(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " -> ");
            current = current.next;
        }
        
    }
}
