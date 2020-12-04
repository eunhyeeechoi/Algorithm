package programmers.kit.search;

import java.util.Arrays;

// 2020.12.04
// :: ���α׷��ӽ� DFS / BFS - �ܾȯ
// https://programmers.co.kr/learn/courses/30/lessons/43163
// https://technote-mezza.tistory.com/25

// �ܾ� �Ѱ����� �ٲ���� üũ 
// words �� �ִ� �ܾ�θ� ��ȯ
// �־��� �ܾ� ���տ� ���� ���ϴ� �ܾ�� �ѱ��ڸ� �ٸ� �ܾ �ִ��� Ž��
// visited == false ��� dfs �� �״ܾ�� �ٽ� ����
// target �� ������������ ����
public class t43163_2 {
	static int minCnt = Integer.MAX_VALUE;

	public static void dfs(boolean[] visited, int cnt, String begin, String target, String[] words) {
		// target �� ��ġ�ϸ� minCnt ����
		if (begin.equals(target)) {
			if (minCnt > cnt) {
				minCnt = cnt;
				return;
			}
		}

		// �ܾ� ���տ� �����ϴ� �ܾ��ϰ�� dfs
		for (int i = 0; i < words.length; i++) {
			if (!visited[i] && checkWords(begin, words[i])) {
				visited[i] = true;
				dfs(visited, cnt + 1, words[i], target, words);
				visited[i] = false;
			}
		}
	}

	// �ѱ��ڸ� �ٲ���� üũ
	public static boolean checkWords(String begin, String target) {
		char[] c1 = begin.toCharArray();
		char[] c2 = target.toCharArray();

		int change = 0;
		for (int i = 0; i < c1.length; i++) {
			if (c1[i] != c2[i])
				// �ܾ��� �������� ������ + ��Ŵ
				change++;
		}
		if (change == 1) {
			// �ϳ��� ������ true �������ִϱ� ��� ����
			return true;
		} else {
			System.out.println("�ٸ����� 1���̻��϶�");
			return false;
		}
//		else if (change == 0) {
//			System.out.println("�������� ������");
//		}

//		return false;
		// �ܾ��� ���ĺ��� ������ �ٸ��� false
	}

	public static void main(String[] args) {
		String begin = "hit";
		String target = "cog";
		String[] words = { "hot", "dot", "dog", "lot", "log" };
//		String[] words = { "hot", "dot", "dog", "lot", "log", "cog" };
		dfs(new boolean[words.length], 0, begin, target, words);
		// �ش� �ܾ ������� 0�� ���
		if (minCnt == Integer.MAX_VALUE)
			minCnt = 0;
		System.out.println(minCnt);
	}
}