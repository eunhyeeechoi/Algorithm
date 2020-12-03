package programmers.kit.hash;

import java.util.HashMap;
// 2020.12.02
// :: 프로그래머스 해시 - 베스트앨범
public class t42579 {
	public int[] solution(String[] genres, int[] plays) {
		int[] answer = {};
		
		// 장르 별로 나누어서 합이 큰것부터
		// 배열의 위치 출력 (재생수로 찾기)
		// Hash<장르, 재생수> 담은 다음 정렬 하려고 했지
		HashMap<String, Integer> map = new HashMap<>();
		for (int i = 0; i < genres.length; i++) {
			map.put(genres[i], plays[i]);
		}
		return answer;
	}

	public static void main(String[] args) {
		t42579 aa = new t42579();
		String[] genres = { "classic", "pop", "classic", "classic", "pop" };
		int[] plays = { 500, 600, 150, 800, 2500 };

		aa.solution(genres, plays);
	}
}
