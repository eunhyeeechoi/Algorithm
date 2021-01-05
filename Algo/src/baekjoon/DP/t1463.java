package baekjoon.DP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// baekjoon Dynamic programming
// 1로만들기
public class t1463 {
	int cnt = 0;

	public int sol(int n) {

//		System.out.println("출력" + n);
		if (n % 3 == 0) {
			// 3으로 나누어 떨어지는지 확인
			if (n == 1) {
				// n이 1이면 리턴
				return cnt;
			} else {
				n = n / 3;
				sol(n);
				cnt++;
			}
		} else if (n % 2 == 0) {
			// 2로 나누어 떨어지는지 확인
			if (n == 1) {
				return cnt;
			} else {
//				System.out.println("지금 여기타지?");
				n = n / 2;
				sol(n);
				cnt++;
			}
		} else {
			n = n - 1;
			cnt++;
			if (n == 1) {
				return cnt;
			} else {
				sol(n);
			}
//			System.out.println("지금 여기타지?");
		}
		System.out.println("cnt 값 " + cnt);
		return cnt;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String p = bf.readLine();
		new t1463().sol(Integer.parseInt(p));
		bf.close();
	}
}
