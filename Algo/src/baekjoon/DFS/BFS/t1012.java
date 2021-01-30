package baekjoon.DFS.BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class t1012 {
	// 백준 유기농 배추
	static int T; // 테스트 케이스 갯수
	static int G; // 가로
	static int S; // 세로길이
	static int B; // 배추 갯수
	static int[][] box; // 땅
	static int p;
	static int q;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		T = Integer.parseInt(st.nextToken());
		System.out.println("T" + T);
		st = new StringTokenizer(br.readLine());
		G = Integer.parseInt(st.nextToken());
		S = Integer.parseInt(st.nextToken());
		B = Integer.parseInt(st.nextToken());

		// 1. for 문 돌아서 다 심고싶은디...
		// 노드로 만드까?ㅇㅅㅇ 띠용
		// 2. bfs 이용해서 인접 배추 가진 배추 모임 수를 세고싶은뎅
		// 같은 덩어리인지는 어또케 체크하디?ㅇㅅㅇ
		box = new int[G][S];

		for (int i = 0; i < B; i++) {
			st = new StringTokenizer(br.readLine()); // 줄바꿈을 계속해야징
			p = Integer.parseInt(st.nextToken());
			q = Integer.parseInt(st.nextToken());
			// 배추를 다 심어떠
			box[p][q] = 1;
//			System.out.println("P : " + p + " / Q : " + q + " / " + box[p][q]);

		}
	}
}
