package baekjoon.DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class t9461_2 {
	// 백준 파도반 수열
	// https://st-lab.tistory.com/127

	public static Long[] seq = new Long[101];

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		seq[0] = 0L;
		seq[1] = 1l;
		seq[2] = 1L;
		seq[3] = 1L;

		int T = Integer.parseInt(br.readLine());

		while (T-- > 0) {
			sb.append(padovan(Integer.parseInt(br.readLine()))).append('\n');
		}
		System.out.println(sb);
	}

	private static long padovan(int N) {
		if (seq[N] == null) {
			seq[N] = padovan(N - 2) + padovan(N - 3);
		}
		return seq[N];
	}
}
