package baekjoon.DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class t14606 {
	static int n = 0; // ��ſ��� ����
	static int pizza[]; // ���� N���� ����

	public int find(int N) { // �ִ밪�� ã�ƺ���
		// N ���� ���ڸ� �޾Ƽ�
		int[] pizza = new int[N];
		// ��� �迭�� ���ư��鼭 Ȯ���ϰ�;�
		// ū N �� ���� ��� ������ 1�θ���� �ƴѰ� �� ������;�
		pizza[0] = N;
		if (pizza[0] == 1) {
			n = 0;
		} else {
			// �ٸ� �迭�� �������;�
			// �׸��� 1�� �ƴѰ� ã�Ƽ� ������� ��ſ��� ���� ���ϰ������
			pizza[1] = N - 1;
			pizza[2] = 1;
			// ��� ����������
			// 1. �Ѱ��� 1�θ���� N-1
			// 2. m / n ���� ������ �ִ밪 ���ϱ�
		}
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int pN = Integer.parseInt(br.readLine());
	}
}
