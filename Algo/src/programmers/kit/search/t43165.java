package programmers.kit.search;
//::���α׷��ӽ� dfs/bfs - Ÿ�ٳѹ�
//2020.11.30
public class t43165 {
	public int solution(int[] numbers, int target) {
		int answer = 0;
		int sum = 0;
		int count = 0;
//		for (int i = 0; i < numbers.length; i++) {
//			sum += numbers[i];
//		}
		for (int i = 0; i < numbers.length; i++) {
			sum = numbers[i];
//			for (int j = i; j < numbers.length; j++) {
//				// 1��°������ �ϳ��� ������ ������ �������� +�ϰ�
//				System.out.println("j��" + numbers[j]);
//				if (sum - numbers[j] == target) {
//					count++;
//				} else {
//
//				}
//			}
			System.out.println("��" + sum);
			System.out.println("��" + count);
		}

		return answer;
	}

	public static void main(String[] args) {
		t43165 aa = new t43165();
		int[] numbers = { 1, 1, 1, 1, 1 };
		int target = 4;
		aa.solution(numbers, target);
	}
}
