package codility.stackQueue;
// �ڵ���Ƽ - stack and queue - Fish

// https://app.codility.com/c/run/trainingJK6VT6-FGP/
//����� ũ�⸦ ���Ͽ� ����
// ù��° �Ұ����� ���ÿ� ��Ƽ� ������ ���ϰ� �ٸ��� ũ�⵵ ���ؼ� ������?
// 1) ó������ �̵��ϸ� ��
// 1.ũ�Ⱑ ���� ����ִ��� �� ũ�� pop �ϰ� �ƴϸ� ���� �迭�� ����?
// 2. ���� �ִ°Ŷ� ���ϸ� ����������?
// 2) �ƴϸ� ��ü�� ���ÿ� ��Ƶ�?

import java.util.LinkedList;
import java.util.Queue;

public class Fish {
	static int cnt; // ���� ������

	public int solution(int[] A, int[] B) {
		Queue<Fis> q = new LinkedList<Fis>();
		for (int i = 0; i < A.length; i++) {
//			if (A[i] < A[i + 1] && B[i] != B[i]) {
			q.offer(new Fis(A[i + 1], B[i + 1]));
			// 1. �ϴ� ���δ� �ְ�
			// 2. ���ؼ� �������°� ������?

//			}
		}
		return 1;
	}

	public static class Fis {
		int x; // ũ��
		int y; // ����
//		int cnt; // ���� ������

		public Fis(int x, int y) { // ������
			this.x = x;
			this.y = y;
//			this.cnt = cnt;

		}
	}

	public static void main(String[] args) {
		int[] A = { 4, 3, 2, 1, 5 }; // ũ��
		int[] B = { 0, 1, 0, 0, 0 }; // ����
		Fish ss = new Fish();
		ss.solution(A, B);
	}
}
