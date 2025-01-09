package dsa.StackAndQueue;

import java.util.Arrays;
import java.util.Stack;

/*			
 * 												Next Greater Element (Approach II)
 * 											=========================================
 * 	Given a circular array. fined the the next greater number of every element in the circular array.
 *  The next grater number of x is first greater number present to its right. if it doesn't exist, return -1 for that number
 *  
 *  Sample input 
 *  arr = {1,6,3,8,2}
 *  sample output
 *  ans = {6,8,8,-1,6}
 */
public class NGEII {
	public static void main(String[] args) {
		int[] arr= {1,6,3,8,2};
		int[]ans = nextGreaterElement(arr);
		for (int i : ans) {
			System.out.print(i+" ");
		}
	}

	public static int[] nextGreaterElement(int[] arr) {
		int n = arr.length;
		Stack<Integer>st=new Stack<>();
		int[] ans = new int [n];
		Arrays.fill(ans, -1);
		st.push(0);
		
		for(int i =1; i<2*arr.length; i++) {
			while (st.size() > 0 && arr[st.peek()] < arr[i%n]) {
				ans[st.peek()] = arr[i%n];
				st.pop();

			}
			st.push(i%n);
		}
		return ans;
	}
	
}
