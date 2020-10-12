package doit.chap03;

import java.util.Scanner;

// :: 이진탐색 for문 이용
public class SeqSearchFor {
	static int seqSearch(int[] a, int n, int key) {
		for (int i = 0; i < n; i++) {
			if (a[i] == key) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("갯수 : ");
		int num = stdIn.nextInt();

		int[] x = new int[num];

		for (int i = 0; i < num; i++) {
			System.out.println("x[" + i + "] : ");
			x[i] = stdIn.nextInt();
		}
		System.out.println("검색할 값 : "); // 키 값 입력
		int ky = stdIn.nextInt();
		int idx = seqSearch(x, num, ky);

		if (idx == -1) {
			System.out.println("그 값의 요소가 없습니다.");
		} else {
			System.out.println(ky + "는 x[" + idx + "] 에 있습니다.");
		}
	}
}
