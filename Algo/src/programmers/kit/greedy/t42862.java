package programmers.kit.greedy;

//:: ���α׷��ӽ� �׸��� - ü����
public class t42862 {
	public int solution(int n, int[] lost, int[] reserve) {
		int answer = 0;
		int lost1 = 0;
		int count = 0;

		// �������� ���� �л��� �������ϸ� ������ �� ������
		for (int i = 0; i < lost.length; i++) {
			for (int j = 0; j < reserve.length; j++) {
				if (lost[i] == reserve[j]) { // ���� ���ٴ°� reserve �л��� ���ٴ°�
					lost1++;
					lost[i] = -1;
					reserve[j] = -1; // �������� ���ϵ��� -1 �� ����
					break;
				}
			}
		}

		// ���� �����ְ� -1�� ����� �ٸ� �л����� �������� �ʵ���
		for (int i = 0; i < lost.length; i++) {
			for (int j = 0; j < reserve.length; j++) {
				if (lost[i] == reserve[j] + 1 || lost[i] == reserve[j] - 1) {
					// ���̳� ���� �л����� �����ֵ��� ó����
					count++;
					reserve[j] = -1;
					break;
				}
			}
		}
		answer = n - lost.length + lost1 + count;
		return answer;
	}
}
