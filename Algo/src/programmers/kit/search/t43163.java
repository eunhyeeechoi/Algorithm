package programmers.kit.search;

import java.util.Arrays;

// 2020.12.04
// :: 프로그래머스 DFS / BFS - 단어변환
// https://programmers.co.kr/learn/courses/30/lessons/43163
public class t43163 {
	public int solution(String begin, String target, String[] words) {
		int answer = 0;
		if (Arrays.asList(words).contains(target)) {
			System.out.println("가지고 있어");
		} else { // words 배열에 target 값이 없을때
			System.out.println("없어");
			answer = 0;
		}
		return answer;
	}

	public static void main(String[] args) {
		String begin = "hit";
		String target = "cog";
		String[] words = { "hot", "dot", "dog", "lot", "log", "cog" };
		System.out.println(new t43163().solution(begin, target, words));
	}
}
