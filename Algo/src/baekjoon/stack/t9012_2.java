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
			// 여는 괄호일 경우 스택에 넣는다.
			if (c == '(') {
				stack.push(c);
			}
			// 닫는 괄호일 경우
			// 1. 스택이 비어있는 경우, 닫는 괄호를 입력 받았지만 pop 할것이 없을때 짝이 안맞는것
			else if (stack.empty()) {
				return "NO";
			} else {
				// 2. 그외의 경우 원소를 pop 한다.
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
