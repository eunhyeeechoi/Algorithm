package programmers.kit.hash;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

//2020.12.02
//:: ���α׷��ӽ� �ؽ� - ����Ʈ�ٹ�
//https://codevang.tistory.com/293

public class t42579_2 {
	// �帣���� �迭�� �����������
	// ������ ���� ���ϰ� ��ġ�� ����ϰ� �;��µ� �߾ȵ�

	// 1. �帣�� �� ��ȸ�� �հ� - �帣 ������ ����
	// 2. �帣�� ���� ���� �뷡���� (��ȸ��, �ε���) - ������ ���� ���� 1-2�� �̾Ƴ���
	// �ΰ����� �ѹ��� �ذ��ϱ� ���� ��ü ���.
	// �ϳ��� �帣�� �ϳ��� ��ü�� ������ �� ��ü�ȿ� �� ��ȸ�� �հ������� ���� �뷡 ���� ����Ʈ�� ������ �ִ� ����
	// ������ �Ҷ� �÷��� �迭���� ����� ��ü�� Comparator �������̽��� ������ ��ü�� �������ϰ�,
	// �Ϲ� �迭�� ����� ��ü�� Comparable �������̽��� ��������� �Ѵ�.
	// ������ �迭�� ����Ұ����� ���������� ���ϴ� ����Ʈ�� ������ �����ؼ� ����ϸ� ��

	// �帣�� ����
	class GenresInfo implements Comparable<GenresInfo> {
		private int totalPlays; // �� ��ȸ��
		private List<SongInfo> songInfoList; // �帣�� ���� �뷡 ���� ����Ʈ

		public GenresInfo(int totalPlays, List<SongInfo> songInfo) {
			this.totalPlays = totalPlays;
			this.songInfoList = songInfo;
		}
		// ���� ����

		@Override
		public int compareTo(GenresInfo o) {
			// �� ��ȸ�� ��������
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

	// ���� �뷡 ����
	class SongInfo {
		private int plays; // ��ȸ��
		private int index; // �ε���

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

	// �ߺ� ���ڿ��� �ɷ���� �ϹǷ� HashMap ���.
	// key�� �帣�� �̸�, value �� �帣 ���� ��ü�� ����
	// �ؽøʿ� �� �ϳ��� �帣�� �����, �� �帣 �ȿ� ��� ������ ���ԵǾ� ������ ��
	public int[] solution(String[] genres, int[] plays) {
		// key(�帣�̸�) + value( �� ��ȸ�� + �뷡��ȸ��, �ε��� ����)
		Map<String, GenresInfo> map = new HashMap<>();

		for (int i = 0; i < genres.length; i++) {
			// ���� �߰����� ���� �帣�� ���� ���� �߰�
			if (!map.containsKey(genres[i])) {
				// ���ο� GenresInfo ��ü
				map.put(genres[i], new GenresInfo(plays[i], new ArrayList<SongInfo>()));

				// ���� ������ �뷡 ���� �߰�
				map.get(genres[i]).getSongInfoList().add(new SongInfo(plays[i], i));

			} else {
				// �̹� �����ϴ� �帣�� ���
				// �� ��ȸ�� ����
				GenresInfo temp = map.get(genres[i]);
				temp.setTotalPlays(temp.getTotalPlays() + plays[i]);

				// �뷡 ���� �߰�
				temp.getSongInfoList().add(new SongInfo(plays[i], i));
			}
		}

		class SongInfoListSort implements Comparator<SongInfo> {
			// �ϳ��� �帣 ��ü - �� ��ȸ��, �����뷡 ���� ����Ʈ �� �ϼ��Ǿ����Ƿ� ������ ������
			// �ؽø��� �����̶�� ������ ��� �Ϲ� �迭�� ������ (�ؽø��� ��� ��ȸ)
			// �帣 ��ü �ȿ� �ִ� ���� �뷡 ���� ����Ʈ�� ���ĵ� �ѹ��� ����

			@Override
			public int compare(SongInfo o1, SongInfo o2) {
				// ��ȸ�� ���� �������� ����, ���� ��� �ε��� ���� �������� ����
				if (o1.getPlays() < o2.getPlays() || o1.getPlays() == o2.getPlays() && o1.getIndex() > o2.getIndex()) {
					return 1;
				}
				return -1;
			}

		}

		// �帣 ������ �迭�� �ٲٸ鼭 ���ÿ� �� �帣�� ���� �뷡 ����Ʈ�� ��ȸ���� ����
		GenresInfo[] genresInfoList = new GenresInfo[map.size()];
		int k = 0;
		for (Entry<String, GenresInfo> e : map.entrySet()) {
			genresInfoList[k++] = e.getValue();
			// �� �帣 ���� �뷡 ����Ʈ ����
			e.getValue().getSongInfoList().sort(new SongInfoListSort());
		}

		// ������ �۾�, �帣 �迭 �� ���� �� �� �帣���� ����Ʈ�� �뷡 �������� �ִ� 2��¥�⸸ �ε��� ���� ������
		Arrays.sort(genresInfoList);
		List<Integer> result = new ArrayList<Integer>();

		for (GenresInfo g : genresInfoList) {
			List<SongInfo> list = g.getSongInfoList();
			int size = list.size();

			// 1���� ���
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
