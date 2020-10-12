package programmers.kakao;
	//무지의 먹방 라이브
public class t2019_42891_2 {
	public int solution(int[] food_times, long k) {
		int answer = 0;
		while (k < 1) {
			for (int i = 0; i < food_times.length; i++) {
				if (food_times[i] > 0) { // 0보다 크면 빼고
					food_times[i]--;

				} else { // 0보다 작으면 배열에서 빼기
					answer = i;
				}
			}
			break;
		}
		return answer;
	}
}
