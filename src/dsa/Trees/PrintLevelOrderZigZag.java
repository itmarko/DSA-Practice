package dsa.Trees;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;
/**
 * @author marko
 */

public class PrintLevelOrderZigZag {
    public static void main(String[] args) {
        // Array to create the desired binary tree structure
    	//Integer[] arr = {2, 7, 2, null,null,5, 6,null, null,11,null,null,5,null, 9,4,null, null, null};

    	Integer[] arr = {2, 7, 5, 2, 6, null, 9, null, null, 5, 11, 4};

        TreeNode root = construct(arr); 
        printLevelOrderZigzag(root);
    }

    // Method to construct a binary tree from an array representation
    public static TreeNode construct(Integer[] arr) {
        if (arr == null || arr.length == 0) {
            return null;
        }

        // Create the root of the tree
        TreeNode root = new TreeNode(arr[0]);
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);

        // Index to traverse the input array
        int i = 1;
        while (i < arr.length) {
            TreeNode current = queue.poll();

            // Left child
            if (arr[i] != null) {
                current.left = new TreeNode(arr[i]);
                queue.add(current.left);
            }
            i++;

            // Right child
            if (i < arr.length && arr[i] != null) {
                current.right = new TreeNode(arr[i]);
                queue.add(current.right);
            }
            i++;
        }

        return root;
    }

    // Level order traversal to print the tree
    public static void printLevelOrder(TreeNode root) {
        if (root == null) {
            System.out.println("Tree is empty.");
            return;
        }

        Queue<TreeNode> q = new ArrayDeque<>();
        q.add(root);

        while (!q.isEmpty()) {
            int removals = q.size(); // Get number of elements at the current level
            for (int i = 0; i < removals; i++) {
                TreeNode rn = q.remove(); 
                System.out.print(rn.val + " "); 

                // Enqueue left child if it exists
                if (rn.left != null) {
                    q.add(rn.left);
                }

                // Enqueue right child if it exists
                if (rn.right != null) {
                    q.add(rn.right);
                }
            }
            System.out.println(); // New line for each level
        }
    }

    //Level order traversal to print the tree
    public static void printLevelOrderZigzag(TreeNode root) {
    	Stack<TreeNode>curr=new Stack<>();
    	Stack<TreeNode>next=new Stack<>();
    	
    	curr.push(root);
    	int level = 0;
    	
    	while(curr.size()!=0) {
    		while(curr.size()!=0) {
    			TreeNode rn=curr.pop();
    			System.out.print(rn.val+" ");
    			if(level%2 ==0) {
    				 	if(rn.left!=null) {next.push(rn.left);}
    				 	if(rn.right!=null) {next.push(rn.right);}
    			}else {
				 	if(rn.right!=null) {next.push(rn.right);}
				 	if(rn.left!=null) {next.push(rn.left);}
				}
    		}
    		System.out.println();
    		level++;
    		
    		curr=next;
    		next = new Stack<>();
    		
    	}
    }
    
}
