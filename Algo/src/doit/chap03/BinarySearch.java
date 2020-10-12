package doit.chap03;

import java.util.Arrays;
import java.util.Scanner;

//:: 기본 자료형 배열에서 메소드 작성해서 작성
public class BinarySearch {
	public static void main(String[] args) {
		Scanner StdIn = new Scanner(System.in);

		System.out.println("요소 갯수 : ");
		int num = StdIn.nextInt();
		int[] x = new int[num];

		System.out.println("오름 차순으로 입력하세요");

		System.out.println("x[0] : ");
		x[0] = StdIn.nextInt();

		for (int i = 1; i < num; i++) {
			do {
				System.out.println("x[" + i + "] : ");
				x[i] = StdIn.nextInt(); // 입력된 값으로 순차적으로 대입
			} while (x[i] < x[i - 1]);
		}
		System.out.println("검색할 값 : ");
		int ky = StdIn.nextInt();

		int idx = Arrays.binarySearch(x, ky); // 배열 x 에서 ky 인 요소를 검색

		if (idx < 0)
			System.out.println("그 값의 요소가 없습니다.");
		else
			System.out.println(ky + "는 x[" + idx + "] 에 있습니다.");
	}
}
