package kakao2020;

public class p1_t16422 {
	public String solution(String new_id) {
		String answer = "";
//		String aa = "";
		// 1. �빮�ڿ��� �ҹ��ڷ� ����
		answer = new_id.toLowerCase();
//		System.out.println(aa);
		// 2. Ư������ ����
		answer = answer.replace("~", "").replace("!", "").replace("@", "").replace("#", "").replace("$", "")
				.replace("%", "").replace("^", "").replace("&", "").replace("*", "").replace("(", "").replace(")", "")
				.replace("=", "").replace("+", "").replace("[", "").replace("{", "").replace("]", "").replace("}", "")
				.replace(":", "").replace("?", "").replace(",", "").replace("<", "").replace(">", "");
		System.out.println("Ư������ ���� �� : " + answer);
		// 3. .�� �ΰ� �̻��̸� .��
		answer = answer.replaceAll("(.)\\1{1,}", "$1");
		System.out.println(answer);
		// 4. .�� �� ó���̰ų� ���̸� ����
		if (answer.startsWith(".")) {
			answer = answer.substring(1);
			System.out.println(answer);
		}
		if (answer.endsWith(".")) {
			answer = answer.substring(0, answer.length() - 1);
			System.out.println("������ . �̸� ����" + answer);
		}
		// 5. �� ���ڿ��̸� a��ġȯ
		if (answer.equals("")) {
			answer = "a";
			System.out.println(answer);
		}
		// 6. 16�� �̻��̸� 15���� ���� �ڸ���
		if (answer.length() >= 16) {
			answer = answer.substring(0, 15);
		}
		// 7. ���̰� 2�� �����̸� ������ ���ڸ� ���� 3�� �ɶ����� �ݺ�
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
