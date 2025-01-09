package dsa.Graphs;

import java.util.ArrayList;
	/*
	 * TC = O(V+E)
	 * SC = O(V+ height of tree)
	 */
public class IsCyclic {
	public static void main(String[] args) {
		int V = 4; // Number of vertices
		ArrayList<Integer>[] graph = new ArrayList[V];
		for (int i = 0; i < V; i++) {
			graph[i] = new ArrayList<>();
		}

		// Add edges to the graph (for example: 0-1, 1-2, 2-0)
		graph[0].add(1);
		graph[1].add(0);

		graph[1].add(2);
		graph[2].add(1);

		graph[2].add(0);
		graph[0].add(2);

		boolean[] visited = new boolean[graph.length];
		boolean ans = false;
		for (int i = 0; i < visited.length; i++) {
			if (!visited[i]) {
				if (isCyclic(graph, i, visited, -1)) {
					ans = true;
					break;
				}
			}
		}
		System.out.println(ans);

	}

	public static boolean isCyclic(ArrayList<Integer>[] graph, int src, boolean[] visited, int parent) {
		if (visited[src] == true) {
			return true;
		}

		visited[src] = true;
		for (int nbr : graph[src]) {
			if (nbr != -1 && nbr != parent) {
				if (isCyclic(graph, nbr, visited, src)) {
					return true;
				}
			}
		}
		return false;
	}
}
