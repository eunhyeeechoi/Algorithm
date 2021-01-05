package baekjoon.DP;

import java.util.Scanner;

//top-down 방식을 이용한 풀이
// 재귀함수를 사용. 작은 부분의 답을 저장해 이미 계산을 진행한 작은 문제는 저장된 값을 이용
public class t1463_2 {
	static int[] d;

	private static int dp(int n) {
		if (n == 1)
			// n이 1이면 0
			return 0;
		if (d[n] > 0)
			return d[n];

		d[n] = dp(n - 1) + 1;
		if (n % 2 == 0) {
			int tmp = dp(n / 2) + 1;
			if (d[n] > tmp)
				d[n] = tmp;
		}
		if (n % 3 == 0) {
			int tmp = dp(n / 3) + 1;
			if (d[n] > tmp)
				d[n] = tmp;
		}
		return d[n];
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		d = new int[n + 1];

		System.out.println(dp(n));
		sc.close();
	}
}
