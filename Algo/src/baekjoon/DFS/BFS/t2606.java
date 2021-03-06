package baekjoon.DFS.BFS;

// 2020.01.09 백준 바이러스
// https://www.acmicpc.net/problem/2606
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

// 인접한 노드를 탐색해야 하므로 bfs 사용
public class t2606 {
	static int node[][]; // 그래프 배열
	static int check[]; // 방문 배열

	static void bfs(int start) { // BFS 메소드
		Queue<Integer> queue = new LinkedList<>();
		check[start] = 1;
		queue.offer(start);
		int cnt = 0; // 감염된 컴퓨터의 수
		while (!queue.isEmpty()) {
			int x = queue.poll();
			for (int i = 1; i < node.length; i++) {
				// 차례대로 1번과 연결된 컴퓨터들을 찾아 cnt 변수 증가
				if (node[x][i] == 1 && check[i] != 1) {
					queue.offer(i);
					check[i] = 1;
					cnt++;
				}
			}
		}
		System.out.println(cnt);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt(); // 컴퓨터의 수
		int m = sc.nextInt(); // 네트워크상에 연결되어있는 컴퓨터쌍의수

		node = new int[n + 1][n + 1];
		check = new int[n + 1];
		for (int i = 0; i < m; i++) { // 그래프 구성
			int a = sc.nextInt();
			int b = sc.nextInt();
			node[a][b] = 1;
			node[b][a] = 1;
		}
		bfs(1);
	}
}