package baekjoon.Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class t15903_2 {
	// ���� 15903 ī�� ��ü ����
	static int[] aa;
	static int m = 0; // ���� �ּڰ�

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int cardCnt = Integer.parseInt(st.nextToken()); // ī�� ����
		int loopCnt = Integer.parseInt(st.nextToken()); // ��ü Ƚ��

		st = new StringTokenizer(br.readLine());

		aa = new int[cardCnt];
		for (int i = 0; i < cardCnt; i++) {
			aa[i] = Integer.parseInt(st.nextToken());
		}

		Arrays.sort(aa);

		for (int j = 0; j < loopCnt; j++) {
			aa[j + 1] = aa[j] + aa[j + 1];
			aa[j] = aa[j] + aa[j + 1]; // ������ �̰� �ּ�..?
		}

		for (int p = 0; p < cardCnt; p++) {
			m += aa[p];
		}
		System.out.println(m);
	}

//	public static int find(int a, int b, int c, int d, int e) {
//		aa = new int[a]; // a ����ŭ �迭�� �����
//		// int �迭 ����� �������� �����ؼ� ���� ���ϰ� ������ b��ŭ �ϸ� �ɰͰ���
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
