package programmers.kit.heap;

import java.util.Arrays;

// :: ���α׷��ӽ� �� - ���ʰ�
// :: 2020.12.01
public class t42626 {
	// 1. ������������ �迭 ����
	// 2. 0��°�� �ִ� ���ں� ���� k �������� üũ
	// 3. k ���϶�� 1��°�� ���İ� ����
	// 4. ���� �����Ҷ� count ����
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
