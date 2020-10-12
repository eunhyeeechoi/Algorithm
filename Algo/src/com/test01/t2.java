package com.test01;

//길이가 n이고, 수박수박수박수....와 같은 패턴을 유지하는 문자열을 리턴하는 함수, solution을 완성하세요.
//예를들어 n이 4이면 수박수박을 리턴하고 3이라면 수박수를 리턴하면 됩니다.
public class t2 {
	public String solution(int n) {
		String answer = "";
		String a = "수";
		String b = "박";
		if (n % 2 == 0) { // 짝수일때
			for (int i = 0; i < n / 2; i++) {
				answer = answer + a + b;
			}
		} else { // 홀수일때
			for (int i = 0; i <= n / 2; i++) {
				answer = answer + a + b;
				System.out.println(n / 2);
			}
			answer = answer + a;
		}
		return answer;
	}

	public static void main(String[] args) {
		t2 tt = new t2();
		String ans = tt.solution(5);
		System.out.println(ans);
	}
}
