package LeetCode;

// https://velog.io/@peppermint100/Leetcode-Container-With-Most-Water-in-Javascript
public class ContainerWithMostWater {
	public int maxArea(int[] height) {
		int answer = 0;
		for (int i = 0; i < height.length; i++) {
			for (int j = i + 1; j < height.length; j++) {
				int hei = Math.min(height[i], height[j]);
				int wid = j - i;
				int area = hei * wid;
				if (area > answer) {
					answer = area;
				}
			}
		}
		System.out.println(answer);
		return answer;
	}

	// �ΰ��� for ������ ��� ����� ���� ���̸� ã�� ���� ū ���� �����صξ��ٰ� ����
	// height �迭�� �ι� ���⶧���� �ð����⵵�� O(n2)
	public static void main(String[] args) {
		int[] height = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
		ContainerWithMostWater ss = new ContainerWithMostWater();
		ss.maxArea(height);
	}
}
