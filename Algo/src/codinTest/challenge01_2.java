package codinTest;

public class challenge01_2 {
	public int solution(int n, int[] v) {
		int answer = 0;
		int left = 0; // ������
		int right = 0; // ��������
		int q[] = new int[v.length];
		int rright = 0;
		for (int i = 0; i < v.length; i++) {
			rright += v[i];// ��ü ���� ��
			System.out.println(rright);
			if (rright - left == 0) {
				answer = 0;
			}
		}
//		System.out.println("��ü �迭�� ��" + rright);

		// ���� ����, �������� ���� ���ұ�
		for (int i = 0; i < v.length; i++) {
			for (int j = 0; j <= i; j++) {
				left += v[j];
			}
			for (int p = i + 1; p < v.length; p++) {
				right += v[p];
			}

			// �ΰ��� ���� �迭�� ����
			if (right > left) {
				q[i] = right - left;
			} else if (right < left) {
				q[i] = left - right;
			} else if (right - left == 0) {
				// �̹� ���̰� 0�ΰ�� �ٷ� ����
				answer = i + 1;
			}
			left = 0;
			right = 0;
		}
		int min = 0;
		int j = 0;
		// �迭 �� �ּҰ��� ���� ��ġ ����
		for (int z = 0; z < q.length; z++) {
			if (q[z] < q[min]) {
				min = z;
				j = z;
//				System.out.println("�ּҰ��� " + min + " �ڸ���" + (j + 1));
				answer = j + 1;
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		int n = 5;
		int[] v = { 1, 2, 1, 2, 1 };
//		int n = 7;
//		int[] v = { 3, 2, 3, 4, -1, -2, -3 };

//		 ���ʰ��� 0���϶� �����ʹ迭�� ���� 0�ΰ��
//		int n = 4;
//		int[] v = { -2, -2, 3, 1 };
		challenge01_2 aa = new challenge01_2();
		int qq = aa.solution(n, v);
		System.out.println("�ּҰ��� ������ ���� �迭�� ���� " + qq);
	}
}
