package baekjoon.implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class t5567 {
// :: 백준 결혼식 - 그래프 / 간선, 정점 이용문제!
	/*
	 * 접근 1. 노드로 그래프 2. 바이러스랑 비슷한가? 3. BFS 탐색은 아닌것같은데 친구를 초대해야하니 관계가 더있어
	 * 
	 * sol 1. 2차원 배열을 이용한 풀이 https://leveloper.tistory.com/83 2. 그래프를 그려서
	 * https://zzang9ha.tistory.com/216
	 */
	public static int[][] arr; // 친구관계
	public static boolean visit[];
	public static int n; // 동기수
	public static int m; // 리스트 길이
	public static int count = 0; // 초대할 친구의 수

	public static void main(String[] args) throws IOException {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		n = Integer.parseInt(bf.readLine());
		m = Integer.parseInt(bf.readLine());
		arr = new int[n + 1][n + 1];
		visit = new boolean[n + 1];

		for (int i = 0; i < m; i++) {
			StringTokenizer st = new StringTokenizer(bf.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			arr[a][b] = arr[b][a] = 1; // 친구관계 표시
		}

		for (int i = 2; i <= n; i++) {
			if (arr[1][i] == 1) { // 상근이와 친구인경우
				if (!visit[i]) { // 상근이와 친구인데 아직 방문하지 않은것
					count++; // 초대
					visit[i] = true; // 방문 표시
				}
				// 상근이의 친구의 친구 찾기 - 상근이와 연결된 정점에 연결된 정점 찾기
				for (int j = 2; j <= n; j++) {
					if (arr[i][j] == 1 && !visit[j]) {
						count++; // 상근이 친구의 친구도 초대
						visit[j] = true; // 방문표시
					}
				}

			}
		}
		System.out.println(count);
		bf.close();
	}

}
