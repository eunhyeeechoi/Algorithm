package programmers.kit.stack;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

//https://jaebworld.tistory.com/42
public class t42583 {
	public int solution(int bridge_length, int weight, int[] truck_weigts) {
		int answer = 0; // �ð�
		Queue<Integer> q = new ConcurrentLinkedQueue<>();
		// �ٸ��� �ϳ��� Queue ��ü�� �����ϰ� ������ �ɾ� Ʈ���� �����ϰ� ������ ������ �ڵ�
		int sum = 0;
		for (int w : truck_weigts) {
			while (true) {
				if (q.isEmpty()) {
					// ť�� ����ִ� ���. Ʈ���� ���� ������ ��Ȳ
					// �ٸ� �� Ʈ������ ���Ը� �ǹ��ϴ� sum ������ ���Ը� ����
					// Ʈ���� ���� �Ͽ����� �ð��� ������Ŵ
					q.add(w);
					sum += w;
					answer++;
					break;
				} else if (q.size() == bridge_length) {
					// ť�� ��ü�� ����� �ٸ��� ���̿� ���� ���
					// ť�� ���� ���ٴ� �ǹ�. ���� ���� ������ Ʈ���� �ٸ��� ���ڶ��� �ٴٶ���
					// Ʈ���� ����������
					sum -= q.poll();
				} else {
					// Ʈ���� �ٸ����� ������ �������� ���� ����.
					if (sum + w > weight) {
						// �ٸ� ���� �ִ� Ʈ������ ���Կ� �� Ʈ���� ������ �ٸ��� ��ƿ�� �ִ��� üũ
						// �ٸ��� ��Ƽ�� ���ϴ� ���Զ�� 0�߰�. �̹� �ִ� Ʈ���� �ٸ��� �ǳʵ���.
						answer++;
						q.add(0);
					} else {
						// �ٸ��� ���� Ʈ���� ���Ե� �ߵ� �� �ִٸ� �߰�
						// ���ο� Ʈ���� ���� ��Ų��.
						q.add(w);
						sum += w;
						answer++;
						break;
					}
				}
			}
		}
		return answer + bridge_length;
	}
}
