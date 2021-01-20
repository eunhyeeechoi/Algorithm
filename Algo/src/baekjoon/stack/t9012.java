package baekjoon.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class t9012 {
	static String[] insert; // 입력되는 문자열 갯수 (괄호덩어리)
	static String[] out; // 리턴할것 YES, NO

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		StringTokenizer Scnt = new StringTokenizer(br.readLine());
		int Scnt = Integer.parseInt(br.readLine());
		insert = new String[Scnt]; // 갯수 먼저 꺼내고
		for (int i = 0; i < Scnt; i++) {
			insert[i] = br.readLine(); // 각각의 문자열 덩어리 넣고
//			System.out.println(insert[i]);
		}

	}

}
