package com.coding;

public class webtoon2 {
	public int sol(int tar, int n) {
		// tar ���� n������ ��ȯ�ϴ� ����
		int ans = 0;
		if (tar % n >= 0) {
			// tar ���� n���� ���� ���������� 0���� Ŭ�� ��� ����
			ans = tar / n;
			return ans + sol(tar, n);
		} else {
			return ans + 1;
			// ���������� 0�̸� ������ ������ �ϰ� ����
		}
	}

	public static void main(String[] args) {

	}
}
