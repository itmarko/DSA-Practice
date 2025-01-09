package dsa.Final450;

import java.util.Arrays;
import java.util.Scanner;
/*
 * Find the "Kth" max and min element of an array 

 * 
 * 
 */
public class Practice03 {
	
	static int kThMin(int[] arr, int k) {
		Arrays.sort(arr);
		return arr[k-1];
		
	}
	static int kThMax(int[] arr, int k) {
		Arrays.sort(arr);
		return arr[arr.length-k];
	}
	static void printAll(int[] arr) {
		for(int val : arr) {
			System.out.print(val+" ");
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number you want to enter the number of array element the array element !");
		
		int n = scanner.nextInt();
		
		int[] arr = new int[n];
		for(int i =0 ; i<n; i++) {
			arr[i] = scanner.nextInt();
		}
		System.out.println("Enter the kth number you want to find smallest !");
		int k = scanner.nextInt();
		scanner.close();
		
		printAll(arr);
		System.out.println();
		System.out.println( k +"th min " + kThMin(arr, k));
		System.out.println( k +"th max "+ kThMax(arr, k));
	}
}
