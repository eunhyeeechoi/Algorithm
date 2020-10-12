package doit.chap03;

import java.util.Scanner;

//:: 선형검색 - 보초법 활용
public class SeqSearchSen {
	// 요소 갯수가 n인 배열 a에 대해 key와 같은 요소를 보초법으로 선형검색
	static int seqSeqSen(int[] a, int n, int key) {
		int i = 0;

		a[n] = key;
		while (true) {
			if (a[i] == key)
				break;
			i++;
		}
		return i == n ? -1 : i;
	}

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		System.out.println("요소 갯수 : ");
		int num = stdIn.nextInt();
		int[] x = new int[num + 1]; // 요소 갯수 +1

		for (int i = 0; i < num; i++) {
			System.out.println("x[" + i + "] : ");
			x[i] = stdIn.nextInt();
		}

		System.out.println("검색할 값 : ");
		int ky = stdIn.nextInt();

		int idx = seqSeqSen(x, num, ky);

		if (idx == -1)
			System.out.println("그 값의 요소가 없습니다.");
		else
			System.out.println(ky + "는 x[" + idx + "] 에 있습니다.");
	}
}
