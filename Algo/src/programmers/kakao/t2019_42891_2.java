package programmers.kakao;
	//������ �Թ� ���̺�
public class t2019_42891_2 {
	public int solution(int[] food_times, long k) {
		int answer = 0;
		while (k < 1) {
			for (int i = 0; i < food_times.length; i++) {
				if (food_times[i] > 0) { // 0���� ũ�� ����
					food_times[i]--;

				} else { // 0���� ������ �迭���� ����
					answer = i;
				}
			}
			break;
		}
		return answer;
	}
}
