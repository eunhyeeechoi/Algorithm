package com.coding;

//a = b + 1과 같이 assign은 허용이 되지만, 한번 a에 값이 assign 되면 a는 다른 값으로 바꿀 수 없는 언어가 있습니다.
//-        임의의 정수 N부터 M까지 더하는 프로그램을 작성해주세요. 
//
//제한사항 a 에 할당이 되고나면 다른값으로 바꿀 수 없는 언어
//구해야하는 것 : N~ M 까지 더하는 프로그램
public class naver {
	public int sol(int n, int m) {
		int answer = 0;
		int sum = n;
//		while (n < m) {
//			sum += m;
//			answer = sum;
//		}

		
		for (int i = n; i < m; i++) {
			
//			answer = sum+sol();
		}
		return answer;
	}

	public static void main(String[] args) {
		naver aa = new naver();
		int n = 3;
		int m = 10;
		aa.sol(n, m);
	}
}
