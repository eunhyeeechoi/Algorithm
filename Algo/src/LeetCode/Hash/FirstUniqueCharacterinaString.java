package LeetCode.Hash;

import java.util.HashMap;

public class FirstUniqueCharacterinaString {
	public static void main(String[] args) {
		FirstUniqueCharacterinaString aa = new FirstUniqueCharacterinaString();
		String s = "loveleetcode";
		System.out.println(aa.firstUniqChar(s));
	}

	public int firstUniqChar(String s) {
		HashMap<Character, Integer> hey = new HashMap<Character, Integer>();
		char[] ch = s.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (hey.containsKey(ch[i])) {
				hey.put(ch[i], hey.get(ch[i]) + 1);
			} else {
				hey.put(ch[i], 1);
			}
		}
		// 이부분이 어려웠는데 index 를 배열에서 찾는게 아니라 hash map 에서 길이로 위치를 찾는 방식이 있네
		for (int i = 0; i < s.length(); i++) {
			if (hey.get(ch[i]) == 1) {
				return i;
			}
		}
		return -1;
	}
}
