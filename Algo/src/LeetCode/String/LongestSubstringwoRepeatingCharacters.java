package LeetCode.String;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringwoRepeatingCharacters {
// 주어진 문자열 반복되는 문자 없이 가장 긴 문자열의 길이를 찾는 문
// https://leetcode.com/problems/longest-substring-without-repeating-characters/
// 투포인터 알고리즘을 사용한 방법 -> 인덱스를 가리키는 두개의 포인터를 이동시키는 방법
// i,j 포인터가 있으면 조건에 일치하는 경우 j 포인터 이동, 일치하지 않는경우 i 포인터 이동

// Set 은 중복된 값이 들어가지 않는 자료구조.
// Set 에 값을 add 할때 동일한 값이 이미 존재하면 false 를 반환하고 add 하지 않는다.
// 동일한 문자가 이미 추가된 경우, 동일한 문자가 존재하지 않을때까지 Set에 추가된 데이터를 순서대로 삭제.
	public int lengthOfLongestSubstring(String s) {
		Set<Character> subString = new HashSet<Character>();

		int max = 0;
		int i = 0;
		int j = 0;

		while (j < s.length()) {
			char c = s.charAt(j++);
			if (subString.add(c)) {
				if (max < j - i)
					max = j - i;
			} else {
				while (!subString.add(c)) {
					subString.remove(s.charAt(i++));
				}
			}
		}
		return max;
	}

	public static void main(String[] args) {
		LongestSubstringwoRepeatingCharacters aa = new LongestSubstringwoRepeatingCharacters();
		System.out.println(aa.lengthOfLongestSubstring("aaa"));

	}
}