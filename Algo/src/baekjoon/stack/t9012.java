package baekjoon.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class t9012 {
	static String[] insert; // �ԷµǴ� ���ڿ� ���� (��ȣ���)
	static String[] out; // �����Ұ� YES, NO

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		StringTokenizer Scnt = new StringTokenizer(br.readLine());
		int Scnt = Integer.parseInt(br.readLine());
		insert = new String[Scnt]; // ���� ���� ������
		for (int i = 0; i < Scnt; i++) {
			insert[i] = br.readLine(); // ������ ���ڿ� ��� �ְ�
//			System.out.println(insert[i]);
		}

	}

}
