package programmers.kit.search;

import java.util.Arrays;

// 2020.12.04
// :: ���α׷��ӽ� DFS / BFS - �ܾȯ
// https://programmers.co.kr/learn/courses/30/lessons/43163
public class t43163 {
	public int solution(String begin, String target, String[] words) {
		int answer = 0;
		if (Arrays.asList(words).contains(target)) {
			System.out.println("������ �־�");
		} else { // words �迭�� target ���� ������
			System.out.println("����");
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
