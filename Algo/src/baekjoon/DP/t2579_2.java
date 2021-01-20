package baekjoon.DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//���� DP - ��ܿ�����
// https://st-lab.tistory.com/132
// ��� Top-Down ���

public class t2579_2 {
	static Integer dp[];
	static int arr[];

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());

		dp = new Integer[N + 1];
		arr = new int[N + 1];

		for (int i = 1; i <= N; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}

		dp[0] = arr[0]; // ����Ʈ ���� null �̹Ƿ� 0���� �ʱ�ȭ
		dp[1] = arr[1];

		if (N >= 2) {
			dp[2] = arr[1] + arr[2];
		}
		System.out.println(find(N));

	}

	static int find(int N) {
		// ���� Ž������ ���� N��° ����ϰ��
		if (dp[N] == null) {
			dp[N] = Math.max(find(N - 2), find(N - 3) + arr[N - 1] + arr[N]);
		}
		return dp[N];
	}
}