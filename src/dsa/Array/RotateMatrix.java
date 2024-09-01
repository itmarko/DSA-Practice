package dsa.Array;
/**
 * RotateMatrix
 * Given a matrix N*N rotate it by 90 degree in clockwise diration without using
 * any extra spaces
 * int [][] arr = {{1,2,3,4},                   [13,9,5,1]
 *                  {5,6,7,8},                  [14,10,6,2] output
 * input            {9,10,11,12},               [15,11,7,3]
 *                  {13,14,15,16}}              [16,12,8,4]
 */
public class RotateMatrix {

    public static void main(String[] args) {
        int[][] arr = { { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 },
                { 13, 14, 15, 16 } };
        rotate90(arr, arr.length);
        print(arr);
    }

    public static void print(int[][] arr) {
        for (int[] a : arr) {
            for (int val : a) {

                System.out.print(val+" ");
            }
            System.out.println();
        }
    }

    public static void rotate90(int[][] arr, int n) {

        // 1-> take a transpose
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr[0].length; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        // 2-> swap columns
        int left = 0;
        int right = arr[0].length - 1;

        while (left < right) {
            for (int i = 0; i < arr.length; i++) {
                int temp = arr[i][left];
                arr[i][left] = arr[i][right];
                arr[i][right] = temp;
            }
            left++;
            right--;
        }
    }
}