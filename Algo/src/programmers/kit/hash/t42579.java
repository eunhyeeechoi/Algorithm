package programmers.kit.hash;

import java.util.HashMap;
// 2020.12.02
// :: ���α׷��ӽ� �ؽ� - ����Ʈ�ٹ�
public class t42579 {
	public int[] solution(String[] genres, int[] plays) {
		int[] answer = {};
		
		// �帣 ���� ����� ���� ū�ͺ���
		// �迭�� ��ġ ��� (������� ã��)
		// Hash<�帣, �����> ���� ���� ���� �Ϸ��� ����
		HashMap<String, Integer> map = new HashMap<>();
		for (int i = 0; i < genres.length; i++) {
			map.put(genres[i], plays[i]);
		}
		return answer;
	}

	public static void main(String[] args) {
		t42579 aa = new t42579();
		String[] genres = { "classic", "pop", "classic", "classic", "pop" };
		int[] plays = { 500, 600, 150, 800, 2500 };

		aa.solution(genres, plays);
	}
}
