package programmers.kit.search;
//::프로그래머스 dfs/bfs - 타겟넘버
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
//				// 1번째꺼부터 하나씩 빼보고 싶은데 나머지는 +하고
//				System.out.println("j값" + numbers[j]);
//				if (sum - numbers[j] == target) {
//					count++;
//				} else {
//
//				}
//			}
			System.out.println("합" + sum);
			System.out.println("수" + count);
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
