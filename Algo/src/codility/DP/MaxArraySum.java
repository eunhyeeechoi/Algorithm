package codility.DP;

import java.io.IOException;
import java.util.Arrays;

public class MaxArraySum {
	// Complete the maxSubsetSum function below.
	static int maxSubsetSum(int[] arr) {
		int l = arr.length; // �迭 ����
		int n = 0;
		Arrays.sort(arr);
		int tmp=0;
		
		n = Math.max(arr[0], arr[l - 1]);
		// �迭 �ȿ� �ִ°͵��� �ִ���
		// �ִ� �κ����� ���� ���ؾ���
		System.out.println(n);
		return n;
	}

	public static void main(String[] args) throws IOException {
		MaxArraySum aa = new MaxArraySum();
		int[] bb = { 3, 7, 4, 6, 5 };
		aa.maxSubsetSum(bb);
	}
}
