package hackerrank.reqursion;

import java.util.Scanner;
// https://makedotworld.tistory.com/8

public class FibonacciNumbers {
	public static int fibonacci(int n) {
		if (n == 0) {
			return 0;
		} else if (n == 1) {
			return 1;
		} else {
			return fibonacci(n - 1) + fibonacci(n - 2);
		}
		// 함수가 한번 호출 될때마다 두번 함수를 호출 하므로 바이너리 트리 구조가 된다.
		// 노드의 갯수가 함수 호출 횟수와 같으므로 시간복잡도는 O(N2)
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.close();
		System.out.println(fibonacci(n));
	}
}
