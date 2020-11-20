package codinTest;

import java.util.Arrays;

public class challenge02 {
	public String solution(String s) {
		String answer = "";
		char[] b = s.toCharArray();
		Arrays.sort(b);
		for (int i = 0; i < b.length; i++) {
			System.out.println(b[i]);
		}
//		answer = Integer.parseInt(b[s.length()]);

		return answer;
	}

	public static void main(String[] args) {
		String s = "baba";
		challenge02 aa = new challenge02();
		aa.solution(s);
	}
}
