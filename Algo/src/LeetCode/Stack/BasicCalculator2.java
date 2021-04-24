package LeetCode.Stack;

import java.util.Stack;

public class BasicCalculator2 {
	// 이거 에러나 ㅎㅎㅎ
	public static void main(String[] args) {
		String s = "3+2*2";
		BasicCalculator2 aa = new BasicCalculator2();
		aa.calculate(s);
	}

	public int calculate(String s) {
		Stack<Integer> it = new Stack();
		int k = 0;
		for (char ch : s.toCharArray()) {
			if (Character.isDigit(ch)) {
				k = k * 10 + ch - '0';
				it.push(k);
//				System.out.println(k);
			} else if (ch == '*') {
				k = k * 10 + ch - '0';
				int p = it.peek() * k;
				it.push(p);
			} else if (ch == '/') {
				k = k * 10 + ch - '0';
				int q = it.peek() / k;
				it.push(q);
			}
		}
		int q = it.pop();
//		for (int i = 0; i < it.size(); i++) {
//			q = it.pop() ;
//		}
		System.out.println(q);
		return q;
	}

}
