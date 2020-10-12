package kakao2020;

public class p1_t16422 {
	public String solution(String new_id) {
		String answer = "";
//		String aa = "";
		// 1. 대문자에서 소문자로 변경
		answer = new_id.toLowerCase();
//		System.out.println(aa);
		// 2. 특수문자 제거
		answer = answer.replace("~", "").replace("!", "").replace("@", "").replace("#", "").replace("$", "")
				.replace("%", "").replace("^", "").replace("&", "").replace("*", "").replace("(", "").replace(")", "")
				.replace("=", "").replace("+", "").replace("[", "").replace("{", "").replace("]", "").replace("}", "")
				.replace(":", "").replace("?", "").replace(",", "").replace("<", "").replace(">", "");
		System.out.println("특수문자 제거 후 : " + answer);
		// 3. .가 두개 이상이면 .로
		answer = answer.replaceAll("(.)\\1{1,}", "$1");
		System.out.println(answer);
		// 4. .가 맨 처음이거나 끝이면 제거
		if (answer.startsWith(".")) {
			answer = answer.substring(1);
			System.out.println(answer);
		}
		if (answer.endsWith(".")) {
			answer = answer.substring(0, answer.length() - 1);
			System.out.println("마지막 . 이면 제거" + answer);
		}
		// 5. 빈 문자열이면 a로치환
		if (answer.equals("")) {
			answer = "a";
			System.out.println(answer);
		}
		// 6. 16자 이상이면 15문자 까지 자르기
		if (answer.length() >= 16) {
			answer = answer.substring(0, 15);
		}
		// 7. 길이가 2자 이하이면 마지막 문자를 길이 3이 될때까지 반복
		if (answer.length() <= 2) {
			char last = answer.charAt(answer.length() - 1);
			while (answer.length() < 3) {
				answer += last;
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		p1_t16422 te = new p1_t16422();
//		String ret = te.solution("...!@BaT#*..y.abcdefghijklm))");
//		String ret = te.solution("z-+.^.z.....");
		String ret = te.solution("=.=");
//		String ret = te.solution("abcdefghijklmn.p");
//		System.out.println(ret);
	}
}
