package dsa.Final450;
/*
 * Minimise the maximum difference between heights [V.IMP]
 */
import java.util.Arrays;
import java.util.Scanner;

public class Practice09 {
	static int minMaxDiff(int[] arr, int k) {
//		int res = 0;
//		for(int i=0; i<arr.length; i++) {
//			res= Math.max(res, arr[i]);
//			
//		}
//		res = res-k;
		int n = arr.length;
		Arrays.sort(arr);
		int res = arr[n-1]-arr[0];
		for(int i=1; i<n; i++) {
			if(arr[i]-k<0) {
				continue;
			}
			int minH = Math.min(arr[0]+k, arr[i]-k);
			int maxH= Math.max(arr[i-1]+k, arr[n-1]-k);
			res = Math.min(res, maxH-minH);
		}
		return res;
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
		System.out.println("Enter the value you want to decrese the height !");
		int k = scanner.nextInt();
		System.out.println(minMaxDiff(arr, k));
		scanner.close();

	}
}
