package baekjoon.DFS.BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class t7576 {
	// 백준 BFS 토마토
	// https://www.acmicpc.net/problem/7576
	// 인접한 노드를 찾아야하므로 BFS
	// 1. 인접 노드관계를 가진 그래프를 그려야하고
	// 2. 앞뒤 양옆중 -1이 아닌곳을 탐색해서 1로 바꾸고 cnt 증가
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int garo = Integer.parseInt(st.nextToken());
		int sero = Integer.parseInt(st.nextToken());

		// 2차원 배열 큐를 만들고
		Queue<Integer> queue = new LinkedList<Integer>();
		// 생성된 큐를 탐색해야해
	}
}
