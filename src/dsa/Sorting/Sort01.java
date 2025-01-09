package dsa.Sorting;
/*
 * 										Sort01
 * 	You are given an array of 0s and 1s in random order.
 * segregate 0s on left side and 1s on right side of the array 
 * [Basically you have to sort the array ].
 * Note traverse array only once.
 * 
 * Sample input 
 * arr = {0,1,1,0,0,1,0,1,0}
 * 
 * Sample output 
 * arr = {0,0,0,0,1,1,1,1}
 */
public class Sort01 {
	public static void main(String[] args) {
		int[] arr = {0,1,1,0,0,1,0,1,0,2};
		sort01(arr);
		for(int val : arr) {
			System.out.print(val +" ");
		}
	}
	public static void sort01(int[] arr) {
		int i =0, j=0;
		while (i<arr.length) {
			if(arr[i]==0) {
				int temp = arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				i++;
				j++;
				
			}else {
				i++;
			}
		}
	}
}
