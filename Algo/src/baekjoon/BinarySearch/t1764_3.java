package baekjoon.BinarySearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class t1764_3 {
// ���� �躸�� - https://www.acmicpc.net/problem/1764
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		sc.nextLine();

		// sol
		// 1. �赵���� ���� ����� list �� ����ش�
		// 2. binary Search �� ����ϱ� ���� �������� ����
		// 3. Ʈ���ȿ� ���� ������ �ش� index �� ��ȯ �ϰ� ���� ���� ��� answerList �� �����
		// 4. ����� ���������� ����ϱ� ���� �ѹ� �� �������� ����
		ArrayList<String> list = new ArrayList<String>();
		for (int i = 0; i < n; i++) {
			String s = sc.nextLine();
			list.add(s);
		}
		Collections.sort(list);
		String[] ary = new String[list.size()];
		ary = list.toArray(ary);

		ArrayList<String> answerList = new ArrayList<String>();

		for (int i = 0; i < m; i++) {
			String s = sc.nextLine();
			int index = Arrays.binarySearch(ary, s);
			if (index >= 0) {
				answerList.add(s);
			}
		}
		Collections.sort(answerList);

		System.out.println(answerList.size());
		for (String s : answerList) {
			System.out.println(s);
		}
	}
}
