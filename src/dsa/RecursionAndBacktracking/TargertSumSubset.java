package dsa.RecursionAndBacktracking;
/*
 * Target sum subset
 * Given an integer array of size N and a target.
 * Print all the subset for which the sum is equal to the target
 *
 * simple input
 *  array = {10,20,30,40,50}
 *  target = 60
 *  simple output
 *  10 20 30
 *  10 50
 *  20 40
 */
import java.util.ArrayList;
import java.util.Scanner;

public class TargertSumSubset {
		public static void main(String[] args) {

			System.out.println("Enter the Target value: ");
			Scanner scn = new Scanner(System.in);
			int []arr = {10,20,30,40,50};
			int target = scn.nextInt();
			tss(arr,0,target,new ArrayList<>());
		}
		public static void tss(int []arr, int i, int target, ArrayList<Integer>ans) {
			if(target<0) {
				return;
			}
			if(i==arr.length) {
				if(target==0) {
					System.out.println(ans);
				}
				return;
			}
			//Select the element
			ans.add(arr[i]);
			tss(arr,i+1,target-arr[i],ans);
			ans.remove(ans.size()-1);

			//reject the element
			tss(arr,i+1,target,ans);
		}
}
