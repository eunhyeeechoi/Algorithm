package programmers.kit.bruteforceSearch;

public class t42840 {
	public int[] solution(int[] answers) {
		System.out.println("����");
		int[] answer = {};
		int[] count = new int[3];
		int[] a = { 1, 2, 3, 4, 5 };
		int[] b = { 2, 1, 2, 3, 2, 4, 2, 5 };
		int[] c = { 3, 3, 1, 1, 2, 2, 4, 4, 5, 5 };
		int cnt1 = 0, cnt2 = 0, cnt3 = 0;
		// answer �� ������ �迭�� ���Ͽ� ������ count ������Ű��

		for (int i = 0; i < answers.length; i++) {
			if (a[i] == answers[i]) {
				count[0]++;
			}
			if (b[i] == answers[i]) {
				count[1]++;
			}
			if (c[i] == answers[i]) {
				count[2]++;
			}
			// --- �׷��� ������� ������ ���Ҿ�
		}
		// count �� ������ -> ū�� ������ ����
		for (int p = 0; p < count.length; p++) {
			System.out.println(count[p]);
			if (count[p] > 0) {

			}
		}

		// ������� ������������ ����
		// --- ���� ����ϴ� �κп��� ������
		return answer;
	}

	public static void main(String[] args) {

		int[] answers = { 1, 2, 3, 4, 5 };
//		int[] answers = { 1, 3, 2, 4, 2 };
//		int[] answers = { 3, 3, 3, 3, 3 };
//		int[] answers = { 2, 2, 2, 2, 2 };
		t42840 aa = new t42840();
		aa.solution(answers);
	}
}
