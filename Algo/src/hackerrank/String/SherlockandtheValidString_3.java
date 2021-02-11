package hackerrank.String;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

// https://github.com/RyanFehr/HackerRank/blob/master/Algorithms/Strings/Sherlock%20and%20Valid%20String/Solution.java
public class SherlockandtheValidString_3 {
	static String isValid(String s) {
		String answer = "";
		// ���ڿ�-> char �з��ؼ� ���ڿ��� �̹� �����ϸ� ���� ����, ������ map �� �߰�
		Map<Character, Integer> fre = new HashMap<Character, Integer>();
		for (char letter : s.toCharArray()) {
			if (fre.containsKey(letter))
				fre.put(letter, fre.get(letter) + 1);
			else
				fre.put(letter, 1);
		}

		Set<Integer> st = new HashSet<>();
		// HasuSet �� ���� �߰��Ҷ� add ���.
		// �ԷµǴ� ���� HashSet ���ο� �������� ������ �߰� / �ߺ��Ǹ� �߰����� �ʴ´�.
		for (int freq : fre.values()) {
			st.add(freq);
		}

		if (st.size() > 2) {
			// Map �� ũ�Ⱑ 2���� ū���� ���̰� �ٸ� ���ڿ��� ������ 2���� �Ѵ°��̹Ƿ� NO
			answer = "NO";
		} else if (st.size() == 1)
			answer = "YES";
		else {
			int f1 = 0;
			int f2 = 0;
			int f1cnt = 0;
			int f2cnt = 0;
			int i = 0;
			for (int n : st) {
				if (i == 0)
					f1 = n;
				else
					f2 = n;
				i++;
			}

			for (int freq : fre.values()) {
				if (freq == f1)
					f1cnt++;
				if (freq == f2)
					f2cnt++;
			}

			if ((f1 == 1 && f1cnt == 1) || (f2 == 1 && f2cnt == 1)) {
				// ���̰� 1���϶�
				answer = "YES";
			} else if ((Math.abs(f1 - f2) == 1) && (f1cnt == 1 || f2cnt == 1))
				// �ΰ����� 1�� ���̳��ٸ� 1�������ؼ� ���������Ƿ�
				answer = "YES";
			else
				answer = "NO";
		}
		return answer;
	}
}
