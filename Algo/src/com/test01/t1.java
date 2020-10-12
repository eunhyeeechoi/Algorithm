package com.test01;

//a와 b가 같은 경우는 둘 중 아무 수나 리턴하세요.
//a와 b는 -10,000,000 이상 10,000,000 이하인 정수입니다.
//a와 b의 대소관계는 정해져있지 않습니다.
public class t1 {
	public long solution(int a, int b) {
		long answer = 0;
		if ((-10000000 <= a && a <= 10000000) && (-10000000 <= b && b <= 10000000)) {

			if (a < b) { // b가 a 보다 클때
				for (int i = a; i <= b; i++) {
					answer = answer + i;
				}
			} else if (b < a) { // a가 b보다 클때
				for (int i = b; i <= a; i++) {
					answer = answer + i;
				}
			} else if (a == b) { //같을때
				answer = a;
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		t1 tt = new t1();
		int a = 3;
		int b = 5;
		long aa = tt.solution(a, b);
		System.out.println(aa);
	}
}
