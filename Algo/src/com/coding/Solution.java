package com.coding;

public class Solution {
	int a = 0;
	int b = 0;
	int c = 0;
	int d = 0;
	int cnt = 0;

	public int solution(int n) {
		for (int i = 1; i < n; i++) {
			a = i / 1000;
			b = i / 100;
			c = i % 100 / 10;
			d = i % 100 % 10;
		}
		if (n > 1000) {
			if (a == b && b == c && c == d) {

			} else {
				cnt++;
			}
		} else if (n > 100) {
			if (b == c && c == d) {

			} else {
				cnt++;
			}

		} else if (n > 10) {
			if (c == d) {

			} else {
				cnt++;
			}
		} else {
			cnt++;
		}

		return cnt;

	}

	public static void main(String[] args) {
		Solution ss = new Solution();
		int bb = ss.solution(100);
		System.out.println(bb);
	}
}