package programmers.kit.bruteforceSearch;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class t42840_2 {
	public int[] solution(int[] answers) {
		int[] answer = {};
		int a[] = { 1, 2, 3, 4, 5 };
		int b[] = { 2, 1, 2, 3, 2, 4, 2, 5 };
		int c[] = { 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, };

		int all[] = new int[3];// 3명 비교

		for (int i = 0; i < answers.length; i++) {
			if (answers[i] == a[i % a.length]) {
				all[0]++;
			}
			if (answers[i] == b[i % b.length]) {
				all[1]++;
			}
			if (answers[i] == c[i % c.length]) {
				all[2]++;
			}
		}

		List<Integer> clearPerson = new ArrayList<Integer>();
		// List 만들어주고 최대값 비교

		int max = Math.max(Math.max(all[0], all[1]), all[2]);
		
		if (max == all[0]) {
			clearPerson.add(1);
		}
		if (max == all[1]) {
			clearPerson.add(2);
		}
		if (max == all[2]) {
			clearPerson.add(3);
		}

		Collections.sort(clearPerson);
		// 가장 높은 점수를 받은 사람이 여러명일 경우 오릋마순
		answer = new int[clearPerson.size()];

		for (int p = 0; p < answer.length; p++) {
			answer[p] = clearPerson.get(p);
		}

		return answer;
	}

	public static void main(String[] args) {
		int[] answers = { 1, 2, 3, 4, 5 };
		t42840_2 aa = new t42840_2();
		aa.solution(answers);
	}
}
