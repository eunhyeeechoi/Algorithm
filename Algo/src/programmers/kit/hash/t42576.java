package programmers.kit.hash;

import java.util.Arrays;

public class t42576 {
	public String solution(String[] participant, String[] completion) {
		Arrays.sort(participant);
		Arrays.sort(completion);
		int i = 0;
		for (i = 0; i < completion.length; i++) {
			if (!participant[i].equals(completion[i])) {
				System.out.println("다를때 :" + i + participant[i]);
//				System.out.println("다를때 :" + i + completion[i]);
				return participant[i];
			} else {
//				System.out.println("같을때 :" + i + participant[i]);
//				System.out.println("같을때 :" + i + completion[i]);
			}
			System.out.println(participant[i] + "," + completion[i] + ", i:" + i);
			System.out.println("다른 값 : " + participant[i + 1]);
		}

		return participant[i];
	}

	public static void main(String[] args) {
		t42576 aa = new t42576();
//		String[] cc = { "leo", "kiki", "eden" };
//		String[] dd = { "eden", "kiki" };
		String[] cc = { "marina", "josipa", "nikola", "vinko", "filipa" };
		String[] dd = { "josipa", "filipa", "marina", "nikola" };
		String bb = aa.solution(cc, dd);
		System.out.println("return : " + bb);
	}
}
