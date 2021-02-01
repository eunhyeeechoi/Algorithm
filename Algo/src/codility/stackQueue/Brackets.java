package codility.stackQueue;

import java.util.Stack;

public class Brackets {
	public int solution(String S) {
		// write your code in Java SE 8
		// 이방법은 갯수만 체크해서 안될거같애 짝이 맞는지 순서도 체크해야행
		// 어떻게 수정하면 좋을까??
		Stack<Character> stack = new Stack<>();

		for (int i = 0; i < S.length(); i++) {
			char c = S.charAt(i);

			if (c == '(') {
				stack.push(c);
			} else if (c == '{') {
				stack.push(c);
			} else if (c == '[') {
				stack.push(c);
			} else if (stack.empty()) {
				return 0;
			} else if (c == ')') {
				stack.pop();
			} else if (c == '}') {
				stack.pop();
			} else if (c == ']') {
				stack.pop();
			}

		}
		if (stack.empty()) {
			return 1;
		} else {
			return 0;
		}
	}
}
