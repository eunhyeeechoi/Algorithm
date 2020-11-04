package programmers.kit.sort;

import java.util.Arrays;

//:: 프로그래머스 H-index
public class t42747 {
	public int solution(int[] citations) {
		int answer = 0;
		Arrays.sort(citations);
		int b = citations.length / 2;
		System.out.println("b 값 :" + b);
		boolean flag = false;
		int count = 0;
		for (int i = 0; i < citations.length; i++) {
			if (citations[i] >= citations[b]) {
				count++;
			}
			System.out.println(citations[i] + ":" + count);

			if (count > b) {
//				flag = true;
				answer = citations[b];
			}
//			if (flag)
//				answer = count;
		}
		return answer;
	}

	public static void main(String[] args) {
		t42747 aa = new t42747();
		int[] citations = { 3, 0, 6, 1, 1 };
		int bb = aa.solution(citations);
		System.out.println(bb);
	}
}
