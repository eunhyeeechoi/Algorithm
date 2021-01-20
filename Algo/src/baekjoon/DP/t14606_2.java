package baekjoon.DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class t14606_2 {
	static int n = 0; // ��ſ��� ����
	static int pizza[]; // ���� N���� ����

	public int find(int N) { // �ִ밪�� ã�ƺ���
		// N ���� ���ڸ� �޾Ƽ�
		int[] pizza = new int[N];
		int m = 0;
		// ��� �迭�� ���ư��鼭 Ȯ���ϰ�;�
		// ū N �� ���� ��� ������ 1�θ���� �ƴѰ� �� ������;�
		pizza[0] = N;
		if (pizza[0] == 1) {
			n = 0;
		} else {
			// �ٸ� �迭�� �������;�
			// �׸��� 1�� �ƴѰ� ã�Ƽ� ������� ��ſ��� ���� ���ϰ������
			// ��� ����������
			// 2. m / n ���� ������ �ִ밪 ���ϱ�
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
