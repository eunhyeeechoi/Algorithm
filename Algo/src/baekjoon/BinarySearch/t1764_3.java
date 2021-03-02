package baekjoon.BinarySearch;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class t1764_3 {
// 백준 듣보잡 - https://www.acmicpc.net/problem/1764
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		sc.nextLine();

		// sol
		// 1. 듣도보도 못한 사람을 list 에 담아준다
		// 2. binary Search 를 사용하기 위해 오름차순 정렬
		// 3. 트리안에 값이 있을때 해당 index 를 반환 하고 값이 있을 경우 answerList 에 담아줌
		// 4. 결과를 사전순으로 출력하기 위해 한번 더 오름차순 정렬
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
