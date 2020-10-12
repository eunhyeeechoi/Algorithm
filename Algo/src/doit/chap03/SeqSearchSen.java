package doit.chap03;

import java.util.Scanner;

//:: �����˻� - ���ʹ� Ȱ��
public class SeqSearchSen {
	// ��� ������ n�� �迭 a�� ���� key�� ���� ��Ҹ� ���ʹ����� �����˻�
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

		System.out.println("��� ���� : ");
		int num = stdIn.nextInt();
		int[] x = new int[num + 1]; // ��� ���� +1

		for (int i = 0; i < num; i++) {
			System.out.println("x[" + i + "] : ");
			x[i] = stdIn.nextInt();
		}

		System.out.println("�˻��� �� : ");
		int ky = stdIn.nextInt();

		int idx = seqSeqSen(x, num, ky);

		if (idx == -1)
			System.out.println("�� ���� ��Ұ� �����ϴ�.");
		else
			System.out.println(ky + "�� x[" + idx + "] �� �ֽ��ϴ�.");
	}
}
