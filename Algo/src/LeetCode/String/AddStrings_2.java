package LeetCode.String;

public class AddStrings_2 {
//	https://github.com/Cee/Leetcode/blob/master/415%20-%20Add%20Strings.java
	public String addStrings(String num1, String num2) {
		int n = num1.length();
		int m = num2.length();

		StringBuilder ans = new StringBuilder();
		int carry = 0;

		for (int i = 0; i < Math.max(n, m); i++) {
			// 두개중에 더 긴것만큼 연산 왜 이걸 생각 못했으까 ..!
			int c1 = n - 1 - i >= 0 ? num1.charAt(n - 1 - i) - '0' : 0;
			int c2 = m - 1 - i >= 0 ? num2.charAt(m - 1 - i) - '0' : 0;
			// 합을 구할건데 0보다 크면 값을 더하고 0이거나 같으면 0을 연산!
			// 길이니까 가능하겠다 길이에서 지금 뒤에꺼부터 하나씩 줄여나가서 0보다 큰지비교 가능 !

			int c = c1 + c2 + carry;
			// 각 자리수의 합을 더해서 계산 하면 돼
			if (c >= 10) {
				// 연산 결과가 0보다 크면!
				c = c - 10;
				carry = 1;
			} else {
				carry = 0;
			}
			ans.append(c);

		}
		if (carry != 0) {
			ans.append(carry);
		} // 이렇게 하면 그담에 더해지는 c랑 덧셈연산 되나?
		return ans.reverse().toString();
	}
}
