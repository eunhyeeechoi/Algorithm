package programmers.kit.heap;

import java.util.ArrayList;

// :: ���α׷��ӽ� �� - ���ʰ�
// :: 2020.12.01
public class t42626_2 {
	// 1. ������������ �迭 ����
	// 2. 0��°�� �ִ� ���ں� ���� k �������� üũ
	// 3. k ���϶�� 1��°�� ���İ� ����
	// 4. ���� �����Ҷ� count ����
	ArrayList<Integer> heap;

	public int solution(int[] scoville, int K) {
		heap = new ArrayList<Integer>();
		for (int i = 0; i < scoville.length; i++) {
			heap.add(scoville[i]);
		}
		int count = 0;
		int answer = 0;
		return answer;

	}

	public static void main(String[] args) {
		t42626_2 aa = new t42626_2();
		int[] scoville = { 1, 2, 3, 9, 10, 12 };
		int K = 7;
		aa.solution(scoville, K);
//		System.out.println(aa.solution(scoville, K));

	}
}
