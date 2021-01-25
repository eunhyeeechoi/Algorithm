package baekjoon.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 백준 괄호
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
			// 여는 괄호일 경우 카운트 증가
			if (c == '(') {
				count++;
			}

			else if (count == 0) {
				return "NO";
			} else {
				count--;
			}

			// 모든 탐색이 끝나고 잔여요소가 있으면 count>0 / 여는 괄호가 만은경우 "NO"
			// 요소가 비어있으면 count==0 일때는 온전한 수식이므로 "YES"
		}
		if (count == 0) {
			return "YES";
		} else {
			return "NO";
		}
	}
}
