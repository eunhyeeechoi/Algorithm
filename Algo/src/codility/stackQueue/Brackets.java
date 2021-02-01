package codility.stackQueue;

import java.util.Stack;

public class Brackets {
	public int solution(String S) {
		// write your code in Java SE 8
		// �̹���� ������ üũ�ؼ� �ȵɰŰ��� ¦�� �´��� ������ üũ�ؾ���
		// ��� �����ϸ� ������??
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
