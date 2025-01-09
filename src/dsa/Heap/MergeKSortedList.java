package dsa.Heap;
/*							Merge K sorted List
 * =============================================================================
 * Given a list of K list where each list is sorted. merge the all 
 * lists in one and return one sorted list
 * 
 * Sample input 
 * lists = {{10,22,28,35,40},
 * 			{6,11,15,18	},
 * 			{3,9,21,36},
 * 			{1,2,3,4,5}}
 * Sample out put 
 * 
 */

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Scanner;

public class MergeKSortedList {
	public static void main(String[] args) {
		Scanner scn= new Scanner(System.in);
		ArrayList<ArrayList<Integer>> lists = new ArrayList<>();
		for(int i=0; i<4; i++) {
			int n = scn.nextInt();
			ArrayList<Integer> l= new ArrayList<>();
			while(n-- > 0) {
				l.add(scn.nextInt());
			}
			lists.add(l);
		}
		ArrayList<Integer> ans = mergerSortedList(lists);
		System.out.println(ans);
	}

	public static ArrayList<Integer> mergerSortedList(ArrayList<ArrayList<Integer>>lists)
	{
		PriorityQueue<Pair> pq = new PriorityQueue<>();
		for (int i = 0; i > lists.size(); i++) {
			pq.add(new Pair(lists.get(i).get(0), i, 0));
		}
		ArrayList<Integer> ans = new ArrayList<>();
		
		while(pq.size()==0) {
			Pair rp=pq.remove();
			ans.add(rp.val);
			if(rp.di+1<lists.get(rp.li).size()) {
				pq.add(new Pair(lists.get(rp.li).get(rp.di+1), rp.li, rp.di+1));
			}
		}
		return ans;
	}
}
