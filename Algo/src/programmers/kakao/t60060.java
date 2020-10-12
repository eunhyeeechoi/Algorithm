package programmers.kakao;

import java.util.LinkedList;
import java.util.Queue;

public class t60060 {
	public int[] solution(String[] words, String[] queries) {
		int[] answer = new int[queries.length];// 초기화
		String aa = "";
		String bb = "";
		int cnt = 0;
		Queue<Integer> ret = new LinkedList<>();
		for (int i = 0; i < queries.length; i++) {
			for (int j = 0; j < words.length; j++) {
				if (queries[i].length() == words[j].length()) {
					if (queries[i].startsWith("?")) {
						aa = queries[i].replace("?", "");
						System.out.println("담아봄" + aa);
						if (words[j].endsWith(aa)) {
							// System.out.println("해당하는것"+words[j]);
							cnt++;
							System.out.println("cnt 값" + cnt);
							answer[i] = cnt;
						}
					} else if (queries[i].endsWith("?")) {
						aa = queries[i].replace("?", "");
						// System.out.println("끝나는것"+queries[i]);
						if (words[j].startsWith(aa)) {
							System.out.println("해당하는것" + words[j]);
							cnt++;
							System.out.println("cnt 값" + cnt);
							answer[i] = cnt;
						}
					}
				}
			}
		}

		return answer;
	}
}
