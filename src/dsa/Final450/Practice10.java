package dsa.Final450;
/*
 * Minimum no. of Jumps to reach end of an array
 */
import java.util.Scanner;

public class Practice10 {
	static int minJump(int[] arr) {
		int n = arr.length;
		if(n<=1) {
			return 0;
		}
		if(arr[0]==0) {
			return -1;
		}
		int jumps = 1;
		int currEnd = arr[0];
		int des= arr[0];
		for(int i =0; i<n; i++) {
			des= Math.max(des, arr[i]+i);
			if(i==currEnd) {
				if(currEnd>=n-1) {
					break;
				}
				jumps++;
				currEnd= des;
			}
		}
		return (currEnd >=n-1 ? jumps : -1);
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
		System.out.println(minJump(arr));
		scanner.close();

	}
}
