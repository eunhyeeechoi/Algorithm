package com.coding;

public class Solution03 {
	public int solution(int[] arr, int num) {
		int ans = 0;
		int hap = 0;
		for (int i = 0; i < arr.length; i++) {
			hap += arr[i];
			if(hap>0) {
			if (arr[i] / num > 1) { // �Ϸ� ��ĥ�� �ִ� �纸�� ������
				if (arr[i] / num % num > 0) {
					ans = ans + (arr[i] / num) + 1;
				} else {
					ans = ans + (arr[i] / num);
				}
			} else if (arr[i] == 0 && i > 0) {// ù���� �ƴϰ� �ñ�� 0���϶�
				ans++;
			} else if (arr[i] == 0) {// ���� 0�϶�

			}
		}
	}
		return ans;
	}

	public static void main(String[] args) {
		Solution03 ss = new Solution03();
		int[] bb = { 10, 0, 0, 4, 20 };
		int aa = ss.solution(bb, 8);
		System.out.println(aa);
	}
}
