package baekjoon.DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class t14606_2 {
	static int n = 0; // 즐거움의 총합
	static int pizza[]; // 피자 N개의 갯수

	public int find(int N) { // 최대값을 찾아보자
		// N 개의 피자를 받아서
		int[] pizza = new int[N];
		int m = 0;
		// 모든 배열을 돌아가면서 확인하고싶어
		// 큰 N 의 값을 모두 나눠서 1로만들고 아닌거 는 나누고싶어
		pizza[0] = N;
		if (pizza[0] == 1) {
			n = 0;
		} else {
			// 다른 배열로 나눠담고싶어
			// 그리고 1이 아닌거 찾아서 나눠담고 즐거움의 합을 구하고싶은디
			// 어떻게 나눠야할지
			// 2. m / n 으로 나누어 최대값 구하기
			if (N % m == 0) {
				pizza[1] = m;
				pizza[2] = N / m;
			}
		}
		return 1;
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int pN = Integer.parseInt(br.readLine());
	}
}
