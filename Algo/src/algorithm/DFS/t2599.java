package algorithm.DFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class t2599 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[][] students = new int[3][2];

		for (int i = 0; i < 3; i++) {
			String[] inp = br.readLine().split(" ");
			students[i][0] = Integer.parseInt(inp[0]);
			students[i][1] = Integer.parseInt(inp[1]);
		}
		br.close();

		for (int i = 0; i <= students[0][0]; i++) {
			int x = i;
			int ax = students[0][0] - x;
			int y = N - students[2][0] - students[2][1] - x;
			int by = students[1][0] - y;
			int z = students[0][1] - y;
			int cz = students[2][0] - z;
			if (x > -1 && y > -1 && z > -1 && ax > -1 && by > -1 && cz > -1) {
				System.out.println(1);
				System.out.println(x + " " + ax);
				System.out.println(y + " " + by);
				System.out.println(z + " " + cz);
				return;
			}
		}
		System.out.print(0);

	}
}
