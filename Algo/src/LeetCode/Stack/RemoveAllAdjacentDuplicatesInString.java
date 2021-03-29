package LeetCode.Stack;

import java.util.Stack;

public class RemoveAllAdjacentDuplicatesInString {
	public static void main(String[] args) {
		RemoveAllAdjacentDuplicatesInString aa = new RemoveAllAdjacentDuplicatesInString();
		String S = "abbaca";
		aa.removeDuplicates(S);
	}

	public String removeDuplicates(String S) {
		Stack<Character> aa = null;
//		for (int i = 0; i < S.length(); i++) {
		int i = 0;
		while (i < S.length()) {
			char c = S.charAt(i++);
			if (!aa.isEmpty()) {
				if (aa.peek() == c) {
					// 같으면 pop
					aa.pop();
				} else {
					// 다르면 스택에 삽입
					aa.push(c);
				}
			} else {
				aa.push(c);
			}
		}

		return aa.toString();
	}
}
