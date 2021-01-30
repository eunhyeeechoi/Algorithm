package baekjoon.DFS.BFS;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class t1012 {
	// ���� ����� ����
	static int T; // �׽�Ʈ ���̽� ����
	static int G; // ����
	static int S; // ���α���
	static int B; // ���� ����
	static int[][] box; // ��
	static int p;
	static int q;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		T = Integer.parseInt(st.nextToken());
		System.out.println("T" + T);
		st = new StringTokenizer(br.readLine());
		G = Integer.parseInt(st.nextToken());
		S = Integer.parseInt(st.nextToken());
		B = Integer.parseInt(st.nextToken());

		// 1. for �� ���Ƽ� �� �ɰ������...
		// ���� �����?������ ���
		// 2. bfs �̿��ؼ� ���� ���� ���� ���� ���� ���� ���������
		// ���� ��������� ����� üũ�ϵ�?������
		box = new int[G][S];

		for (int i = 0; i < B; i++) {
			st = new StringTokenizer(br.readLine()); // �ٹٲ��� ����ؾ�¡
			p = Integer.parseInt(st.nextToken());
			q = Integer.parseInt(st.nextToken());
			// ���߸� �� �ɾ
			box[p][q] = 1;
//			System.out.println("P : " + p + " / Q : " + q + " / " + box[p][q]);

		}
	}
}
