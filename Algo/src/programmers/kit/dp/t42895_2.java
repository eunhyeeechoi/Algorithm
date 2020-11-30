package programmers.kit.dp;

//:: 프로그래머스 DP - N 으로 표현
// :: 2020.11.30 
// https://eoghks0521.tistory.com/entry/N%EC%9C%BC%EB%A1%9C-%ED%91%9C%ED%98%84%ED%94%84%EB%A1%9C%EA%B7%B8%EB%9E%98%EB%A8%B8%EC%8A%A4
// 재귀함수를 이용한 DFS
public class t42895_2 {
	static int answer = 0;

	public static void solution(int n, int number) {
		calc(n, number, 0, 0);
	}

	public static void calc(int n, int number, int count, int accum) {
		int nn = n;

		if (count > 8) {
			answer = -1;
			return;
		}
		if (accum == number) {
			if (answer == -1 || answer > count) {
				answer = count;
			}
			return;
		}
		for (int i = 1; i < 9 - count; i++) {
			calc(n, number, count + i, accum + nn);
			calc(n, number, count + i, accum - nn);
			calc(n, number, count + i, accum * nn);
			calc(n, number, count + i, accum / nn);
			nn = nn * 10 + n;
		}
	}

	public static void main(String[] args) {
		int n = 5;
		int number = 12;
		solution(n, number);
		System.out.println(answer);
	}
}
