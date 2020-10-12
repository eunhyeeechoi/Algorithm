package programmers.kit;

import java.util.LinkedList;
import java.util.Queue;

//���α׷��ӽ� ��� ���� - ���� Ǯ��
public class t42586_3 {
	public static int[] solution(int[] progresses, int[] speeds) {
		int[] pro = progresses; // ���纻
		Queue<Integer> result = new LinkedList<>(); // ���� �� ����
		int index = 0, count = 0; // index: ������ �� �ִ� ����, count: �� ���� �����Ǵ� ��

		while (index < pro.length) { // �۾��� ������ŭ ����
			for (int i = 0; i < pro.length; i++) // �Ϸ� ������ ó��
				pro[i] += speeds[i];

			if (pro[index] >= 100) { // index �۾��� ������ �� ������
				while (index < pro.length && pro[index] >= 100) { // �ٸ� �͵� ���� ������ �� �ִ���
					count++;
					index++;
				}

				result.offer(count); // �� ���� ������ ���� ����
				count = 0;
			}
		}

		int[] answer = new int[result.size()];
		for (int i = 0; i < answer.length; i++)
			answer[i] = result.poll();

		return answer;
	}

	public static void main(String[] args) {
		t42586_3 aa = new t42586_3();
		int[] progresses = { 93, 30, 55 };
		int[] speeds = { 1, 3, 5 };
		int[] bb = aa.solution(progresses, speeds);
		for (int ans : bb) {
			System.out.println("��� :" + ans);
		}
	}
}
