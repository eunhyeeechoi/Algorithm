package programmers.kit.search;

// :: 프로그래머스 DFS / BFS - 네트워크
public class t43162 {
	public int solution(int n, int[][] computers) {
		int answer = 0;
		return answer;
	}

	// 연결의 갯수만큼 그래프를 그리고
	// 겹치는거 제외 하구 경우의 수를 그리면 될듯
	// 겹치면 같은 네트워크라고 간주하니까
	// 너비우선 탐색인지 깊이 우선 탐색 인지는 잘 모르게쑴
	// 재귀함수로 해서 멱집합에서 교집합 제외하구 구하면 될것같은데
	// 이번에도 구현은 못했네...
	// 10:35~ 11:10분 40분
	public static void main(String[] args) {
		t43162 aa = new t43162();
		int[][] computers = { { 1, 1, 0 }, { 1, 1, 0 }, { 0, 0, 1 } };
		int n = 3;
		System.out.println(aa.solution(n, computers));
		
	}
}
