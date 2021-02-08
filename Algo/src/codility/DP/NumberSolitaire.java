package codility.DP;

import java.util.Random;
 // 코딜리티 DP - 
public class NumberSolitaire {
	static int r = 0; // 주사위 값 담을것
	static int p = 0; // 주사위 위치
	static int q = 0; // 주사위가 던져진 사각형의 값 --> 리턴할것

	public int solution(int[] A) {
		int l = A.length;
		q = A[p];
		Random ran = new Random();
//		if (p + r <= l) {
//			r = ran.nextInt(5) + 1;// 1~6 주사위 값 생성
//			System.out.println("r 머나옴" + r);
//		}
		while (p + r <= l) {
			r = ran.nextInt(5) + 1;// 1~6 주사위 값 생성
//			System.out.println("r 머나옴" + r);
			p = p + r;
			q += A[p];
//			System.out.println("q 값 :" + q);
			if (r + p == l) {
				break;
			}
		}
//		System.out.println(q);
		return q;

//		if (r + p < l) { // 주사위 나온값 + 조약돌 위치가 배열 길이보다 짧으면 반복
//			p = p + r;
//			q += A[p];
//		} else if (r + p == l) { // 주사위 나온값 + 조약돌 위치 가 배열 길이만큼 되면 끝냄
//			p = p + r;
//			q += A[p];
//			return q;
//		}

	}

	public static void main(String[] args) {
		int[] A = { 1, -2, 0, 9, -1, -2 };
		NumberSolitaire aa = new NumberSolitaire();
		aa.solution(A);
//		System.out.println(aa);
	}
}
