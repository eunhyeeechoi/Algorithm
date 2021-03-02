package programmers.kit.stack;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

//https://jaebworld.tistory.com/42
public class t42583 {
	public int solution(int bridge_length, int weight, int[] truck_weigts) {
		int answer = 0; // 시간
		Queue<Integer> q = new ConcurrentLinkedQueue<>();
		// 다리를 하나의 Queue 객체로 생각하고 조건을 걸어 트럭이 진입하고 나가는 식으로 코딩
		int sum = 0;
		for (int w : truck_weigts) {
			while (true) {
				if (q.isEmpty()) {
					// 큐가 비어있는 경우. 트럭이 진입 가능한 상황
					// 다리 위 트럭들의 무게를 의미하는 sum 변수에 무게를 더함
					// 트럭이 진입 하였으니 시간도 증가시킴
					q.add(w);
					sum += w;
					answer++;
					break;
				} else if (q.size() == bridge_length) {
					// 큐의 객체의 사이즈가 다리의 길이와 같은 경우
					// 큐가 가득 찻다는 의미. 가장 먼저 진입한 트럭이 다리의 끝자락에 다다랏다
					// 트럭을 내보내야함
					sum -= q.poll();
				} else {
					// 트럭이 다리위에 있지만 가득차지 않은 상태.
					if (sum + w > weight) {
						// 다리 위에 있는 트럭들의 무게와 새 트럭의 무개를 다리가 버틸수 있는지 체크
						// 다리가 버티지 못하는 무게라면 0추가. 이미 있는 트럭만 다리를 건너도록.
						answer++;
						q.add(0);
					} else {
						// 다리가 다음 트럭의 무게도 견딜 수 있다면 추가
						// 새로운 트럭을 진입 시킨다.
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
