package doit.chap06;

public class BubbleSort {
//���� ���� �⺻

	// a[idx] �� a[idx2] �� ���� ��ȯ
	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}
}
