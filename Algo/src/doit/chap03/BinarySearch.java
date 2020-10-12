package doit.chap03;

import java.util.Arrays;
import java.util.Scanner;

//:: �⺻ �ڷ��� �迭���� �޼ҵ� �ۼ��ؼ� �ۼ�
public class BinarySearch {
	public static void main(String[] args) {
		Scanner StdIn = new Scanner(System.in);

		System.out.println("��� ���� : ");
		int num = StdIn.nextInt();
		int[] x = new int[num];

		System.out.println("���� �������� �Է��ϼ���");

		System.out.println("x[0] : ");
		x[0] = StdIn.nextInt();

		for (int i = 1; i < num; i++) {
			do {
				System.out.println("x[" + i + "] : ");
				x[i] = StdIn.nextInt(); // �Էµ� ������ ���������� ����
			} while (x[i] < x[i - 1]);
		}
		System.out.println("�˻��� �� : ");
		int ky = StdIn.nextInt();

		int idx = Arrays.binarySearch(x, ky); // �迭 x ���� ky �� ��Ҹ� �˻�

		if (idx < 0)
			System.out.println("�� ���� ��Ұ� �����ϴ�.");
		else
			System.out.println(ky + "�� x[" + idx + "] �� �ֽ��ϴ�.");
	}
}
