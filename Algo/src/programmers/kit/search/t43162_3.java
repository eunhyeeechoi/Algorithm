package programmers.kit.search;

// :: ���α׷��ӽ� DFS / BFS - ��Ʈ��ũ
// https://beaniejoy.tistory.com/41

// :: DFS �� �̿��� ����. DFS �� �̿��Ͽ� ��带 Ž���� �� dfs ��� �Լ��� ������ ��������
// �ٸ� ������ for ������ Ž���غ��鼭 �湮 ���ߴ� ��尡 �����ϴ��� ã��
// �湮�� ���� ��尡 �ִٸ� �Ǵٸ� ��Ʈ��ũ�� �߰� �ȴٴ°��� �˼� �ֱ⿡
// �� �������� ��Ʈ��ũ ���� +1 ���ָ� ��
public class t43162_3 {
	public int solution(int n, int[][] computers) {
		int answer = 0;
		boolean[] visited = new boolean[computers.length];

		// Node visit information initializatioin
		for (int i = 0; i < computers.length; i++) {
			visited[i] = false;
		}

		for (int j = 0; j < computers.length; j++) {
			if (visited[j] == false) {
				answer++;
				dfs(j, visited, computers);
			}
		}
		return answer;

	}

	public void dfs(int node, boolean[] visited, int[][] computers) {
		visited[node] = true;

		for (int i = 0; i < computers.length; i++) {
			if (visited[i] == false && computers[node][i] == 1) {
				dfs(i, visited, computers);
			}
		}
	}

	public static void main(String[] args) {
		t43162_3 aa = new t43162_3();
		int[][] computers = { { 1, 1, 0 }, { 1, 1, 0 }, { 0, 0, 1 } };
		int n = 3;
		System.out.println(aa.solution(n, computers));

	}
}
