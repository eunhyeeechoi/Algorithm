package baekjoon.DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// baekjoon Dynamic programming
// 1�θ����
public class t1463 {
	int cnt = 0;

	public int sol(int n) {

//		System.out.println("���" + n);
		if (n % 3 == 0) {
			// 3���� ������ ���������� Ȯ��
			if (n == 1) {
				// n�� 1�̸� ����
				return cnt;
			} else {
				n = n / 3;
				sol(n);
				cnt++;
			}
		} else if (n % 2 == 0) {
			// 2�� ������ ���������� Ȯ��
			if (n == 1) {
				return cnt;
			} else {
//				System.out.println("���� ����Ÿ��?");
				n = n / 2;
				sol(n);
				cnt++;
			}
		} else {
			n = n - 1;
			cnt++;
			if (n == 1) {
				return cnt;
			} else {
				sol(n);
			}
//			System.out.println("���� ����Ÿ��?");
		}
		System.out.println("cnt �� " + cnt);
		return cnt;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String p = bf.readLine();
		new t1463().sol(Integer.parseInt(p));
		bf.close();
	}
}
