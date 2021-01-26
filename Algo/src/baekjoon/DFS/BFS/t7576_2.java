package baekjoon.DFS.BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class t7576_2 {
// ���� BFS �丶��
//	https://www.acmicpc.net/problem/7576
//  ���� https://bcp0109.tistory.com/entry/%EB%B0%B1%EC%A4%80-7576%EB%B2%88-%ED%86%A0%EB%A7%88%ED%86%A0-Java
	static int N;
	static int M;
	static int[][] box;
	static int[] dx = { 1, -1, 0, 0 };
	static int[] dy = { 0, 0, 1, -1 };

	static class Dot {
		int x;
		int y;
		int day;

		public Dot(int x, int y, int day) {
			this.x = x;
			this.y = y;
			this.day = day;
		}
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		box = new int[M][N];

		// box�� ����ִ� �丶�� ������
		for (int i = 0; i < M; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < N; j++) {
				box[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		bfs();

		// bfs �� ���鼭 �丶�� ��� �Ͱ��ϱ�
		// �ٽ� 2�� for �� ���鼭
	}

	static void bfs() {
		Queue<Dot> q = new LinkedList<Dot>();
		int day = 0;

		// 2�� for������ box �迭�� ���鼭 ���� �丶�並 Queue �� �ֱ�
		// �丶�䰡 �ִ� ��ǥ ã�Ƽ� Queue �� �ֱ�
		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				if (box[i][j] == 1) {
					q.offer(new Dot(i, j, 0));
				}
			}
		}
		// bfs ����
		while (!q.isEmpty()) {
			Dot dot = q.poll();
			day = dot.day;

			for (int i = 0; i < 4; i++) {
				int nx = dot.x + dx[i];
				int ny = dot.y + dy[i];

				if (0 <= nx && nx < M && 0 <= ny && ny < N) {
					if (box[nx][ny] == 0) {
						box[nx][ny] = 1;
						q.add(new Dot(nx, ny, day + 1));
					}
				}
			}
		}
		if (checkTomato()) {
			System.out.println(day);
		} else {
			System.out.println(-1);
		}
	}

	static boolean checkTomato() {
		for (int i = 0; i < M; i++) {
			for (int j = 0; j < N; j++) {
				if (box[i][j] == 0)
					return false;
			}
		}
		return true;
	}
}
