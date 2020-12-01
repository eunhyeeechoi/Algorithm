package programmers.kit.heap;

import java.util.PriorityQueue;

// :: 프로그래머스 힙 - 더맵게
// :: 2020.12.01
// https://sas-study.tistory.com/257

public class t42626_4 {

	public int solution(int[] scoville, int K) {
		int answer = 0;
		PriorityQueue<Integer> heap = new PriorityQueue<Integer>();

		for (int aScoville : scoville) {
			// 스코빌 배열의 값을 우선순위 큐에 저장
			heap.add(aScoville);
		}
		while (heap.peek() < K) {
			// 가장 우선순위가 높은 값이 peek 에 의해 K 와 비교됌
			if (heap.size() == 1)
				return -1;

			// K보다 작을경우 섞어준다.

			// 우선순위 큐에서 데이터를 뽑아온다.
			int val1 = heap.poll();
			int val2 = heap.poll();

			// 가장 작은 값의 결과를 result 에 담고 우선순위데 담으면
			// 우선순위에 따라 heap이라는 우선순위 큐에 정렬
			int result = val1 + (val2 * 2);

			heap.add(result);
			answer++;
		}
		return answer;
	}

	public static void main(String[] args) {
		t42626_4 aa = new t42626_4();
		int[] scoville = { 1, 2, 3, 9, 10, 12 };
		int K = 7;
//		aa.solution(scoville, K);
		System.out.println(aa.solution(scoville, K));

	}
}
