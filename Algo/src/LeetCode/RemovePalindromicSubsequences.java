package LeetCode;

public class RemovePalindromicSubsequences {
// https://leetcode.com/explore/challenge/card/march-leetcoding-challenge-2021/589/week-2-march-8th-march-14th/3665/
	// https://dev.to/seanpgallivan/solution-remove-palindromic-subsequences-4683
	public int removePalindromeSub(String s) {
		if (s.length() == 0)
			return 0;
		for (int i = 0, j = s.length() - 1; i < j; i++, j--) {
			if (s.charAt(i) != s.charAt(j)) {
				return 2;
			}
		}
		return 1;
	}
}
