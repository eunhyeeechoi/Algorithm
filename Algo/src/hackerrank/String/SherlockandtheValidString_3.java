package hackerrank.String;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

// https://github.com/RyanFehr/HackerRank/blob/master/Algorithms/Strings/Sherlock%20and%20Valid%20String/Solution.java
public class SherlockandtheValidString_3 {
	static String isValid(String s) {
		String answer = "";
		// 문자열-> char 분류해서 문자열이 이미 존재하면 갯수 증가, 없으면 map 에 추가
		Map<Character, Integer> fre = new HashMap<Character, Integer>();
		for (char letter : s.toCharArray()) {
			if (fre.containsKey(letter))
				fre.put(letter, fre.get(letter) + 1);
			else
				fre.put(letter, 1);
		}

		Set<Integer> st = new HashSet<>();
		// HasuSet 에 값을 추가할때 add 사용.
		// 입력되는 값이 HashSet 내부에 존재하지 않으면 추가 / 중복되면 추가하지 않는다.
		for (int freq : fre.values()) {
			st.add(freq);
		}

		if (st.size() > 2) {
			/// Map 의 크기가 2보다 큰것은 길이가 다른 문자열의 종류가 2개가 넘는것이므로 NO
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
				// 길이가 1씩일때
				answer = "YES";
			} else if ((Math.abs(f1 - f2) == 1) && (f1cnt == 1 || f2cnt == 1))
				/// 두개여도 1만 차이난다면 1번삭제해서 가능해지므로
				answer = "YES";
			else
				answer = "NO";
		}
		return answer;
	}
}
