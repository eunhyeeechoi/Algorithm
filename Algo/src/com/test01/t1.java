package com.test01;

//a�� b�� ���� ���� �� �� �ƹ� ���� �����ϼ���.
//a�� b�� -10,000,000 �̻� 10,000,000 ������ �����Դϴ�.
//a�� b�� ��Ұ���� ���������� �ʽ��ϴ�.
public class t1 {
	public long solution(int a, int b) {
		long answer = 0;
		if ((-10000000 <= a && a <= 10000000) && (-10000000 <= b && b <= 10000000)) {

			if (a < b) { // b�� a ���� Ŭ��
				for (int i = a; i <= b; i++) {
					answer = answer + i;
				}
			} else if (b < a) { // a�� b���� Ŭ��
				for (int i = b; i <= a; i++) {
					answer = answer + i;
				}
			} else if (a == b) { //������
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
