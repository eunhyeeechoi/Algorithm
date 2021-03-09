package LeetCode;
// 참고 https://dev.to/rohithv07/1332-remove-palindromic-subsequences-leetcode-easy-33ji
public class RemovePalindromicSubsequences_2 {
	public int removePalindromeSub(String s) {
		// string empty
		if (s.length() == 0)
			return 0;
		// 1) 주어진 문자열이 비어 있는지 확인하고 참이면 0을 반환합니다.
		int left = 0;
		int right = s.length() - 1;
		// 2) 포인터 2 개를 사용합니다. left = 0, right = stringLength-1
		while (left < right) {
		// 3) left <right 동안 다음을 수행합니다
		//  실패하면 회문 상태를 확인하고, 그렇지 않으면 계속합니다. 루프가 끝날 때까지.
			// palindrome condition
			if (s.charAt(left) == s.charAt(right)) {
				left += 1;
				right -= 1;
			} else
				return 2;
		}
		//4) 1을 반환합니다.
		return 1;
	}
}
