package baekjoon.BinarySearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class t1764_2 {
	static int noli; // �������ѻ��
	static int nosee; // �������ѻ��
	static int cnt; // ������ ������ ���ѻ��

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		noli = Integer.parseInt(st.nextToken());
		nosee = Integer.parseInt(st.nextToken());

		String[] li = new String[noli];
		String[] see = new String[nosee];
		String[] noseeli;
		// ���������, ������� ���� ������ String �迭�� �ְ�
		// contains �϶����� count �� ������Ű��
//		System.out.println("noli+nosee " + (noli + nosee));

		for (int i = 0; i < noli + nosee; i++) {
			if (i < noli) {
				li[i] = br.readLine().toString();
//				System.out.println(br.readLine().toString());
				// String ���� �ٲ���ϳ�
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
