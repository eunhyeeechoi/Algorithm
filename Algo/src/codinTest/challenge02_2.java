package codinTest;

import java.util.Arrays;
import java.util.Stack;

//https://memostack.tistory.com/14
//https://herong.tistory.com/entry/PowerSet%EB%B6%80%EB%B6%84%EC%A7%91%ED%95%A9
public class challenge02_2 {
	public String solution(String s) {
		String answer = "";
		char[] b = s.toCharArray();
		Stack<Character> stack = new Stack<>();
		search(stack, 0);
		return answer;
	}

	static void search(Stack<Character> stack, int k) {
//		if (k >= b.length) {
//
//		} else {
//			stack.push(b[k]);
//
//		}
	}

	public static void main(String[] args) {
		String s = "baba";
		challenge02_2 aa = new challenge02_2();
		aa.solution(s);
	}
}
