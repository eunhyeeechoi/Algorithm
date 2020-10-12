package programmers.kakao;

import java.util.LinkedList;
import java.util.Queue;

public class t60060_1 {
	public int[] solution(String[] words, String[] queries) {
		int[] answer = new int[queries.length];// √ ±‚»≠
		String aa = "";
		int cnt = 0;
		for (int i = 0; i < queries.length; i++) {
			for (int j = 0; j < words.length; j++) {
				if (queries[i].length() == words[j].length()) {
					if (queries[i].startsWith("?")) {
						aa = queries[i].replace("?", "");
						if (words[j].endsWith(aa)) {
							cnt++;
							answer[i] = cnt;
						}
					} else if (queries[i].endsWith("?")) {
						aa = queries[i].replace("?", "");
						if (words[j].startsWith(aa)) {
							cnt++;
							answer[i] = cnt;
						}
					}
				}
			}
			cnt = 0;
		}
		return answer;
	}
}
