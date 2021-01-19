package baekjoon.Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class t15903 {
	// 백준 15903 카드 합체 놀이
	static int[] aa;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = Integer.parseInt(br.readLine()); // 카드 갯수 n
		int b = Integer.parseInt(br.readLine()); // 카드 합체 횟수 m
		int c = Integer.parseInt(br.readLine()); // 정수들의 값
		int d = Integer.parseInt(br.readLine()); // 정수들의 값
		int e = Integer.parseInt(br.readLine()); // 정수들의 값
		find(a, b, c, d, e);
	}

	public static int find(int a, int b, int c, int d, int e) {
		aa = new int[a]; // a 개만큼 배열을 만들고
		// int 배열 만들고 오름차순 정렬해서 값을 더하고 덮어씌우고 b만큼 하면 될것같아
		for (int i = 0; i < a; i++) {
			aa[i] = c;
		}
		Arrays.sort(aa);
		for (int i = 0; i < a; i++) {
			System.out.println(aa[i]);
		}
		return 1;
	}
}
