package programmers.kit.heap;

import java.util.Arrays;

// :: 프로그래머스 힙 - 더맵게
// :: 2020.12.01
public class t42626 {
	// 1. 오름차순으로 배열 정렬
	// 2. 0번째에 있는 스코빌 지수 k 이하인지 체크
	// 3. k 이하라면 1번째의 음식과 섞기
	// 4. 연산 진행할때 count 증가
	public int solution(int[] scoville, int K) {
		int count = 0;
		int answer = 0;
//		for (int i = 0; i < scoville.length; i++) {
//			System.out.println(scoville[i]);
//		}

		Arrays.sort(scoville);
		while (scoville[0] <= K) {
			scoville[0] = scoville[0] + scoville[1] * 2;
			count++;
		}
		answer = count;
		System.out.println(count);
		return answer;
	}

	public static void main(String[] args) {
		t42626 aa = new t42626();
		int[] scoville = { 1, 2, 3, 9, 10, 12 };
		int K = 7;
		aa.solution(scoville, K);
//		System.out.println(aa.solution(scoville, K));

	}
}
