package LeetCode;

/*
 two point solution
 배열 양쪽에 각각 포인터를 지정하고 하나의 조건 (어떤 포인터에서의 높이가 더 높은지)
 를 걸고 그 조건의 결과에 따라 어떤 포인터를 가운데로 당겨올지 결정
*/
public class ContainerWithMostWater_2 {
	public int maxArea(int[] height) {
		int answer = 0;
		int forward = 0;
		int backwrad = height.length - 1;

		while (forward < backwrad) {
			// 어떤 포인터를 당겨올지 정하는 조건
			if (height[forward] < height[backwrad]) {
				answer = Math.max(height[forward] * (backwrad - forward), answer);
				forward++;
			} else {
				answer = Math.max(height[backwrad] * (backwrad - forward), answer);
				backwrad--;
			}
		}
		System.out.println(answer);
		return answer;

	}

	public static void main(String[] args) {
		int[] height = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
		ContainerWithMostWater_2 ss = new ContainerWithMostWater_2();
		ss.maxArea(height);
	}
}
