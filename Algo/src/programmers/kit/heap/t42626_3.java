package programmers.kit.heap;

import java.util.PriorityQueue;

// :: 프로그래머스 힙 - 더맵게
// :: 2020.12.01
// https://velog.io/@qweadzs/%ED%94%84%EB%A1%9C%EA%B7%B8%EB%9E%98%EB%A8%B8%EC%8A%A4-%EB%8D%94-%EB%A7%B5%EA%B2%8Cjava
public class t42626_3 {

	public int solution(int[] scoville, int K) {
		int answer = 0;
		// 우선순위 큐
		// 항상 우선순위가 높은 데이터를 먼저 추출하는 우선순위 큐 사용
		// 큐의 일종이지만 기존 큐와 다른 점은 기존의 선입 선출하지 않고 우선순위가 높은 순서대로 반환

		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		for (int i = 0; i < scoville.length; i++) {// 큐에 삽입
			pq.offer(scoville[i]); // 우선순위에 따라 저장됌
		}

		while (!pq.isEmpty()) {
			if (pq.size() == 1) { // 큐에 숫자 하나만 있을때
				if (pq.poll() < K) {
					answer = -1;
					break;
				} else {
					answer += 1;
					break;
				}
			}
			pq.offer(pq.poll() + pq.poll() * 2);// 수식
			answer++;
			if (pq.peek() > K) { // 제일 작은 수 확인
				break;
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		t42626_3 aa = new t42626_3();
		int[] scoville = { 1, 2, 3, 9, 10, 12 };
		int K = 7;
//		aa.solution(scoville, K);
		System.out.println(aa.solution(scoville, K));

	}
}
