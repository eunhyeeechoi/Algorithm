package kakao2020;

public class p1_t16422_2 {
	public String solution(String new_id) {
		String answer = "";
		answer = new_id.toLowerCase();
		answer = answer.replace("~", "").replace("!", "").replace("@", "").replace("#", "").replace("$", "")
				.replace("%", "").replace("^", "").replace("&", "").replace("*", "").replace("(", "").replace(")", "")
				.replace("=", "").replace("+", "").replace("[", "").replace("{", "").replace("]", "").replace("}", "")
				.replace(":", "").replace("?", "").replace(",", "").replace("<", "").replace(">", "");
		answer = answer.replaceAll("(.)\\1{1,}", "$1");
		if (answer.startsWith(".")) {
			answer = answer.substring(1);
		}
		if (answer.endsWith(".")) {
//			System.out.println("잉 여기 왜 안타?");
			answer = answer.substring(0, answer.length() - 1);
//			System.out.println("마지막 .이면 제거" + answer);
		}
		if (answer.equals("")) {
			answer = "a";
		}
		if (answer.length() >= 16) {
			answer = answer.substring(0, 15);
			if (answer.startsWith(".")) {
				answer = answer.substring(1);
			}
			if (answer.endsWith(".")) {
//				System.out.println("잉 여기 왜 안타?");
				answer = answer.substring(0, answer.length() - 1);
//				System.out.println("마지막 .이면 제거" + answer);
			}
		} else if (answer.length() <= 2) {
			char last = answer.charAt(answer.length() - 1);
			while (answer.length() < 3) {
				answer += last;
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		p1_t16422_2 te = new p1_t16422_2();
//		String ret = te.solution("...!@BaT#*..y.abcdefghijklm))");
//		String ret = te.solution("z-+.^.z.....");
//		String ret = te.solution("=.=");
		String ret = te.solution("abcdefghijklmn.p");
		System.out.println(ret);
	}
}
