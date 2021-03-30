package LeetCode.Stack;

import java.util.Stack;

public class BasicCalculator2_2 {
	public static void main(String[] args) {
		String s = "3+2*2";
		BasicCalculator2_2 aa = new BasicCalculator2_2();
		System.out.println(aa.calculate(s));

	}

	public int calculate(String s) {
		int len;
		if (s == null || (len = s.length()) == 0)
			return 0;
		Stack<Integer> stack = new Stack<Integer>();
		int num = 0;
		char sign = '+';
		for (int i = 0; i < len; i++) {
			if (Character.isDigit(s.charAt(i))) {
				num = num * 10 + s.charAt(i) - '0';
			}
			if ((!Character.isDigit(s.charAt(i)) && ' ' != s.charAt(i)) || i == len - 1) {
				if (sign == '-') {
					stack.push(-num);
				} else if (sign == '+') {
					stack.push(num);
				} else if (sign == '*') {
					stack.push(stack.pop() * num);
				} else if (sign == '/') {
					stack.push(stack.pop() / num);
				}
				sign = s.charAt(i);
				num = 0;
			}
		}
		int re = 0;
		for (int i : stack) {
			re += i;
		}
		return re;
	}
}
