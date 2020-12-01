package programmers.kit.heap;

import java.util.PriorityQueue;

// :: ���α׷��ӽ� �� - ���ʰ�
// :: 2020.12.01
// https://sas-study.tistory.com/257

public class t42626_4 {

	public int solution(int[] scoville, int K) {
		int answer = 0;
		PriorityQueue<Integer> heap = new PriorityQueue<Integer>();

		for (int aScoville : scoville) {
			// ���ں� �迭�� ���� �켱���� ť�� ����
			heap.add(aScoville);
		}
		while (heap.peek() < K) {
			// ���� �켱������ ���� ���� peek �� ���� K �� �񱳉�
			if (heap.size() == 1)
				return -1;

			// K���� ������� �����ش�.

			// �켱���� ť���� �����͸� �̾ƿ´�.
			int val1 = heap.poll();
			int val2 = heap.poll();

			// ���� ���� ���� ����� result �� ��� �켱������ ������
			// �켱������ ���� heap�̶�� �켱���� ť�� ����
			int result = val1 + (val2 * 2);

			heap.add(result);
			answer++;
		}
		return answer;
	}

	public static void main(String[] args) {
		t42626_4 aa = new t42626_4();
		int[] scoville = { 1, 2, 3, 9, 10, 12 };
		int K = 7;
//		aa.solution(scoville, K);
		System.out.println(aa.solution(scoville, K));

	}
}
