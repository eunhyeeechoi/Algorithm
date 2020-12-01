package programmers.kit.search;

// :: 프로그래머스 DFS / BFS - 네트워크
// https://beaniejoy.tistory.com/41

// :: DFS 를 이용한 문제. DFS 를 이용하여 노드를 탐색한 후 dfs 재귀 함수가 끝나는 시점에서
// 다른 노드들을 for 문으로 탐색해보면서 방문 안했던 노드가 존재하는지 찾고
// 방문을 안한 노드가 있다면 또다른 네트워크가 추가 된다는것을 알수 있기에
// 이 기점으로 네트워크 수를 +1 해주면 됌
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
