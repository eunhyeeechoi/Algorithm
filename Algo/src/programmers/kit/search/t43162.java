package programmers.kit.search;

// :: ���α׷��ӽ� DFS / BFS - ��Ʈ��ũ
public class t43162 {
	public int solution(int n, int[][] computers) {
		int answer = 0;
		return answer;
	}

	// ������ ������ŭ �׷����� �׸���
	// ��ġ�°� ���� �ϱ� ����� ���� �׸��� �ɵ�
	// ��ġ�� ���� ��Ʈ��ũ��� �����ϴϱ�
	// �ʺ�켱 Ž������ ���� �켱 Ž�� ������ �� �𸣰Ծ�
	// ����Լ��� �ؼ� �����տ��� ������ �����ϱ� ���ϸ� �ɰͰ�����
	// �̹����� ������ ���߳�...
	// 10:35~ 11:10�� 40��
	public static void main(String[] args) {
		t43162 aa = new t43162();
		int[][] computers = { { 1, 1, 0 }, { 1, 1, 0 }, { 0, 0, 1 } };
		int n = 3;
		System.out.println(aa.solution(n, computers));
		
	}
}
