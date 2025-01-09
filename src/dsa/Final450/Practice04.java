package dsa.Final450;
/*
 * Given an array which consists of only 0, 1 and 2. Sort the array without using any sorting algo
 * Sample Input: arr[] = [0, 1, 2, 0, 1, 2]
 * Sample Output: [0, 0, 1, 1, 2, 2]
 * Explanation: 0s 1s and 2s are segregated into ascending order.
 * 	Time Complexity: O(n)
 *  Space Complexity: O(1)
 *  
 */
import java.util.Scanner;

public class Practice04 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of element you want to enter the array !");
		int n = scanner.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter only 0's, 1's and 2's !");
		for(int i =0; i<n; i++) {
			arr[i]=scanner.nextInt();
		}
		
		scanner.close();
		sort012(arr);
		for(int num : arr) {
			System.out.print(num + " ");
		}
	}
	static void sort012(int[] arr) {
        // code here
        int count0=0, count1=0, count2=0;
        for(int num : arr){
            if(num==0){
                count0++;
            }else if(num==1){
                count1++;
            }else{
                count2++;
            }
        }
        
        int i=0;
        while(count0>0){
            arr[i++]=0;
            count0--;
        }
        while(count1>0){
            arr[i++]=1;
            count1--;
        }
        while(count2>0){
            arr[i++]=2;
            count2--;
        }
        
    }
}
