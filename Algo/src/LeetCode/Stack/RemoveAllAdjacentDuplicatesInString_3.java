package LeetCode.Stack;

import java.util.Stack;

public class RemoveAllAdjacentDuplicatesInString_3 {
	public static void main(String[] args) {
		RemoveAllAdjacentDuplicatesInString_3 aa = new RemoveAllAdjacentDuplicatesInString_3();
		String S = "abbaca";
		System.out.println(aa.removeDuplicates(S));

	}

	public String removeDuplicates(String S) {
		Stack<Character> stack = new Stack<>();
		for (char c : S.toCharArray()) {
			if (!stack.isEmpty() && stack.peek() == c) {
				stack.pop();
			} else {
				stack.push(c);
			}
		}
		StringBuilder builder = new StringBuilder("");
		for (char ch : stack) {
			builder.append(ch);
		}
		return builder.toString();
	}
}
