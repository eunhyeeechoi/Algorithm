package codility.Maximumsliceproblem;

public class MaxProfit {
	public int solution(int[] A) {
		int max = A[0];
		int min = A[0];

		for (int i = 0; i < A.length; i++) {
			if (max < A[i]) {
				max = A[i];
			} else if (min > A[i]) {
				min = A[i];
			}
		}
		System.out.println("ÃÖ´ñ°ª : " + max + " ÃÖ¼Ú°ª : " + min);
		System.out.println("Â÷ °è»ê " + (max - min));
		// write your code in Java SE 8
		return 1;
	}

	public static void main(String[] args) {
		int[] A = { 23171, 21011, 21123, 21366, 21013, 21367 };
		MaxProfit aa = new MaxProfit();
		aa.solution(A);
	}
}
