package LeetCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

// 리트코드 구현?
// https://leetcode.com/explore/challenge/card/february-leetcoding-challenge-2021/587/week-4-february-22nd-february-28th/3649/
public class LongestWordinDictionarythroughDeleting {
	@SuppressWarnings("null")
	public String findLongestWord(String s, List<String> d) {
		HashMap<String, Integer> eq = null; // 사전안의 문자열 , 일치하는 수
//		int p = 0;
		for (int i = 0; i < d.size() - 1; i++) {
//			p = ;
//			System.out.println("p값" + p);
			System.out.println(d.get(i) + " / " + s);
			System.out.println(s.compareTo(d.get(i)));
			eq.put(d.get(i), s.compareTo(d.get(i)));
			System.out.println("put 했오");
			// hash 말고 일반 클래스가 나을까?
			// 일반클래스로 해서 만들면 객체가 여러개 생기는건가?
			// key에다가 갯수를 넣어야하나? value 끼리 비교도 되겠지?
		}

		// 이제 비교해서 일치하는 수가 가장 큰것을 탐색할거야
		int q;
		String ans = "";
		int r = 0;
		for (int j = 0; j < d.size() - 1; j++) {
			q = eq.get(d.get(0));
			if (q < eq.get(d.get(j))) {
				q = eq.get(d.get(j));
				r = j;
				// 제일 처음꺼로 지정해두고 처음거보다 크면 바꾸고 아니면 그냥 처음꺼 리턴하면 됌
			}
		}
		ans = d.get(r);
//		System.out.println("list 크기" + d.size());
		System.out.println(ans);
		return ans;
	}

	public static void main(String[] args) {
		String s = "abpcplea";
		List<String> d = Arrays.asList("ale", "apple", "monkey", "plea");
		LongestWordinDictionarythroughDeleting aa = new LongestWordinDictionarythroughDeleting();
		aa.findLongestWord(s, d);
	}
}
