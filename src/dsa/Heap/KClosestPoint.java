package dsa.Heap;

import java.util.PriorityQueue;
import java.util.Scanner;

/*
 * K Closest To Origin
 * ====================================================
 * Given an array of points where points[i], represents a point 
 * on XY plane, and an integer K,  You need to return the K 
 * closest points to the origin(0,0)
 * 
 * Sample input 
 * points= {{3,3},{5,-1},{-2,4}}
 * K = 2
 * Sample output
 * {{-2,4},{3,3}}
 */
public class KClosestPoint {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        // Reading points into the 2D array
        int[][] arr = new int[6][2];
        for (int i = 0; i < 6; i++) {
            arr[i][0] = scn.nextInt();
            arr[i][1] = scn.nextInt();
        }
        
        // Call the method to find k closest points
        int[][] ans = kClosestPoint(arr, 3);

        // Printing the results
        for (int[] a : ans) {
            System.out.println("{" + a[0] + " " + a[1] + "}");
        }

        scn.close();
    }

    public static int[][] kClosestPoint(int[][] arr, int k) {
        // Max-heap based on squared distance
        PriorityQueue<int[]> pq = new PriorityQueue<>((p1, p2) -> 
            (p2[0] * p2[0] + p2[1] * p2[1]) - (p1[0] * p1[0] + p1[1] * p1[1])
        );
        
        // Add points to the priority queue, maintaining the size of k
        for (int i = 0; i < arr.length; i++) {
            pq.add(arr[i]);
            if (pq.size() > k) {
                pq.poll();  // Remove the farthest point
            }
        }

        // Prepare the result array to store the k closest points
        int[][] ans = new int[k][2];
        for (int i = 0; i < k; i++) {
            ans[i] = pq.poll(); // Pop the closest points
        }

        return ans;
    }
}
