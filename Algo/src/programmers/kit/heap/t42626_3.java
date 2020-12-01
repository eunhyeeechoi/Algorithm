package programmers.kit.heap;

import java.util.PriorityQueue;

// :: ���α׷��ӽ� �� - ���ʰ�
// :: 2020.12.01
// https://velog.io/@qweadzs/%ED%94%84%EB%A1%9C%EA%B7%B8%EB%9E%98%EB%A8%B8%EC%8A%A4-%EB%8D%94-%EB%A7%B5%EA%B2%8Cjava
public class t42626_3 {

	public int solution(int[] scoville, int K) {
		int answer = 0;
		// �켱���� ť
		// �׻� �켱������ ���� �����͸� ���� �����ϴ� �켱���� ť ���
		// ť�� ���������� ���� ť�� �ٸ� ���� ������ ���� �������� �ʰ� �켱������ ���� ������� ��ȯ

		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		for (int i = 0; i < scoville.length; i++) {// ť�� ����
			pq.offer(scoville[i]); // �켱������ ���� �����
		}

		while (!pq.isEmpty()) {
			if (pq.size() == 1) { // ť�� ���� �ϳ��� ������
				if (pq.poll() < K) {
					answer = -1;
					break;
				} else {
					answer += 1;
					break;
				}
			}
			pq.offer(pq.poll() + pq.poll() * 2);// ����
			answer++;
			if (pq.peek() > K) { // ���� ���� �� Ȯ��
				break;
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		t42626_3 aa = new t42626_3();
		int[] scoville = { 1, 2, 3, 9, 10, 12 };
		int K = 7;
//		aa.solution(scoville, K);
		System.out.println(aa.solution(scoville, K));

	}
}
