package programmers.kit.search;
//::���α׷��ӽ� dfs/bfs - Ÿ�ٳѹ�
//2020.11.30
public class t43165_2 {
	// ::dfs Ǯ��
	// https://www.pymoon.com/entry/Programmers-%ED%83%80%EA%B2%9F-%EB%84%98%EB%B2%84-BFSDFS-Java-%ED%92%80%EC%9D%B4
	public int dfs(int prev, int index, int[] numbers, int target) {
		if (index >= numbers.length) {
			if (target == prev) {
				return 1;
			}
			return 0;
		}

		int cur1 = prev + numbers[index];
		int cur2 = prev - numbers[index];

		int ans = 0;
		ans += dfs(cur1, index + 1, numbers, target);
		ans += dfs(cur2, index + 1, numbers, target);
		return ans;
	}

	// ��ͷ� ��� ����� ��(���ϰ�, ����) �� �� �־ ���Ѵ�.
	// ������� �������� target �� �����Ұ�� �� ���� �ϰ� �̰��� �����Ѱ��� ������̴�.
	public int solution(int[] numbers, int target) {
		int current = numbers[0];
		int answer = 0;
		answer += dfs(current, 1, numbers, target);
		answer += dfs(-current, 1, numbers, target);
		System.out.println("��" + answer);
		return answer;
	}

	public static void main(String[] args) {
		t43165_2 aa = new t43165_2();
		int[] numbers = { 1, 1, 1, 1, 1 };
		int target = 3;
		aa.solution(numbers, target);
	}
}
