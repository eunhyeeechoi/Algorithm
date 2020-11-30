package programmers.kit.dp;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

//:: 프로그래머스 DP - N 으로 표현
// :: 2020.11.30 DP 사용한 방법
//https://dheldh77.tistory.com/entry/%ED%94%84%EB%A1%9C%EA%B7%B8%EB%9E%98%EB%A8%B8%EC%8A%A4-N%EC%9C%BC%EB%A1%9C-%ED%91%9C%ED%98%84
public class t42895 {
	public static int solution(int n, int num) {
		int ans = 0;
		ArrayList<HashSet<Integer>> list = new ArrayList<>();
		HashSet<Integer> set = new HashSet<>();
		set.add(n);
		list.add(set);

		while (ans < 8) {
			if (list.get(ans).contains(num))
				break;
			ans++;

			HashSet<Integer> nset = new HashSet<>();
			String s = "";
			for (int i = 0; i < ans + 1; i++)
				s += String.valueOf(n);
			nset.add(Integer.parseInt(s));

			for (int i = 0; i <= ans / 2; i++) {
				for (int j = 0; i + j < ans; j++) {
					for (Iterator it1 = list.get(i).iterator(); it1.hasNext();) {
						int op1 = (int) it1.next();
						for (Iterator it2 = list.get(j).iterator(); it2.hasNext();) {
							int op2 = (int) it2.next();
							nset.add(op1 + op2);
							nset.add(op1 - op2);
							nset.add(op1 * op2);
							if (op2 != 0)
								nset.add(op1 / op2);
						}
					}
				}
			}
			list.add(nset);
		}

		return (ans >= 8) ? -1 : ans + 1;
	}

	public static void main(String[] args) {
		int n = 5;
		int num = 12;
		int n2 = 9;
		int num2 = 32490;

		System.out.println(solution(n, num));
	}
}
