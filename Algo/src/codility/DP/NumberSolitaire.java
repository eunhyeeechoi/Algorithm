package codility.DP;

import java.util.Random;
 // �ڵ���Ƽ DP - 
public class NumberSolitaire {
	static int r = 0; // �ֻ��� �� ������
	static int p = 0; // �ֻ��� ��ġ
	static int q = 0; // �ֻ����� ������ �簢���� �� --> �����Ұ�

	public int solution(int[] A) {
		int l = A.length;
		q = A[p];
		Random ran = new Random();
//		if (p + r <= l) {
//			r = ran.nextInt(5) + 1;// 1~6 �ֻ��� �� ����
//			System.out.println("r �ӳ���" + r);
//		}
		while (p + r <= l) {
			r = ran.nextInt(5) + 1;// 1~6 �ֻ��� �� ����
//			System.out.println("r �ӳ���" + r);
			p = p + r;
			q += A[p];
//			System.out.println("q �� :" + q);
			if (r + p == l) {
				break;
			}
		}
//		System.out.println(q);
		return q;

//		if (r + p < l) { // �ֻ��� ���°� + ���൹ ��ġ�� �迭 ���̺��� ª���� �ݺ�
//			p = p + r;
//			q += A[p];
//		} else if (r + p == l) { // �ֻ��� ���°� + ���൹ ��ġ �� �迭 ���̸�ŭ �Ǹ� ����
//			p = p + r;
//			q += A[p];
//			return q;
//		}

	}

	public static void main(String[] args) {
		int[] A = { 1, -2, 0, 9, -1, -2 };
		NumberSolitaire aa = new NumberSolitaire();
		aa.solution(A);
//		System.out.println(aa);
	}
}
