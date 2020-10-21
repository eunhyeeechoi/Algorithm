package programmers.kit.greedy;

public class t42862 {
	public int solution(int n, int[] lost, int[] reserve) {
		int answer = 0;
		int lost1 = 0;
		int count = 0;

		// 여벌옷을 가진 학생이 도난당하면 빌려줄 수 없도록
		for (int i = 0; i < lost.length; i++) {
			for (int j = 0; j < reserve.length; j++) {
				if (lost[i] == reserve[j]) {
					lost1++;
					lost[i] = -1;
					reserve[j] = -1;
					break;
				}
			}
		}

		// 옷을 빌려주고 -1로 만들어 다른 학생에게 빌려주지 않도록
		for (int i = 0; i < lost.length; i++) {
			for (int j = 0; j < reserve.length; j++) {
				if (lost[i] == reserve[j] + 1 || lost[i] == reserve[j] - 1) {
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
