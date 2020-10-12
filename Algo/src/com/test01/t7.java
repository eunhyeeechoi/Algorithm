package com.test01;

public class t7 {
	public String solution(String s) {
		String answer = "";
		char aa[] = s.toCharArray();
		int len = aa.length;
		if (len % 2 == 0) {
			for (int i = (len/2)-1; i <= len/2; i++) {
				answer += aa[i];
			}
		} else {
			answer = Character.toString(aa[len/2]) ;
		}
		return answer;
	}

	public static void main(String[] args) {
		t7 real = new t7();
		String a=  real.solution("abcde");
		System.out.println(a);
	}
}
