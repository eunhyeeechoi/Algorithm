package LeetCode.String;

public class strStr {
	public int strStr(String haystack, String needle) {
		int answer = 0;
		if (needle.isEmpty()) {
			// 비어있다면 0 리턴
			int nhash = makehash(needle);
			// heystack 0 번째 문자열부터 비교를 해서 needle 길이까지 비교해야하는데 ㅎㅎ
		}
		return answer;
	}

	public int makehash(String Str) {

		// 해시코드 만드는곳
		return 1;

	}

	public boolean checkalpha() {
		// hash 코드 값이 같을때 알파벳 체크할 메소드
		return true;

	}

	public static void main(String[] args) {
		String haystack = "hello";
		String needle = "ll";
		strStr aa = new strStr();
		aa.strStr(haystack, needle);
	}
}
