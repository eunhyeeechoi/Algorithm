package doit.chap06;

public class BubbleSort {
//버블 정렬 기본

	// a[idx] 와 a[idx2] 의 값을 교환
	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}
}
