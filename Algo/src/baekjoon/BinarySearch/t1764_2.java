package baekjoon.BinarySearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class t1764_2 {
	static int noli; // 듣지못한사람
	static int nosee; // 보지못한사람
	static int cnt; // 듣지도 보지도 못한사람

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		noli = Integer.parseInt(st.nextToken());
		nosee = Integer.parseInt(st.nextToken());

		String[] li = new String[noli];
		String[] see = new String[nosee];
		String[] noseeli;
		// 못들은사람, 못본사람 각각 나눠서 String 배열에 넣고
		// contains 일때마다 count 를 증가시키자
//		System.out.println("noli+nosee " + (noli + nosee));

		for (int i = 0; i < noli + nosee; i++) {
			if (i < noli) {
				li[i] = br.readLine().toString();
//				System.out.println(br.readLine().toString());
				// String 으로 바꿔야하넹
//				System.out.println("nolisten | " + br.readLine() + i);
			} else {
				see[i] = br.readLine().toString();
//				System.out.println(br.readLine().toString());
//				System.out.println("nosee  |  " + br.readLine() + i);
			}
		}

		if (noli > nosee) {
			
		}
	}
}
