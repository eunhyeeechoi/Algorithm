package baekjoon.reqursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class t6603 {
	private static boolean[] visited;
	private static int[] s;
	private static int k;

	public static void dfs(int cnt, int idx, String answer) {
		if (cnt == 6) {
			System.out.println(answer.substring(1));
			return;
		}

		for (int i = idx; i < s.length; i++) {
			if (!visited[i]) {
				visited[i] = true;
				dfs(cnt + 1, i, answer + " " + s[i]);
				visited[i] = false;
			}
		}

	}

	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			while (true) {
				String[] brStr = br.readLine().split(" ");
				if (brStr[0].equals("0"))
					break;

				k = Integer.parseInt(brStr[0]);
				s = new int[brStr.length - 1];
				for (int i = 0; i < s.length; i++) {
					s[i] = Integer.parseInt(brStr[i + 1]);
				} // for end

				visited = new boolean[k];

				dfs(0, 0, "");
				System.out.println();

			} // while end

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}