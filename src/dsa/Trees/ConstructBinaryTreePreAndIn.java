package dsa.Trees;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 * @author marko
 */
/*
 * Construct Binary tree with pre and in order
 * =============================================================================
 * =============== Given two integer arrays of unique values. pre[] represent
 * preorder traversal of a binary tree. in[] represent inorder traversal of a
 * binary tree.
 * 
 * Sample input pre[] = {5,7,15,20,9} in[] = {7,5,20,15,9} Sample Output Print
 * Level order of the constructed tree.
 * 
 */
public class ConstructBinaryTreePreAndIn {
	public static void main(String[] args) {
		// Sample input for preorder and inorder traversal arrays
		int[] pre = { 1, 7, 2, 6, 5, 11, 9, 10, 4 };
		int[] in = { 2, 7, 5, 6, 11, 1, 9, 4, 11 };

		// Construct the binary tree
		TreeNode root = constructTree(pre, 0, pre.length - 1, in, 0, in.length - 1);

		// Print the level order traversal of the constructed tree
		printLevelOrder(root);
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

	// Method to construct a binary tree pre and in order
	public static TreeNode constructTree(int[] pre, int si1, int ei1, int[] in, int si2, int ei2) {
		if (si1 > ei1) {
			return null;
		}

		if (si1 == ei1) {
			return new TreeNode();
		}
		TreeNode root = new TreeNode(pre[si1]);
		int idx = -1;
		for (int i = si2; i <= ei2; i++) {
			if (in[i] == pre[si1]) {
				idx = i;
				break;
			}
		}
		root.left = constructTree(pre, si1 + 1, si1 + idx - si2, in, si2, idx - 1);
		root.right = constructTree(pre, si1 + idx - si2 + 1, ei1, in, idx + 1, ei2);
		return root;
	}
}
