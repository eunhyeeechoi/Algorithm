package baekjoon.Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class t15903 {
	// ���� 15903 ī�� ��ü ����
	static int[] aa;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine()); // ī�� ���� n
		int b = Integer.parseInt(br.readLine()); // ī�� ��ü Ƚ�� m
		int c = Integer.parseInt(br.readLine()); // �������� ��
		int d = Integer.parseInt(br.readLine()); // �������� ��
		int e = Integer.parseInt(br.readLine()); // �������� ��
		find(a, b, c, d, e);
	}

	public static int find(int a, int b, int c, int d, int e) {
		aa = new int[a]; // a ����ŭ �迭�� �����
		// int �迭 ����� �������� �����ؼ� ���� ���ϰ� ������ b��ŭ �ϸ� �ɰͰ���
		for (int i = 0; i < a; i++) {
			aa[i] = c;
		}
		Arrays.sort(aa);
		for (int i = 0; i < a; i++) {
			System.out.println(aa[i]);
		}
		return 1;
	}
}
