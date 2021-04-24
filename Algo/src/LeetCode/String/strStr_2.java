package LeetCode.String;

//https://leetcode.com/problems/implement-strstr/discuss/13035/on-solution-using-concept-of-rolling-hash
// 리트코드 -String 문제 Rolling Hash를 이용한풀이 
public class strStr_2 {
	public int strStr(String haystack, String neddle) {
		if (haystack == null && neddle == null) // 빈것이면 0 리
			return 0;
		if (haystack == null || neddle == null || haystack.length() < neddle.length()) // 대상 문자열 길이가 찾는문자열 길이보다 짧으면 -1
			return -1;

		int m = haystack.length();
		int n = neddle.length();
		long base = 1;

		long needleHash = 0;
		// needle 의 해시값을 만들고
		for (int i = 0; i < n; i++) {
			needleHash = needleHash * 29 + (neddle.charAt(i) - 'a' + 1);
			base *= 29;
		}

		long haystackHash = 0;
		// haystack 의 해시값을 만들오 
		for (int i = 0; i < n; i++) {
			haystackHash = haystackHash * 29 + (haystack.charAt(i) - 'a' + 1);
		}

		if (haystackHash == needleHash)
			return 0;
		base /= 29;

		for (int i = n; i < m; i++) {
			haystackHash = (haystackHash - (haystack.charAt(i - n) - 'a' + 1) * base) * 29
					+ (haystack.charAt(i) - 'a' + 1);
			if (haystackHash == needleHash)
				return i - n + 1;
		}

		return -1;
	}

	public static void main(String[] args) {
		String haystack = "hello";
		String needle = "ll";
		strStr_2 aa = new strStr_2();
		aa.strStr(haystack, needle);
	}
}
