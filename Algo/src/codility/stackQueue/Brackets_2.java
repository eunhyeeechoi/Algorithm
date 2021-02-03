package codility.stackQueue;

import java.util.Stack;
// https://mingmi-programming.tistory.com/112
public class Brackets_2 {
	public int solution(String S) {
		// write your code in Java SE 8
		Stack<Integer> st = new Stack<>();

		for (char c : S.toCharArray()) {
			switch (c) {
			case '(':
				st.push(1);
				break;
			case '{':
				st.push(2);
				break;
			case '[':
				st.push(3);
				break;
			case ')':
				if (st.size() <= 0)
					return 0;
				if (st.pop() != 1)
					return 0;
				break;
			case '}':
				if (st.size() <= 0)
					return 0;
				if ((st.pop() != 2))
					return 0;
				break;
			case ']':
				if (st.size() <= 0)
					return 0;
				if (st.pop() != 3)
					return 0;
				break;
			}
		}
		if (st.size() > 0)
			return 0;
		return 1;
	}
}
