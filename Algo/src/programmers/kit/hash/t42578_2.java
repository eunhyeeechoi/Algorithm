package programmers.kit.hash;

import java.util.HashMap;

//::programmers - HASH 2020.11.09
// ����� ���� �̿��Ѱ�
// ����� �� ���ϴ� ���� (n + 1) * (m + 1) * (o + 1) * (p + 1) - 1
// ����  https://sas-study.tistory.com/215
public class t42578_2 {
	public int solution(String[][] clothes) {
		int answer = 1;

		HashMap<String, Integer> map = new HashMap<>();

		for (int i = 0; i < clothes.length; i++) {
			if (map.get(clothes[i][1]) == null)
				map.put(clothes[i][1], 1);
			else
				map.put(clothes[i][1], map.get(clothes[i][1]) + 1);
		}

		for (String keys : map.keySet()) {
			answer *= (map.get(keys) + 1);
		}

		answer -= 1;
		return answer;
	}

	public static void main(String[] args) {
		String[][] clothes = { { "yellow_hat", "headgear" }, { "blue_sunglasses", "eyewear" },
				{ "green_turban", "headgear" } };
		// ����� �� �ΰ� ������

		t42578_2 aa = new t42578_2();
		aa.solution(clothes);
	}
}
