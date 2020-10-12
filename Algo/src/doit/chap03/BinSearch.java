package doit.chap03;

import java.util.Scanner;

//::binary 검색
public class BinSearch {
	static int binSearch(int[] a, int n, int key) {
		int pl = 0; // 검색 범위의 첫 인덱스
		int pr = n - 1; // 검색 범위의 끝 인덱스
		do {
			int pc = (pl + pr) / 2;
			if (a[pc] == key) {
				return pc;
			} else if (a[pc] < key) {
				pl = pc + 1; //
			} else {
				pr = pc - 1;
			}

		} while (pl <= pr);

		return -1;
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("요소 갯수 : ");
		int num = stdIn.nextInt();
		int[] x = new int[num]; // 요소수가 num 개인 배열

		System.out.println("오름 차순 순으로 입력하세요");

		System.out.println("x[0] : "); // 요소 입력 시작
		x[0] = stdIn.nextInt();

		for (int i = 1; i < num; i++) {
			do {
				System.out.println("x[+" + i + "] :");
				x[i] = stdIn.nextInt();
			} while (x[i] < x[i - 1]);
		}
		System.out.println("검색 할 값 : ");
		int ky = stdIn.nextInt();

		int idx = binSearch(x, num, ky);

		if (idx == -1) {
			System.out.println("그 값의 요소가 없습니다.");
		} else {
			System.out.println(ky + "은 x[" + idx + "] 에 있습니다.");
		}
	}
}
