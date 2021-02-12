package hackerrank.DP;

import java.io.IOException;

//https://geehye.github.io/hackerrank-06/#
public class MaxArraySum_2 {
	static int maxSubsetSum(int[] arr) {
		int max = 0;

		int[] dp = new int[arr.length + 1];
		dp[0] = 0;
		dp[1] = arr[0];
		dp[2] = arr[1];
		for (int i = 3; i <= arr.length; i++) {
			int tmp = Math.max(dp[i - 2], dp[i - 3]);
			if (0 <= arr[i - 1])
				dp[i] = Math.max(arr[i - 1], tmp + arr[i - 1]);
			else
				dp[i] = tmp;

			max = Math.max(max, dp[i]);
		}
		return max;
	}

	public static void main(String[] args) throws IOException {
		MaxArraySum aa = new MaxArraySum();
		int[] bb = { 3, 7, 4, 6, 5 };
		aa.maxSubsetSum(bb);
	}
}
