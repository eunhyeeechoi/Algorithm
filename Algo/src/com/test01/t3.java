package com.test01;

public class t3 {
	public String solution(String[] seoul) {
		String answer = null;
		for (int i = 0; i < seoul.length; i++) {
			if (seoul[i].equals("Kim")) {
				answer = "�輭����" + i + "�� �ִ�.";
			} else {
				answer = "aa";
			}
		}
		return answer;

	}

	public static void main(String[] args) {
		String[] aa = { "Jane", "Kim" };
		t3 bb = new t3();
		String ret = bb.solution(aa);
		System.out.println(ret);
	}
}
