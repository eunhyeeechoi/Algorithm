package baekjoon.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// ���� ��ȣ
public class t9012 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int T = Integer.parseInt(br.readLine());

		while (T-- > 0) {
			sb.append(solve(br.readLine())).append('\n');
		}
		System.out.println(sb);
	}

	public static String solve(String s) {
		int count = 0;
		for (char c : s.toCharArray()) {
			// ���� ��ȣ�� ��� ī��Ʈ ����
			if (c == '(') {
				count++;
			}

			else if (count == 0) {
				return "NO";
			} else {
				count--;
			}

			// ��� Ž���� ������ �ܿ���Ұ� ������ count>0 / ���� ��ȣ�� ������� "NO"
			// ��Ұ� ��������� count==0 �϶��� ������ �����̹Ƿ� "YES"
		}
		if (count == 0) {
			return "YES";
		} else {
			return "NO";
		}
	}
}
