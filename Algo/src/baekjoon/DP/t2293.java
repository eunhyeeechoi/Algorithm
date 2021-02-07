package baekjoon.DP;

import java.util.Scanner;

//https://www.acmicpc.net/problem/2293
// ��ȭ�� ������ �ؾ��ϴµ�...��....���S��

public class t2293 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);

		int n = s.nextInt(); // n �Է¹��� , ������ ������
		int k = s.nextInt(); // k �Է¹���,

		int coin[] = new int[101]; // ������ ��ġ
		int dp[] = new int[10001]; // n���� ������ ������ ����� k���� �ǰ��ϴ� ����� ��

		for (int i = 1; i <= n; i++) {
			coin[i] = s.nextInt();
		}

		dp[0] = 1;
		for (int i = 1; i <= n; i++) {
			for (int j = coin[i]; j <= k; j++) {
				dp[j] += dp[j - coin[i]];
			}
		}

		System.out.println(dp[k]);
		s.close();

	}
}
