package LeetCode.Stack;

import java.util.Stack;
// stack 을 이용한 문자열 처리 문제
// 참고 - https://leetcode.com/problems/decode-string/discuss/87534/Simple-Java-Solution-using-Stack
public class DecodeString {
	public static void main(String[] args) {
		DecodeString aa = new DecodeString();
		String s = "3[a]2[bc]";
		System.out.println(aa.decodeString(s));

	}

	public String decodeString(String s) {
		Stack<StringBuilder> st = new Stack();
		Stack<Integer> it = new Stack();
		// s 를 split 으로 잘라야하나? ㅎㅎㅎ 오또카징
		// 두개의 스택으로 나누어서 stringbuilder 에 반복 되는 문자열들을 넣을거구
		// int 로 구성된 스택에 반복 수를 나눠서 저장할고야
		StringBuilder cur = new StringBuilder(); // 반복된 문자열들이 저장될 변수
		int k = 0;
		for (char c : s.toCharArray()) {
			if (Character.isDigit(c)) { // 문자열이 숫자인지 판별 ㅎㅎ
				k = k * 10 + c - '0'; // 이게 무슨의미인지 잘 모르겠음 ㅎㅎ character 를 숫자로 바꾸는것
			} else if (c == '[') {
				// 여는 괄호가 시작되면 문자열을 담기 시작
				it.push(k); // it 스택에는반복 되는 수를 담고
				st.push(cur); // 문자열 스택에는 문자열들을 담음
				cur = new StringBuilder();
				k = 0;
			} else if (c == ']') {
				StringBuilder tmp = cur; // tmp 변수에다가 반복된 변수 값을 저장
				cur = st.pop(); // 꺼내주기 !
				for (k = it.pop(); k > 0; --k)
					cur.append(tmp); // 반복 횟수만큼 반복해서 cur 에 추가
			} else {
				// 그냥 추가해주면 됌
				cur.append(c);
			}
		}
		return cur.toString();
	}
}
