package baekjoon.Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//:: ���� �Ҿ���� ��ȣ - ���ڿ�, greedy
// �̷� ������ ��� �ذ����� ������ ��°� ���� �߿��ѵ�
// �̰� ��� �����ϴ°� ������ �ϸ� �Ǵ� �������� �Ф� �ٵ� ������ �� ���߳�
// �̷������� ���� Ǯ������ҵ�?!
// point - 'ū ��' �� ���� �ּڰ��� ���� �� �ֿ�
// --> �������� �̷���� �κ��� ���� �����ؾ���!
// https://st-lab.tistory.com/148
public class t1541 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int sum = Integer.MAX_VALUE; // �ʱ� ���� ���� Ȯ���� ���� ������ ����
		String[] subtraction = br.readLine().split("-");

		for (int i = 0; i < subtraction.length; i++) {
			int temp = 0;

			// �������� ���� ��ū�� �������� �и��Ͽ� �ش� ��ū�� ����
			String[] addition = subtraction[i].split("\\+");

			// �������� ���� ��ū�� ��� ����
			for (int j = 0; j < addition.length; j++) {
				temp += Integer.parseInt(addition[j]);
			}

			// ù��° ��ū�� ��� temp ���� ù��° ���� ��
			if (sum == Integer.MAX_VALUE) {
				System.out.println("Integer.MAX_VALUE" + Integer.MAX_VALUE);
				sum = temp;
			} else {
				System.out.println("Integer.MAX_VALUE XXX" + Integer.MAX_VALUE);
				sum -= temp;
			}
		}
		System.out.println(sum);
	}

}
