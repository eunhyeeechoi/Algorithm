package com.test01;

//���̰� n�̰�, ���ڼ��ڼ��ڼ�....�� ���� ������ �����ϴ� ���ڿ��� �����ϴ� �Լ�, solution�� �ϼ��ϼ���.
//������� n�� 4�̸� ���ڼ����� �����ϰ� 3�̶�� ���ڼ��� �����ϸ� �˴ϴ�.
public class t2 {
	public String solution(int n) {
		String answer = "";
		String a = "��";
		String b = "��";
		if (n % 2 == 0) { // ¦���϶�
			for (int i = 0; i < n / 2; i++) {
				answer = answer + a + b;
			}
		} else { // Ȧ���϶�
			for (int i = 0; i <= n / 2; i++) {
				answer = answer + a + b;
				System.out.println(n / 2);
			}
			answer = answer + a;
		}
		return answer;
	}

	public static void main(String[] args) {
		t2 tt = new t2();
		String ans = tt.solution(5);
		System.out.println(ans);
	}
}
