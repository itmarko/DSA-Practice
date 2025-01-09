package dsa.Trees;

public class MinCamera {
	
	static int cameras = 0;
	public static int minCamera(TreeNode root) {
		if(root==null) {
			return 0;
		}
		int lans = minCamera(root.left);
		int rans=minCamera(root.right);
		if(lans ==-1 || rans ==-1) {
			// if left and right child is need of camera 
			cameras++;
			return 1;
		}
		if (lans ==1 || rans ==1) {
			// if left or right child having camera -> we are covered 
			return 0;
			
		}
		return -1;
	}
}
