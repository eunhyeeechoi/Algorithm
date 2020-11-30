package programmers.kit.search;

//::���α׷��ӽ� dfs/bfs - Ÿ�ٳѹ�
//2020.11.30
public class t43165_3 {
	// ::dfs Ǯ��
	// https://machine-geon.tistory.com/134
	public int DFS(int[] numbers, int target, int index, int num) {
		if (index == numbers.length) {
			return num == target ? 1 : 0;
		} else {
			// 3. DFS �� �����ϴ� ���� ������ ������ ���� ���ȣ��
			return DFS(numbers, target, index + 1, num + numbers[index])
					+ DFS(numbers, target, index + 1, num - numbers[index]);
			// 4. numbers �� ũ��� index �� ��ġ�ϴ� ��� -> ��� �ڸ��� ���� Ž�� �Ϸ�
		}
	}

	public int solution(int[] numbers, int target) {
		// 1. �Ű������� numbers �迭 , target �� �Ѿ��
		int answer = DFS(numbers, target, 0, 0);
		// 2. DFS ȣ�� (�迭, Ÿ�ٹ�ȣ, �ε�����ȣ, �Ǵ� ����Ǽ�)
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
