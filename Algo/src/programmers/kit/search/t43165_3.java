package programmers.kit.search;

//::프로그래머스 dfs/bfs - 타겟넘버
//2020.11.30
public class t43165_3 {
	// ::dfs 풀이
	// https://machine-geon.tistory.com/134
	public int DFS(int[] numbers, int target, int index, int num) {
		if (index == numbers.length) {
			return num == target ? 1 : 0;
		} else {
			// 3. DFS 는 진행하는 동안 덧셈과 뺄셈을 각각 재귀호출
			return DFS(numbers, target, index + 1, num + numbers[index])
					+ DFS(numbers, target, index + 1, num - numbers[index]);
			// 4. numbers 의 크기와 index 가 일치하는 경우 -> 모든 자리에 대한 탐색 완료
		}
	}

	public int solution(int[] numbers, int target) {
		// 1. 매개변수로 numbers 배열 , target 이 넘어옴
		int answer = DFS(numbers, target, 0, 0);
		// 2. DFS 호출 (배열, 타겟번호, 인덱스번호, 되는 경우의수)
		return answer;
	}

	public static void main(String[] args) {
		t43165_3 aa = new t43165_3();
		int[] numbers = { 1, 1, 1, 1, 1 };
		int target = 3;
		int bb = aa.solution(numbers, target);
		System.out.println(bb);
	}
}
