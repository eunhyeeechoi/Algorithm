package baekjoon.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

// https://st-lab.tistory.com/178
public class t9012_2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int T = Integer.parseInt(br.readLine());

		for (int i = 0; i < T; i++) {
			sb.append(solve(br.readLine())).append('\n');
		}
		System.out.println(sb);
	}

	public static String solve(String s) {
		Stack<Character> stack = new Stack<>();

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			// ���� ��ȣ�� ��� ���ÿ� �ִ´�.
			if (c == '(') {
				stack.push(c);
			}
			// �ݴ� ��ȣ�� ���
			// 1. ������ ����ִ� ���, �ݴ� ��ȣ�� �Է� �޾����� pop �Ұ��� ������ ¦�� �ȸ´°�
			else if (stack.empty()) {
				return "NO";
			} else {
				// 2. �׿��� ��� ���Ҹ� pop �Ѵ�.
				stack.pop();
			}
		}

		if (stack.empty()) {
			return "YES";
		} else {
			return "NO";
		}
	}
}
