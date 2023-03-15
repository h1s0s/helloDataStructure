package Example;

import java.util.LinkedList;

public class GraphExample {
	public static void main(String args[]) {
		Graph g = new Graph(4);

		g.addEdge(0, 1);
		g.addEdge(0, 2);
		g.addEdge(1, 2);
		g.addEdge(2, 3);

		System.out.println("Following is Depth First Traversal (starting from vertex 2)");

		g.DFS(2);
	}
}

class Graph {
	private int V; // 노드의 개수
	private LinkedList<Integer> adj[]; // 인접 리스트

	// 그래프 생성자
	Graph(int v) {
		V = v;
		adj = new LinkedList[v];
		for (int i = 0; i < v; ++i)
			adj[i] = new LinkedList();
	}

	// 노드를 그래프에 추가하는 메소드
	void addEdge(int v, int w) {
		adj[v].add(w);
		adj[w].add(v);
	}

	// DFS 알고리즘
	void DFSUtil(int v, boolean visited[]) {
		visited[v] = true;
		System.out.print(v + " ");

		// 인접한 노드를 모두 방문
		for (int i : adj[v]) {
			if (!visited[i])
				DFSUtil(i, visited);
		}
	}

	// DFS 탐색
	void DFS(int v) {
		boolean visited[] = new boolean[V];

		DFSUtil(v, visited);
	}
}