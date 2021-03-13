package LeetCode;

/*
 two point solution
 �迭 ���ʿ� ���� �����͸� �����ϰ� �ϳ��� ���� (� �����Ϳ����� ���̰� �� ������)
 �� �ɰ� �� ������ ����� ���� � �����͸� ����� ��ܿ��� ����
*/
public class ContainerWithMostWater_2 {
	public int maxArea(int[] height) {
		int answer = 0;
		int forward = 0;
		int backwrad = height.length - 1;

		while (forward < backwrad) {
			// � �����͸� ��ܿ��� ���ϴ� ����
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
