package programmers.kit.hash;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

//2020.12.02
//:: 프로그래머스 해시 - 베스트앨범
//https://codevang.tistory.com/293

public class t42579_2 {
	// 장르별로 배열을 나누고싶은뎅
	// 나눠서 합을 구하고 위치를 출력하고 싶었는뎅 잘안돼

	// 1. 장르별 총 조회수 합계 - 장르 정렬을 위해
	// 2. 장르에 속한 개별 노래정보 (조회수, 인덱스) - 정렬후 상위 순서 1-2개 뽑아내기
	// 두가지를 한번에 해결하기 위해 객체 사용.
	// 하나의 장르는 하나의 객체를 가지고 이 객체안에 총 조회수 합계정보와 속한 노래 정보 리스트를 가지고 있는 구조
	// 정렬을 할때 컬렉션 계열에서 사용할 객체는 Comparator 인터페이스를 구현한 객체를 만들어야하고,
	// 일반 배열을 사용할 객체는 Comparable 인터페이스를 구현해줘야 한다.
	// 고정된 배열을 사용할것인지 유동적으로 변하는 리스트가 편한지 결정해서 사용하면 됌

	// 장르별 정보
	class GenresInfo implements Comparable<GenresInfo> {
		private int totalPlays; // 총 초회수
		private List<SongInfo> songInfoList; // 장르에 속한 노래 정보 리스트

		public GenresInfo(int totalPlays, List<SongInfo> songInfo) {
			this.totalPlays = totalPlays;
			this.songInfoList = songInfo;
		}
		// 정렬 기준

		@Override
		public int compareTo(GenresInfo o) {
			// 총 조회수 내림차순
			if (totalPlays < o.totalPlays) {
				return 1;
			}
			return -1;
		}

		public int getTotalPlays() {
			return totalPlays;
		}

		public void setTotalPlays(int totalPlays) {
			this.totalPlays = totalPlays;
		}

		public List<SongInfo> getSongInfoList() {
			return songInfoList;
		}

		public void setSongInfoList(List<SongInfo> songInList) {
			this.songInfoList = songInList;
		}

	}

	// 개별 노래 정보
	class SongInfo {
		private int plays; // 조회수
		private int index; // 인덱스

		public SongInfo(int plays, int index) {
			this.plays = plays;
			this.index = index;
		}

		public int getPlays() {
			return plays;
		}

		public int getIndex() {
			return index;
		}
	}

	// 중복 문자열을 걸러줘야 하므로 HashMap 사용.
	// key는 장르의 이름, value 는 장르 저장 객체로 설정
	// 해시맵에 딱 하나의 장르가 생기고, 이 장르 안에 모든 정보가 포함되어 구조가 편리
	public int[] solution(String[] genres, int[] plays) {
		// key(장르이름) + value( 총 조회수 + 노래조회수, 인덱스 정보)
		Map<String, GenresInfo> map = new HashMap<>();

		for (int i = 0; i < genres.length; i++) {
			// 아직 추가되지 않은 장르는 새로 만들어서 추가
			if (!map.containsKey(genres[i])) {
				// 새로운 GenresInfo 객체
				map.put(genres[i], new GenresInfo(plays[i], new ArrayList<SongInfo>()));

				// 현재 순서의 노래 정보 추가
				map.get(genres[i]).getSongInfoList().add(new SongInfo(plays[i], i));

			} else {
				// 이미 존재하는 장르의 경우
				// 총 조회수 증가
				GenresInfo temp = map.get(genres[i]);
				temp.setTotalPlays(temp.getTotalPlays() + plays[i]);

				// 노래 정보 추가
				temp.getSongInfoList().add(new SongInfo(plays[i], i));
			}
		}

		class SongInfoListSort implements Comparator<SongInfo> {
			// 하나의 장르 객체 - 총 조회수, 개별노래 정보 리스트 가 완성되었으므로 정렬을 해주자
			// 해시맵은 정렬이라는 개념이 없어서 일반 배열로 꺼낸후 (해시맵을 모두 순회)
			// 장르 객체 안에 있는 개별 노래 정보 리스트의 정렬도 한번에 수행

			@Override
			public int compare(SongInfo o1, SongInfo o2) {
				// 조회수 기준 내림차순 정렬, 같은 경우 인덱스 기준 오름차순 정렬
				if (o1.getPlays() < o2.getPlays() || o1.getPlays() == o2.getPlays() && o1.getIndex() > o2.getIndex()) {
					return 1;
				}
				return -1;
			}

		}

		// 장르 정보를 배열로 바꾸면서 동시에 각 장르가 가진 노래 래스트를 조회수로 정렬
		GenresInfo[] genresInfoList = new GenresInfo[map.size()];
		int k = 0;
		for (Entry<String, GenresInfo> e : map.entrySet()) {
			genresInfoList[k++] = e.getValue();
			// 각 장르 안의 노래 리스트 정렬
			e.getValue().getSongInfoList().sort(new SongInfoListSort());
		}

		// 마지막 작업, 장르 배열 및 정렬 및 각 장르안의 리스트의 노래 정보에서 최대 2개짜기만 인덱스 정보 가져옴
		Arrays.sort(genresInfoList);
		List<Integer> result = new ArrayList<Integer>();

		for (GenresInfo g : genresInfoList) {
			List<SongInfo> list = g.getSongInfoList();
			int size = list.size();

			// 1개일 경우
			if (size == 1) {
				result.add(list.get(0).getIndex());
			} else {
				for (int i = 0; i < 2; i++) {
					result.add(list.get(i).getIndex());
				}
			}
		}
		int resultSize = result.size();
		int[] answer = new int[resultSize];
		for (int i = 0; i < resultSize; i++) {
			answer[i] = result.get(i);
			System.out.println(answer[i]);
		}
//		System.out.println(answer);
		return answer;
	}

	public static void main(String[] args) {
		t42579_2 aa = new t42579_2();
		String[] genres = { "classic", "pop", "classic", "classic", "pop" };
		int[] plays = { 500, 600, 150, 800, 2500 };

		aa.solution(genres, plays);
	}
}
