package codility.Maximumsliceproblem;

public class MaxProfit_2 {
	// Ό³Έν https://sustainable-dev.tistory.com/22
	public int solution(int[] A) {
		if (A.length == 1 || A.length == 0) {
			return 0;
		}

		int minPrice = A[0];
		int localMaxProfit = 0;
		int globalMaxProfit = 0;

		for (int i = 1; i < A.length; i++) {
			localMaxProfit = A[i] - minPrice;
			if (A[i] < minPrice) {
				minPrice = A[i];
			}

			globalMaxProfit = Math.max(localMaxProfit, globalMaxProfit);
		}

		if (globalMaxProfit < 0) {
			return 0;
		}
		return globalMaxProfit;
	}
}
