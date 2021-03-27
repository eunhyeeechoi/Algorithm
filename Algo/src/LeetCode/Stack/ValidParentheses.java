package LeetCode.Stack;

// 이렇게 하면 괄호 순서가 안맞는거를 체크를 못해
// statck 도 안쓰고...
public class ValidParentheses {
	public boolean isValid(String s) {
		boolean ans = false;
		char[] chr = s.toCharArray();
		int n = 0;
		for (int i = 0; i < chr.length; i++) {
			if (chr[i] == '(') {
				n = n + 1;
			} else if (chr[i] == '{') {
				n = n + 2;
			} else if (chr[i] == '[') {
				n = n + 3;
			} else if (chr[i] == ')') {
				n = n - 1;
			} else if (chr[i] == '}') {
				n = n - 2;
			} else if (chr[i] == ']') {
				n = n - 3;
			}
		}
		if (n == 0) {
			ans = true;
		} else {
			ans = false;
		}
		return ans;
	}

	public static void main(String[] args) {
		ValidParentheses aa = new ValidParentheses();
		String s = "([)]";
		System.out.println(aa.isValid(s));
	}
}