package baekjoon.Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//:: 백준 잃어버린 괄호 - 문자열, greedy
//이런 문제는 어떻게 해결할지 가닥을 잡는게 가장 중요한듯
//이건 사실 연산하는걸 구현만 하면 되는 문제여쏘 ㅠㅠ 근데 접근을 잘 못했넹
//이런문제를 많이 풀어봐야할듯?!
//point - '큰 수' 를 빼야 최솟값을 구할 수 있오
//--> 덧셈으로 이루어진 부분을 먼저 연산해야해!
//https://st-lab.tistory.com/148
public class t1541 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int sum = Integer.MAX_VALUE; // 초기 상태 여부 확인을 위한 값으로 설정
		String[] subtraction = br.readLine().split("-");

		for (int i = 0; i < subtraction.length; i++) {
			int temp = 0;

			// 뺄셈으로 나뉜 토큰을 덧셈으로 분리하여 해당 토큰을 더함
			String[] addition = subtraction[i].split("\\+");

			// 덧셈으로 나뉜 토큰을 모두 더함
			for (int j = 0; j < addition.length; j++) {
				temp += Integer.parseInt(addition[j]);
			}

			// 첫번째 토큰인 경우 temp 값이 첫번째 수가
			if (sum == Integer.MAX_VALUE) {
				System.out.println("Integer.MAX_VALUE" + Integer.MAX_VALUE);
				sum = temp;
			} else {
				System.out.println("Integer.MAX_VALUE XXX" + Integer.MAX_VALUE);
				sum -= temp;
			}
		}
		System.out.println(sum);
	}

}
