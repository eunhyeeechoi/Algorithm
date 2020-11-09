package programmers.kit.sort;

//:: 프로그래머스 H-index
public class t42747_3 {
	int getHidx(int c, int[] arr) {
		int cnt = 0;
		for (int a : arr) {
			if (a >= c)
				cnt++;
		}
		return cnt;
	}

	public int solution(int[] citations) {
		int answer = 0;
		for (int c : citations) {
			int cnt = getHidx(c, citations);
			answer = Math.max(answer, cnt >= c ? c : cnt);
		}

		return answer;
	}

	public static void main(String[] args) {
		t42747_3 aa = new t42747_3();
		int[] citations = { 3, 0, 6, 1, 5 };
		int bb = aa.solution(citations);
		System.out.println(bb);
	}
}
