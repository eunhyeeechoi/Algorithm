package programmers.kit.search;

// :: 프로그래머스 DFS / BFS - 네트워크
//https://velog.io/@ajufresh/%ED%94%84%EB%A1%9C%EA%B7%B8%EB%9E%98%EB%A8%B8%EC%8A%A4-%EB%84%A4%ED%8A%B8%EC%9B%8C%ED%81%AC-%EB%AC%B8%EC%A0%9C%ED%92%80%EC%9D%B4-Java
public class t43162_2 {
	public int solution(int n, int[][] computers) {
		int answer = 0;
		boolean[] check = new boolean[n]; // n 갯수만큼 boolean 배열을 만들고 모든 요소를 false로 초기화

		for (int i = 0; i < n; i++) {
			// 1. n만큼 반복 실행하다가 check[i] 값이 false 인게 있으면 dfs 메소드 호출
			if (!check[i]) {
				dfs(computers, i, check);
				answer++;
			}
		}

		return answer;
	}

	boolean[] dfs(int[][] computers, int i, boolean[] check) {
		check[i] = true; // 3. check 를 true 로 바꿈

		for (int j = 0; j < computers.length; j++) {
			// 4. computer[]의 길이만큼 반복

			if (i != j && computers[i][j] == 1 && check[j] == false) {
				// 2. 자기자신이 아니고, 해당하는 위치의 check == false이고, 값이 1인것
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
