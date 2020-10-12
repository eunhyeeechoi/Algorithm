package com.coding;

public class Solution02 {
	public int solution(String code) {
		int p = 0;
		String[] word = code.split("");
		for (int i = 0; i < word.length; i++) {
			p += getCount(word[i]);
		}
		return p;

	}

	public int getCount(String wor) {
		int cnt = 0;
		if (wor == "0") {
			cnt = 6;
		} else if (wor.equals("1")) {
			cnt = 2;
		} else if (wor.equals("2")) {
			cnt = 5;
		} else if (wor.equals("3")) {
			cnt = 5;
		} else if (wor.equals("4")) {
			cnt = 4;
		} else if (wor.equals("5")) {
			cnt = 5;
		} else if (wor.equals("6")) {
			cnt = 6;
		} else if (wor.equals("7")) {
			cnt = 4;
		} else if (wor.equals("8")) {
			cnt = 7;
		} else if (wor.equals("9")) {
			cnt = 6;
		}
		return cnt;
	}

	public static void main(String[] args) {
		Solution02 so = new Solution02();
		so.solution("12345");
	}

}