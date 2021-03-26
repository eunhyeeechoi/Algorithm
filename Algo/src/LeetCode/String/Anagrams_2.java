package LeetCode.String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Anagrams_2 {
	public static void main(String[] args) {
		Anagrams_2 aa = new Anagrams_2();
		String[] strs = { "eat", "tea", "tan", "ate", "nat", "bat" };
		System.out.println(aa.groupAnagrams(strs));
	}

	public List<List<String>> groupAnagrams(String[] strs) {
		List<List<String>> result = new ArrayList<>();
		Map<String, List<String>> map = new HashMap<>();
		if (strs == null)
			return result;
		for (int i = 0; i < strs.length; i++) {
			char[] next = strs[i].toCharArray();
			Arrays.sort(next);
			String temp = Arrays.toString(next);
			if (map.containsKey(temp)) {
				map.get(temp).add(strs[i]);
			} else {
				List<String> list = new ArrayList<String>();
				list.add(strs[i]);
				map.put(temp, list);
			}
		}
		return new ArrayList(map.values());
	}
}
