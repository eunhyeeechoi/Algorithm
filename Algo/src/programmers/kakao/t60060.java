package programmers.kakao;

import java.util.LinkedList;
import java.util.Queue;

public class t60060 {
	public int[] solution(String[] words, String[] queries) {
		int[] answer = new int[queries.length];// �ʱ�ȭ
		String aa = "";
		String bb = "";
		int cnt = 0;
		Queue<Integer> ret = new LinkedList<>();
		for (int i = 0; i < queries.length; i++) {
			for (int j = 0; j < words.length; j++) {
				if (queries[i].length() == words[j].length()) {
					if (queries[i].startsWith("?")) {
						aa = queries[i].replace("?", "");
						System.out.println("��ƺ�" + aa);
						if (words[j].endsWith(aa)) {
							// System.out.println("�ش��ϴ°�"+words[j]);
							cnt++;
							System.out.println("cnt ��" + cnt);
							answer[i] = cnt;
						}
					} else if (queries[i].endsWith("?")) {
						aa = queries[i].replace("?", "");
						// System.out.println("�����°�"+queries[i]);
						if (words[j].startsWith(aa)) {
							System.out.println("�ش��ϴ°�" + words[j]);
							cnt++;
							System.out.println("cnt ��" + cnt);
							answer[i] = cnt;
						}
					}
				}
			}
		}

		return answer;
	}
}
