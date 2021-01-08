package algorithm.Greedy;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class t5545 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();// 토핑의 갯수

		// 토핑의 리스트, 내림차순 정렬을 위해 int 가 아닌
		// 래퍼 클래스인 Integer 로 선언
		Integer[] topKCal = new Integer[n];

		int doughPrice = sc.nextInt(); // 도우 가격
		int topPrice = sc.nextInt(); // 토핑 가격
		int douchKCal = sc.nextInt(); // 도우의 칼로리
		for (int i = 0; i < n; i++)
			topKCal[i] = sc.nextInt();

		int ans = douchKCal / doughPrice;
		// 토핑을 0개 넣은경우, 도우의 칼로리당 가격
		Arrays.sort(topKCal, Collections.reverseOrder());

		int tmpPrice = doughPrice;
		int tmpKCal = douchKCal;
		for (int i = 0; i < n; i++) {
			tmpKCal += topKCal[i];
			tmpPrice += topPrice;
			
			int tmpAns = tmpKCal / tmpPrice;
			// 토핑의 칼로리 / 가격 연산해서 1원당 가격이 이전 결과보다 작으면 종료

			if (ans > tmpAns) {
				break;
			} else {
				ans = tmpAns;
			}
		}
		System.out.println(ans);
	}
}