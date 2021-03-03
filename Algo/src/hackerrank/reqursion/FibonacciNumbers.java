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
		// �Լ��� �ѹ� ȣ�� �ɶ����� �ι� �Լ��� ȣ�� �ϹǷ� ���̳ʸ� Ʈ�� ������ �ȴ�.
		// ����� ������ �Լ� ȣ�� Ƚ���� �����Ƿ� �ð����⵵�� O(N2)
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		scanner.close();
		System.out.println(fibonacci(n));
	}
}
