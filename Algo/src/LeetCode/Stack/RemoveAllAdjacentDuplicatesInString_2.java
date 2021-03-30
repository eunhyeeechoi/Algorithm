package LeetCode.Stack;

import java.util.Stack;

public class RemoveAllAdjacentDuplicatesInString_2 {
	public static void main(String[] args) {
		String S = "abbaca";
		System.out.println(removeDuplicates(S));

	}
// 이거 에러남... ㅎ...
	public static String removeDuplicates(String S) {
		char[] chr = S.toCharArray();
		Stack<Character> str = null;
		for (int i = 0; i < S.length(); i++) {
			if (str.isEmpty()) {
				// 비어있으면
				str.push(chr[i]);
				continue;
			} else {
				// 비어있지 않으면
				if (str.peek() == chr[i]) {
					str.pop();
					continue;
				} else {
					str.push(chr[i]);
				}
			}
		}
		return str.toString();
	}
}
