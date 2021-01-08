package algorithm.Greedy;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class t5545 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();// ������ ����

		// ������ ����Ʈ, �������� ������ ���� int �� �ƴ�
		// ���� Ŭ������ Integer �� ����
		Integer[] topKCal = new Integer[n];

		int doughPrice = sc.nextInt(); // ���� ����
		int topPrice = sc.nextInt(); // ���� ����
		int douchKCal = sc.nextInt(); // ������ Į�θ�
		for (int i = 0; i < n; i++)
			topKCal[i] = sc.nextInt();

		int ans = douchKCal / doughPrice;
		// ������ 0�� �������, ������ Į�θ��� ����
		Arrays.sort(topKCal, Collections.reverseOrder());

		int tmpPrice = doughPrice;
		int tmpKCal = douchKCal;
		for (int i = 0; i < n; i++) {
			tmpKCal += topKCal[i];
			tmpPrice += topPrice;
			
			int tmpAns = tmpKCal / tmpPrice;
			// ������ Į�θ� / ���� �����ؼ� 1���� ������ ���� ������� ������ ����

			if (ans > tmpAns) {
				break;
			} else {
				ans = tmpAns;
			}
		}
		System.out.println(ans);
	}
}