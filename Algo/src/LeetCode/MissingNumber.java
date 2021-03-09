package LeetCode;

import java.util.Arrays;

public class MissingNumber {
	public int missingNumber(int[] nums) {
		int n = nums.length;
		int answer = 0;
		Arrays.sort(nums);
		for (int i = 0; i < n; i++) {
			if (nums[i] != i + 1) {
				answer = i + 1;
			}
		}
//		System.out.println(answer);
		return answer;
	}

	public static void main(String[] args) {
//		int[] nums = { 3, 0, 1 };
//		int[] nums = { 0, 1 };
//		int[] nums = { 9, 6, 4, 2, 3, 5, 7, 0, 1 };
		int[] nums = {0};
		MissingNumber aa = new MissingNumber();
		aa.missingNumber(nums);
	}
}
