package dsa.Graphs;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;

public class ICyclic2 {
	public static void main(String[] args) {
		
		 ArrayList<Integer>[] graph = new ArrayList[4];
	        for (int i = 0; i < 4; i++) {
	            graph[i] = new ArrayList<>();
	        }
	        graph[0].add(1);
	        graph[1].add(0);
	        graph[1].add(2);
	        graph[2].add(1);
	        graph[2].add(3);
	        graph[3].add(2);
		boolean[] visited = new boolean[graph.length];
		boolean ans = false;
		for (int i = 0; i < visited.length; i++) {
			if (!visited[i]) {
				if (isCyclicBFS(graph, i, visited)) {
					ans = true;
					break;
				}
			}
		}
		System.out.println(ans);
	}

	public static boolean isCyclicBFS(ArrayList<Integer>[] graph, int src, boolean[] visited) {
		Queue<Pair> q = new ArrayDeque<>();
		q.add(new Pair(src, -1));
		visited[src] = true;
		
		while(!q.isEmpty()) {
			Pair rp=q.remove();
			for(int nbr : graph[rp.vtx]) {
				if(nbr!=rp.parent) {
					if(visited[nbr]==true) {
						return true;
					}
					visited[nbr]=true;
					q.add(new Pair(nbr,rp.vtx));
				}
			}
		}
		return false;
		
	}
}
