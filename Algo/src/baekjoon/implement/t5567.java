package baekjoon.implement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class t5567 {
// :: ���� ��ȥ�� - �׷��� / ����, ���� �̿빮��!
	/*
	 * ���� 1. ���� �׷��� 2. ���̷����� ����Ѱ�? 3. BFS Ž���� �ƴѰͰ����� ģ���� �ʴ��ؾ��ϴ� ���谡 ���־�
	 * 
	 * sol 1. 2���� �迭�� �̿��� Ǯ�� https://leveloper.tistory.com/83 2. �׷����� �׷���
	 * https://zzang9ha.tistory.com/216
	 */
	public static int[][] arr; // ģ������
	public static boolean visit[];
	public static int n; // �����
	public static int m; // ����Ʈ ����
	public static int count = 0; // �ʴ��� ģ���� ��

	public static void main(String[] args) throws IOException {

		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

		n = Integer.parseInt(bf.readLine());
		m = Integer.parseInt(bf.readLine());
		arr = new int[n + 1][n + 1];
		visit = new boolean[n + 1];

		for (int i = 0; i < m; i++) {
			StringTokenizer st = new StringTokenizer(bf.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			arr[a][b] = arr[b][a] = 1; // ģ������ ǥ��
		}

		for (int i = 2; i <= n; i++) {
			if (arr[1][i] == 1) { // ����̿� ģ���ΰ��
				if (!visit[i]) { // ����̿� ģ���ε� ���� �湮���� ������
					count++; // �ʴ�
					visit[i] = true; // �湮 ǥ��
				}
				// ������� ģ���� ģ�� ã�� - ����̿� ����� ������ ����� ���� ã��
				for (int j = 2; j <= n; j++) {
					if (arr[i][j] == 1 && !visit[j]) {
						count++; // ����� ģ���� ģ���� �ʴ�
						visit[j] = true; // �湮ǥ��
					}
				}

			}
		}
		System.out.println(count);
		bf.close();
	}

}
