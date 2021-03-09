package hackerrank.reqursion;

public class FibonacciNumbers_2 {
	static int fibonacciN[] = {};

	// https://hanhyx.tistory.com/34
	public static int fibonacci(int n) {
		// Complete the function.
		if (n == 0) {
			return 0;
		} else if (n == 1) {
			return 1;
		} else if (fibonacciN[n] != 0) {
			return fibonacciN[n];
		} else {
			return fibonacciN[n] = fibonacci(n - 1) + fibonacci(n - 2);
		}
	}

	public static void main(String[] args) {
		fibonacciN = new int[30];
		int n = 3;
		System.out.println(fibonacci(n));
	}
}
