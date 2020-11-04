package programmers.kit.hash;

import java.util.HashMap;

//use hash
public class t42576_2 {
	public String solution(String[] participant, String[] completion) {
		String answer = "";
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		for (String player : participant) {
			hm.put(player, hm.getOrDefault(player, 0) + 1);
		}
		for (String player : completion) {
			hm.put(player, hm.get(player) - 1);
		}

		for (String key : hm.keySet()) {
			if (hm.get(key) != 0) {
				answer = key;
			}
		}

		return answer;
	}

	public static void main(String[] args) {
		t42576_2 aa = new t42576_2();
//		String[] cc = { "leo", "kiki", "eden" };
//		String[] dd = { "eden", "kiki" };
		String[] cc = { "marina", "josipa", "nikola", "vinko", "filipa" };
		String[] dd = { "josipa", "filipa", "marina", "nikola" };
		String bb = aa.solution(cc, dd);
		System.out.println("°á°ú°ª : " + bb);
	}
}
