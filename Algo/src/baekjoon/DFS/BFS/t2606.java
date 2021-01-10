package baekjoon.DFS.BFS;

// 2020.01.09 ���� ���̷���
// https://www.acmicpc.net/problem/2606
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

// ������ ��带 Ž���ؾ� �ϹǷ� bfs ���
public class t2606 {
	static int node[][]; // �׷��� �迭
	static int check[]; // �湮 �迭

	static void bfs(int start) { // BFS �޼ҵ�
		Queue<Integer> queue = new LinkedList<>();
		check[start] = 1;
		queue.offer(start);
		int cnt = 0; // ������ ��ǻ���� ��
		while (!queue.isEmpty()) {
			int x = queue.poll();
			for (int i = 1; i < node.length; i++) {
				// ���ʴ�� 1���� ����� ��ǻ�͵��� ã�� cnt ���� ����
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

		int n = sc.nextInt(); // ��ǻ���� ��
		int m = sc.nextInt(); // ��Ʈ��ũ�� ����Ǿ��ִ� ��ǻ�ͽ��Ǽ�

		node = new int[n + 1][n + 1];
		check = new int[n + 1];
		for (int i = 0; i < m; i++) { // �׷��� ����
			int a = sc.nextInt();
			int b = sc.nextInt();
			node[a][b] = 1;
			node[b][a] = 1;
		}
		bfs(1);
	}
}