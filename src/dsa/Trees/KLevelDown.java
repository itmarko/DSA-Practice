package dsa.Trees;
/**
 * @author marko
 */
/*
 * Time complexity TC = O(N)
 * Space Complexity SC = O(height of tree)
 */

public class KLevelDown {

	public static void fun(TreeNode root, int target, int k) {
		if (root == null) {
			return;
		}
		if (root.val == target) {
			kLevelDown(root, k);
			return;
		}
		fun(root.left, target, k);
		fun(root.right, target, k);
	}

	public static void kLevelDown(TreeNode node, int k) {
		if (node == null) {
			return;

		}
		if (k == 0) {
			System.out.print(node.val + " ");
		}
		kLevelDown(node.left, k - 1);
		kLevelDown(node.right, k - 1);
	}
}
