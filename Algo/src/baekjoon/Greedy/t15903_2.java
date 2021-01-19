package baekjoon.Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class t15903_2 {
	// 백준 15903 카드 합체 놀이
	static int[] aa;
	static int m = 0; // 점수 최솟값

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int cardCnt = Integer.parseInt(st.nextToken()); // 카드 갯수
		int loopCnt = Integer.parseInt(st.nextToken()); // 합체 횟수

		st = new StringTokenizer(br.readLine());

		aa = new int[cardCnt];
		for (int i = 0; i < cardCnt; i++) {
			aa[i] = Integer.parseInt(st.nextToken());
		}

		Arrays.sort(aa);

		for (int j = 0; j < loopCnt; j++) {
			aa[j + 1] = aa[j] + aa[j + 1];
			aa[j] = aa[j] + aa[j + 1]; // 덮어씌우기 이게 최선..?
		}

		for (int p = 0; p < cardCnt; p++) {
			m += aa[p];
		}
		System.out.println(m);
	}

//	public static int find(int a, int b, int c, int d, int e) {
//		aa = new int[a]; // a 개만큼 배열을 만들고
//		// int 배열 만들고 오름차순 정렬해서 값을 더하고 덮어씌우고 b만큼 하면 될것같아
//		for (int i = 0; i < a; i++) {
//			aa[i] = c;
//		}
//		Arrays.sort(aa);
//		for (int i = 0; i < a; i++) {
//			System.out.println(aa[i]);
//		}
//		return 1;
//	}
}
