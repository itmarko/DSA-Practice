package dsa.StackAndQueue;

import java.util.Stack;

/*
 * 												Next Greater Element (Approach 1)
 * 											=========================================
 * 	Given an array size of N. Find the next greater number of every element in the array 
 *  The next greater number of x is first greater number present its right. if doesn't exist, return -1 for that number 
 *  
 *  Sample input 
 *  arr= {7,6,3,8,2,11,30,5,25};
 *  Sample output 
 *  ans = {8,8,8,11,11,30,-1,25,-1}
 */
public class NGE1 {
	public static void main(String[] args) {
		int[] arr = { 7, 6, 3, 8, 2, 11, 30, 5, 25 };
		int[] ans = nextGreaterElement(arr);
		for (int i : ans) {
			System.out.print(i + " ");
		}
	}

	public static int[] nextGreaterElement(int[] arr) {

		Stack<Integer> st = new Stack<>();
		int[] ans = new int[arr.length];
		for(int i=arr.length-1; i>=0; i--) {
			//  pop all smaller element
			while(st.size()>0 && st.peek()<arr[i]) {
				st.pop();
			}
			// update answer 
			if(st.size()==0) {
				ans[i]=-1;
			}else {
				ans[i]=st.peek();
			}
			// add current element in the stack 
			st.push(arr[i]);
		}
		return ans;
	}
}
