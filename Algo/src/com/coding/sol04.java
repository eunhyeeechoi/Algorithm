package com.coding;

public class sol04 {
	public int solution(int n) {
		int answer = 0;
		while (n != 0) {
			answer += n % 10;
			System.out.println("������ : " + answer);
			n /= 10;
			System.out.println("n �� : " + n);
		}
		return answer;
	}

	public static void main(String[] args) {
		sol04 ss = new sol04();
		int ans = ss.solution(987);
		System.out.println(ans);
	}
}
