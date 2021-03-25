package LeetCode.String;

public class AddStrings {
	public static void main(String[] args) {
		AddStrings aa = new AddStrings();
		String num1 = "3850";
		String num2 = "273";
		aa.addStrings(num1, num2);
	}

	public String addStrings(String num1, String num2) {
		int one = 0;
		int two = 0;
		int len1 = num1.length();
		int len2 = num2.length();
		char[] ret = null;
		int carry = 0;
		int n = 0;
		char fir[] = num1.toCharArray();
		char sec[] = num2.toCharArray();

		if (len1 > len2) {
			for (int i = len1; i > 0; i--) {
				// String 문자열의 길이가 긴것 만큼 반복
				n = (int) fir[i] + (int) sec[i];
				// char 형에서 int 형으로 바꾸어서 연산.
				if (n > 10) {
					// 합이 10이 넘어가면 carry =1;
					carry = n / 10; // 10이 넘어가는
					n = n % 10; // 10 으로 나눈 나머지
				}
				ret[i] = (char) n;
			}
		}
		return "ans";
	}
}
