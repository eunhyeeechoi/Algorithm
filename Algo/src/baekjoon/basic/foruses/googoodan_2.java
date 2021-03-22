package baekjoon.basic.foruses;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class googoodan_2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		gogodan(N);
	}

	public static void gogodan(int n) {
		for (int i = 1; i < 10; i++) {
			System.out.println(n + " * " + i + " = " + n * i); 
		}

	}
}
