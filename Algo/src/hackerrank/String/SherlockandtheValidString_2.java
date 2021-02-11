package hackerrank.String;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SherlockandtheValidString_2 {
//	https://jackjeong.tistory.com/58
	/*
	 * map 에 각 문자열의 수를 넣고 map 의 개수를 key 로 하고 그 개수를 value 에 넣는다
	 */
	static String isValid(String s) {

		Map<Character, Integer> map = new HashMap<Character, Integer>();

		for (char c : s.toCharArray()) {
			/*
			 * String 문자열에서 다른 알파벳이 나오면 저장 하고싶은뎅 다른게 나왔는지 어떻게 구분하구 각각의 알파벳에 해당하는것 체크를 어떠케 하징
			 * 갯수를 증가시켜서 Hash Map <문자열, 갯수> 이렇게 하고싶은데 어렵넹 흡
			 */
			map.putIfAbsent(c, 0);
			map.computeIfPresent(c, (k, v) -> v + 1);
		}

		List<Integer> list = new ArrayList<Integer>();
		for (int i : map.values())
			list.add(i);

		Map<Integer, Integer> map2 = new HashMap<Integer, Integer>();

		for (int c : list) {
			map2.putIfAbsent(c, 0);
			map2.computeIfPresent(c, (k, v) -> v + 1);
		}

		List<Integer> keys = new ArrayList<Integer>();
		List<Integer> values = new ArrayList<Integer>();

		for (int i : map2.keySet())
			keys.add(i);
		for (int i : map2.values())
			values.add(i);

		if (values.size() == 1)
			return "YES";
		if (values.size() == 2) {
			int one_value_key = 0;
			for (int i = 0; i < values.size(); i++)
				if (values.get(i) == 1)
					one_value_key = keys.get(i);
			if (values.contains(1) && Math.abs(keys.get(0) - keys.get(1)) == 1)
				return "YES";
			if (values.contains(1) && one_value_key == 1)
				return "YES";
		}
		return "NO";
	}

}
