package programmers.kit.stack;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class t42583 {
	public int solution(int bridge_length, int weight, int[] truck_weigts) {
		int answer = 0;
		Queue<Integer> q = new ConcurrentLinkedQueue<>();
		int sum = 0;
		for (int t : truck_weigts) {
			while (true) {
				if (q.isEmpty()) {
					q.add(t);
					sum += t;
					answer++;
					break;
				} else if (q.size() == bridge_length) {
					sum -= q.poll();
				} else {
					if (sum + t > weight) {
						answer++;
						q.add(0);
					} else {
						q.add(t);
						sum += t;
						answer++;
						break;
					}
				}
			}
		}
		return answer + bridge_length;
	}
}
