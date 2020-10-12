package programmers.kit;

public class t42586 {
	public int[] solution(int[] progresses, int[] speeds) {
		int[] answer = {};
		int hap = 0;
		int cnt = 0;
		for (int i = 0; i < progresses.length; i++) {
			hap = progresses[i] + speeds[i];
			if (hap >= 100) {
				cnt++;
				break;
			}
			answer[i] = cnt;
		}
		return answer;
	}

	public static void main(String[] args) {
		t42586 aa = new t42586();
		int[] progresses = { 93, 30, 55 };
		int[] speeds = { 1, 3, 5 };
		aa.solution(progresses, speeds);
	}
}
