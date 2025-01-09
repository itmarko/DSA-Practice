package dsa.Final450;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Practice06A {
	static ArrayList<Integer> findUnion(int[]a, int [] b) {
		ArrayList<Integer> resArrayList = new ArrayList<>();
		for(int i=0; i<a.length; i++) {
			if(!resArrayList.contains(a[i])) {
				resArrayList.add(a[i]);
			}
			if(!resArrayList.contains(b[i])) {
				resArrayList.add(b[i]);
			}
		}
		Collections.sort(resArrayList);
		return resArrayList;
	}
	/**
	 * We can do with this using HashSet
	 * HashSet<Integer> set = new HashSet<>();
        for(int num : a){
            set.add(num);
            
        }
        for(int num : b){
            set.add(num);
        }
        return set.size();
	 * @param args
	 * 
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the length of the array !");
		int n = scanner.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];
		System.out.println("Enter the First Array element !");
		for(int i =0; i<n; i++) {
			a[i]=scanner.nextInt();
		}
		System.out.println("Enter the Secound Array element !");
		for(int i =0; i<n; i++) {
			b[i]=scanner.nextInt();
		}
		scanner.close();
		ArrayList<Integer> resArrayList = findUnion(a, b);
		for(int val : resArrayList) {
			System.out.println(val+" ");
		}
	}
}
