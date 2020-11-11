package programmers.kit.bruteforceSearch;

public class t42839 {
	public int solution(String numbers) {
		int answer = 0;
		char[] bb = numbers.toCharArray();
		answer = bb.length;
		// 1. 배열로 바꿔주기
		return answer;

		// 2. 모든 조합을 찾고 소수인지 체크 한 후 cnt ++
	}

	public static void main(String[] args) {
		String numbers = "17";
//		String numbers = "011";
		t42839 aa = new t42839();
		int bb = aa.solution(numbers);
		System.out.println(bb);
	}
}
