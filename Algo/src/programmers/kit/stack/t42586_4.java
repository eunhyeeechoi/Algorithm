package programmers.kit.stack;

import java.util.LinkedList;
import java.util.Queue;

public class t42586_4 {
	public int[] solution(int[] progresses, int[] speeds) {
		int[] pro = progresses;
		Queue<Integer> result = new LinkedList<>(); // ������ ����
		int index = 0, count = 0; // index : ���� ���� ���� , count : �ѹ��� ������ ����

		while (index < pro.length) { // �۾��� ������ŭ ����
			for (int i = 0; i < pro.length; i++) { // �Ϸ� ������ ó��
				pro[i] += speeds[i];
			}

			if (pro[index] >= 100) { // index �۾��� ������ �� ������
				while (index < pro.length && pro[index] >= 100) {
					// �ٸ��͵� ���� ���� ��������
					count++;
					index++;
				}
				result.offer(count); // �ѹ��� ������ ���� ����
				count = 0; // �������� ���� �ʱ�ȭ
			}
		}
		int[] answer = new int[result.size()];
		for (int i = 0; i < answer.length; i++) {
			answer[i] = result.poll();
			System.out.println(answer[i]);
		}
		return answer;
	}

	public static void main(String[] args) {
		int[] progresses = { 93, 30, 55 };
		int[] speeds = { 1, 30, 5 };
		t42586_4 aa = new t42586_4();
		aa.solution(progresses, speeds);
	}
}