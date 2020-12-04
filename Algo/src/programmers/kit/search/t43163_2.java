package programmers.kit.search;

import java.util.Arrays;

// 2020.12.04
// :: 프로그래머스 DFS / BFS - 단어변환
// https://programmers.co.kr/learn/courses/30/lessons/43163
// https://technote-mezza.tistory.com/25

// 단어 한개씩만 바뀌는지 체크 
// words 에 있는 단어로만 변환
// 주어진 단어 집합에 내가 비교하는 단어에서 한글자만 다른 단어가 있는지 탐색
// visited == false 라면 dfs 에 그단어로 다시 진행
// target 과 같아질때까지 진행
public class t43163_2 {
	static int minCnt = Integer.MAX_VALUE;

	public static void dfs(boolean[] visited, int cnt, String begin, String target, String[] words) {
		// target 과 일치하면 minCnt 갱신
		if (begin.equals(target)) {
			if (minCnt > cnt) {
				minCnt = cnt;
				return;
			}
		}

		// 단어 집합에 존재하는 단어일경우 dfs
		for (int i = 0; i < words.length; i++) {
			if (!visited[i] && checkWords(begin, words[i])) {
				visited[i] = true;
				dfs(visited, cnt + 1, words[i], target, words);
				visited[i] = false;
			}
		}
	}

	// 한글자만 바뀌는지 체크
	public static boolean checkWords(String begin, String target) {
		char[] c1 = begin.toCharArray();
		char[] c2 = target.toCharArray();

		int change = 0;
		for (int i = 0; i < c1.length; i++) {
			if (c1[i] != c2[i])
				// 단어중 같은것이 있을때 + 시킴
				change++;
		}
		if (change == 1) {
			// 하나만 같으면 true 리턴해주니까 계속 진행
			return true;
		} else {
			System.out.println("다른것이 1개이상일때");
			return false;
		}
//		else if (change == 0) {
//			System.out.println("같은것이 없을때");
//		}

//		return false;
		// 단어중 알파벳이 여러개 다르면 false
	}

	public static void main(String[] args) {
		String begin = "hit";
		String target = "cog";
		String[] words = { "hot", "dot", "dog", "lot", "log" };
//		String[] words = { "hot", "dot", "dog", "lot", "log", "cog" };
		dfs(new boolean[words.length], 0, begin, target, words);
		// 해당 단어가 없을경우 0을 출력
		if (minCnt == Integer.MAX_VALUE)
			minCnt = 0;
		System.out.println(minCnt);
	}
}