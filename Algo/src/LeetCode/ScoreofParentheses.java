package LeetCode;

import java.util.Stack;

// https://eunhyejung.github.io/algorithm/2018/08/09/leetcode856.html
public class ScoreofParentheses {
	public int scoreOfParentheses(String S) {
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(0);

		for (char c : S.toCharArray()) {
			if (c == '(') {
				stack.push(0);
			} else {
				int v = stack.pop();// ÇÑ¹ø ²¨³»°í
				System.out.println("v" + v);
				int w = stack.pop(); // ¿Ö ¶Ç ²¨³»µð
				System.out.println("w" + w);
				stack.push(w + Math.max(2 * v, 1));
			}
		}
//		System.out.println(stack.pop());
		return stack.pop();
	}

	public static void main(String[] args) {
		ScoreofParentheses aa = new ScoreofParentheses();
		String S = "(()(()))";
		int bb = aa.scoreOfParentheses(S);
		System.out.println(bb);
	}
}
