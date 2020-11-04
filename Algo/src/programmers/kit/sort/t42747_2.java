package programmers.kit.sort;

import java.util.Arrays;

//:: 프로그래머스 H-index
public class t42747_2 {
	public int solution(int[] citations) {
		int answer = 0;
		Arrays.sort(citations);

		for (int i = 0; i < citations.length; i++) {
			System.out.println(citations[i]);
			int h = citations.length - i;
			if (citations[i] >= h) {
				answer = h;
				break;
			}
		}
		return answer;

	}

	public static void main(String[] args) {
		t42747_2 aa = new t42747_2();
		int[] citations = { 3, 0, 6, 1, 5 };
		int bb = aa.solution(citations);
		System.out.println(bb);
	}
}
