package com.coding;

//a = b + 1�� ���� assign�� ����� ������, �ѹ� a�� ���� assign �Ǹ� a�� �ٸ� ������ �ٲ� �� ���� �� �ֽ��ϴ�.
//-        ������ ���� N���� M���� ���ϴ� ���α׷��� �ۼ����ּ���. 
//
//���ѻ��� a �� �Ҵ��� �ǰ��� �ٸ������� �ٲ� �� ���� ���
//���ؾ��ϴ� �� : N~ M ���� ���ϴ� ���α׷�
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
