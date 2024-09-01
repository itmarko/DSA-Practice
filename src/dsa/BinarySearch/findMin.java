package dsa.BinarySearch;
/*
 * Given a sorted and rotated array of unique elements. find the minimum element in the array 
 * 
 * sample input
 *  int [] arr = {7,8,10,15,16,2,4,6};
 *  
 *  output 2;
 */
public class findMin {
	public static void main(String[] args) {
		int [] arr = {7,8,10,15,16,2,4,6};
		System.out.println(findMinimum(arr));
	}
	public static int findMinimum(int[] arr) {
		int left =0,right =arr.length-1;
		while(left<right) {
			int mid= (left+right)/2;
			if(arr[mid]<arr[right]) {
				right=mid;
			}else {
				left = mid+1;
			}
		}
		return arr[right];
	}
}
