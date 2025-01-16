package dsa.Final450;

import java.util.Scanner;
 // this for find minnum cost of 
public class Practice10A {
	static int minJump(int[] arr, int n) {
//		int[] dp = new int[arr.length];
//		dp[0] = arr[0];
//		dp[1]=arr[0]+arr[1];
//		for(int i =2; i<dp.length; i++) {
//			dp[i] = Math.min(dp[i-1], dp[i-2]+arr[i]);
//		}
//		return dp[dp.length-1];
		if(n==1) {
			return arr[0];
		}
		if(n==2) {
			return arr[0]+arr[1];
			
		}
		int f1=minJump(arr, n-1);
		int f2=minJump(arr, n-2);
		int ans=Math.min(f1, f2)+arr[n-1];
		return ans;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the length of the array !");
		int n = scanner.nextInt();
		int[] arr = new int[n];

		System.out.println("Enter the Array element !");
		for (int i = 0; i < n; i++) {
			arr[i] = scanner.nextInt();
		}
		
		System.out.println(minJump(arr, n));
		scanner.close();

	}
}
