package programmers.kit.search;

// :: ���α׷��ӽ� DFS / BFS - ��Ʈ��ũ
//https://velog.io/@ajufresh/%ED%94%84%EB%A1%9C%EA%B7%B8%EB%9E%98%EB%A8%B8%EC%8A%A4-%EB%84%A4%ED%8A%B8%EC%9B%8C%ED%81%AC-%EB%AC%B8%EC%A0%9C%ED%92%80%EC%9D%B4-Java
public class t43162_2 {
	public int solution(int n, int[][] computers) {
		int answer = 0;
		boolean[] check = new boolean[n]; // n ������ŭ boolean �迭�� ����� ��� ��Ҹ� false�� �ʱ�ȭ

		for (int i = 0; i < n; i++) {
			// 1. n��ŭ �ݺ� �����ϴٰ� check[i] ���� false �ΰ� ������ dfs �޼ҵ� ȣ��
			if (!check[i]) {
				dfs(computers, i, check);
				answer++;
			}
		}

		return answer;
	}

	boolean[] dfs(int[][] computers, int i, boolean[] check) {
		check[i] = true; // 3. check �� true �� �ٲ�

		for (int j = 0; j < computers.length; j++) {
			// 4. computer[]�� ���̸�ŭ �ݺ�

			if (i != j && computers[i][j] == 1 && check[j] == false) {
				// 2. �ڱ��ڽ��� �ƴϰ�, �ش��ϴ� ��ġ�� check == false�̰�, ���� 1�ΰ�
				check = dfs(computers, j, check);
			}
		}
		return check;
	}

	public static void main(String[] args) {
		t43162_2 aa = new t43162_2();
		int[][] computers = { { 1, 1, 0 }, { 1, 1, 0 }, { 0, 0, 1 } };
		int n = 3;
		System.out.println(aa.solution(n, computers));

	}

}
