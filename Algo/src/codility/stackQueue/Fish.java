package codility.stackQueue;
// 코딜리티 - stack and queue - Fish

// https://app.codility.com/c/run/trainingJK6VT6-FGP/
//방향과 크기를 비교하여 연산
// 첫번째 불고기부터 스택에 담아서 방향을 비교하고 다르면 크기도 비교해서 넣을까?
// 1) 처음부터 이동하며 비교
// 1.크기가 원래 담겨있던게 더 크면 pop 하고 아니면 비교한 배열을 지워?
// 2. 옆에 있는거랑 비교하면 되지않으까?
// 2) 아니면 전체를 스택에 담아둬?

import java.util.LinkedList;
import java.util.Queue;

public class Fish {
	static int cnt; // 남은 마리수

	public int solution(int[] A, int[] B) {
		Queue<Fis> q = new LinkedList<Fis>();
		for (int i = 0; i < A.length; i++) {
//			if (A[i] < A[i + 1] && B[i] != B[i]) {
			q.offer(new Fis(A[i + 1], B[i + 1]));
			// 1. 일단 전부다 넣고
			// 2. 비교해서 지워가는게 좋을까?

//			}
		}
		return 1;
	}

	public static class Fis {
		int x; // 크기
		int y; // 방향
//		int cnt; // 남은 마리수

		public Fis(int x, int y) { // 생성자
			this.x = x;
			this.y = y;
//			this.cnt = cnt;

		}
	}

	public static void main(String[] args) {
		int[] A = { 4, 3, 2, 1, 5 }; // 크기
		int[] B = { 0, 1, 0, 0, 0 }; // 방향
		Fish ss = new Fish();
		ss.solution(A, B);
	}
}
