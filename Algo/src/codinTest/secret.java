package codinTest;

public class secret {
	public int[] solution(int[][] v) {
		// ::직사각형 나머지 한점 좌표찾기
		int x;
		int y;

		if (v[0][0] == v[2][0]) {
			x = v[1][0];
		} else if (v[1][0] == v[2][0]) {
			x = v[0][0];
		} else {
			x = v[2][0];
		}

		if (v[0][1] == v[1][1]) {
			y = v[2][1];
		} else if (v[1][1] == v[2][1]) {
			y = v[0][1];
		} else {
			y = v[1][1];
		}

		int[] answer = { x, y };
		System.out.println(answer);
		return answer;
	}

	public static void main(String[] args) {
		secret aa = new secret();
		int[][] v = { { 1, 4 }, { 3, 4 }, { 3, 10 } };
		aa.solution(v);
	}
}
