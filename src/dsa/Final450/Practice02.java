package dsa.Final450;

/*Find the maximum and minimum element in an array

 * Input: arr[] = {3, 5, 4, 1, 9}
 * Output: Minimum element is: 1
 *             Maximum element is: 9
 * 
 *
 * Input: arr[] = {22, 14, 8, 17, 35, 3}
 * Output:  Minimum element is: 3
 *             Maximum element is: 35
 *             
 *             
 *            Time Complexity: O(N)
 *
 *				Auxiliary Space: O(1)
 */
import java.util.Scanner;

public class Practice02 {

	static int findMin(int[] arr) {
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		return min;
	}

	static int findMax(int[] arr) {
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		return max;
	}

//	static void printAll(int[] arr) {
//		for (int val : arr) {
//			System.out.println(val);
//		}
//	}

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the number of element you want to enter the the array !");
		int size = scn.nextInt();
		int[] arr = new int[size];

		for (int i = 0; i < size; i++) {
			arr[i] = scn.nextInt();
		}
		System.out.println(findMin(arr));
		System.out.println(findMax(arr));
		scn.close();
	}
}
