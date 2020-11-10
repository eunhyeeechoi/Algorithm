package programmers.kit.bruteforceSearch;

public class t42840 {
	public int[] solution(int[] answers) {
		System.out.println("실행");
		int[] answer = {};
		int[] count = new int[3];
		int[] a = { 1, 2, 3, 4, 5 };
		int[] b = { 2, 1, 2, 3, 2, 4, 2, 5 };
		int[] c = { 3, 3, 1, 1, 2, 2, 4, 4, 5, 5 };
		int cnt1 = 0, cnt2 = 0, cnt3 = 0;
		// answer 와 각각의 배열값 비교하여 같으면 count 증가시키쟈

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
			// --- 그래도 여기까지 접근이 좋았어
		}
		// count 가 작은것 -> 큰것 순서로 정렬
		for (int p = 0; p < count.length; p++) {
			System.out.println(count[p]);
			if (count[p] > 0) {

			}
		}

		// 같을경우 오름차순으로 리턴
		// --- 여기 출력하는 부분에서 막혔어
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
