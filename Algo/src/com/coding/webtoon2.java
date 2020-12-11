package com.coding;

public class webtoon2 {
	public int sol(int tar, int n) {
		// tar 값을 n진수로 변환하는 과정
		int ans = 0;
		if (tar % n >= 0) {
			// tar 값을 n으로 나눈 나머지값이 0보다 클때 계속 진행
			ans = tar / n;
			return ans + sol(tar, n);
		} else {
			return ans + 1;
			// 나머지값이 0이면 마지막 나누기 하고 리턴
		}
	}

	public static void main(String[] args) {

	}
}
