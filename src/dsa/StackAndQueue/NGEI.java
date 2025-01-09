package dsa.StackAndQueue;

/*
 * 												Next Greater Element (Approach I)
 * 											=========================================
 * 	Given an array size of N. Find the next greater number of every element in the array 
 *  The next greater number of x is first greater number present its right. if doesn't exist, return -1 for that number 
 *  
 *  Sample input 
 *  arr= { 5,9,21,11,17,3,30,12,25,50 };
 *  Sample output 
 *  ans = {9 ,21, 30, 17, 30, 30, 50, 25, 50, -1 }
 */
import java.util.Stack;

public class NGEI {
	public static void main(String[] args) {
		int[] arr = { 5, 9, 21, 11, 17, 3, 30, 12, 25, 50 };
		int[] ans = nextGreaterElement(arr);
		for (int i : ans) {
			System.out.print(i + " ");
		}
	}

	public static int[] nextGreaterElement(int[] arr) {
		Stack<Integer> st = new Stack<>();
		int[] ans = new int[arr.length];
		st.push(0);
		for (int i = 1; i < arr.length; i++) {
			// pop all smaller element
			// for all these smaller element, nge is current element
			while (st.size() > 0 && arr[st.peek()] < arr[i]) {
				ans[st.peek()] = arr[i];
				st.pop();

			}
			st.push(i);

		}
		while (st.size() > 0) {
			ans[st.pop()] = -1;
		}
		return ans;
	}

}
