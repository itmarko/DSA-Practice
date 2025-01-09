package dsa.Trees;

/**
 * @author marko
 */

/*
 * All nodes k distance away
 * ====================================================================
 * Given root of a binary tree, a target node, and integer k, print the value of all
 * the nodes that have a distance k from the target node.
 * 
 * Sample input target node = 7 , k = 2
 * Sample output: (values of nodes 2 distance away from target 7)
 */
public class KDistance {

    // This function prints all nodes that are k distance away from the given node.
    public static void kLevelDown(TreeNode node, int k, TreeNode blocker) {
        if (node == null || node == blocker) {
            return;
        }
        if (k == 0) {
            System.out.print(node.val + " ");
        }
        kLevelDown(node.left, k - 1, blocker);
        kLevelDown(node.right, k - 1, blocker);
    }

    public static void kDistanceAway(TreeNode root, int target, int k) {
        fun(root, target, k);
    }

    // This function traverses the tree and finds the target node, then calls kLevelDown.
    public static int fun(TreeNode root, int target, int k) {
        if (root == null) {
            return -1; // Target not found
        }

        if (root.val == target) {
            // If the current node is the target, print k-level nodes downwards.
            kLevelDown(root, k, null);
            return 1; // Return the distance to the target node, which is 1.
        }

        // Search in the left subtree
        int leftDistance = fun(root.left, target, k);
        if (leftDistance != -1) {
            // If target is in the left subtree, print nodes k - leftDistance away.
            kLevelDown(root, k - leftDistance, root.left);
            return leftDistance + 1; // Return distance from root to target.
        }

        // Search in the right subtree
        int rightDistance = fun(root.right, target, k);
        if (rightDistance != -1) {
            // If target is in the right subtree, print nodes k - rightDistance away.
            kLevelDown(root, k - rightDistance, root.right);
            return rightDistance + 1; // Return distance from root to target.
        }

        return -1; // Return -1 if target is not found in either subtree
    }

    // TreeNode definition for reference
    static class TreeNode {
        int val;
        TreeNode left, right;

        TreeNode(int val) {
            this.val = val;
            this.left = this.right = null;
        }
    }

    // Sample usage
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(7);
        root.right = new TreeNode(4);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(6);
        root.left.left.left = new TreeNode(5);
        root.left.left.right = new TreeNode(11);
        root.right.left = new TreeNode(9);
        root.right.right = new TreeNode(10);

        // Test case: find all nodes at distance 2 from node 7
        kDistanceAway(root, 7, 2);  // Expected output: 2 6 9 10
    }
}
