package codility.Sorting;

import java.util.Arrays;

public class MaxProductOfThree {
	public int solution(int[] A) {
		Arrays.sort(A);
		int ans = 0 ;
		// �ǳ����� ���� ���ϸ� ��
		for (int i = A.length - 3; i < A.length; i++) {
			ans=A[i];
			ans = ans * A[i];
			System.out.println(A[i]);
//			System.out.println(ans);
		}
//		System.out.println(ans);
		return ans;
	}

	public static void main(String[] args) {
		int[] A = { -3, 1, 2, -2, 5, 6 };
		MaxProductOfThree aa = new MaxProductOfThree();
		aa.solution(A);
	}
}
