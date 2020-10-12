package com.coding;

public class Solution03 {
	public int solution(int[] arr, int num) {
		int ans = 0;
		int hap = 0;
		for (int i = 0; i < arr.length; i++) {
			hap += arr[i];
			if(hap>0) {
			if (arr[i] / num > 1) { // 하루 고칠수 있는 양보다 많을때
				if (arr[i] / num % num > 0) {
					ans = ans + (arr[i] / num) + 1;
				} else {
					ans = ans + (arr[i] / num);
				}
			} else if (arr[i] == 0 && i > 0) {// 첫날이 아니고 맡긴게 0개일때
				ans++;
			} else if (arr[i] == 0) {// 전부 0일때

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
