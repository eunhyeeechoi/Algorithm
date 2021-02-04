package codility.Sorting;

import java.util.Arrays;
// https://mingmi-programming.tistory.com/66
public class MaxProductOfThree_2 {
	public int solution(int[] A) {
		Arrays.sort(A);

		int i = A.length - 1;
		int answer = A[i] * A[i - 1] * A[i - 2];

		if (A[0] <= 0 && A[1] <= 0 && A[i] >= 0) {
			int answer2 = A[0] * A[1] * A[i];
			if (answer2 > answer)
				answer = answer2;
		}
		return answer;
	}
}
