package dsa.Array;

/**
 * MajorityElement
 * 
 * Given an array you need to find the majority element in the array
 * Majority element is define as the element which appearing more than n/2
 * times in the array of length N
 * 
 * Note-> if there is no majority element return -1
 * 
 * sample input N= 1o
 * array = {2,2,6,6,6,2,2,8,8,2,2}
 * simple out put === 2
 */
public class MajorityElement {
    public static void main(String[] args) {
        int[] arr = { 2, 2, 6, 6, 6, 2, 2, 8, 8, 2, 2 };
        System.out.println(findMajorityElement(arr, arr.length));
    }

    public static int findMajorityElement(int[] arr, int n) {
        int candidate = arr[0];
        int count = 1;

        for (int i = 1; i < n; i++) {
            if (arr[i] == candidate) {
                count++;
            } else {
                count--;
            }
            if (count == 0) {
                candidate = arr[i];
                count = 1;

            }
        }
            // verify candidate is your ans or not
            count = 0;
            for (int val : arr) {
                if (val == candidate) {
                    count++;
                }
            }
            if (count > n / 2) {
                return candidate;
            } else {
                return -1;
            }
        }

    

}