package LeetCode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

// ��Ʈ�ڵ� ����?
// https://leetcode.com/explore/challenge/card/february-leetcoding-challenge-2021/587/week-4-february-22nd-february-28th/3649/
public class LongestWordinDictionarythroughDeleting {
	@SuppressWarnings("null")
	public String findLongestWord(String s, List<String> d) {
		HashMap<String, Integer> eq = null; // �������� ���ڿ� , ��ġ�ϴ� ��
//		int p = 0;
		for (int i = 0; i < d.size() - 1; i++) {
//			p = ;
//			System.out.println("p��" + p);
			System.out.println(d.get(i) + " / " + s);
			System.out.println(s.compareTo(d.get(i)));
			eq.put(d.get(i), s.compareTo(d.get(i)));
			System.out.println("put �߿�");
			// hash ���� �Ϲ� Ŭ������ ������?
			// �Ϲ�Ŭ������ �ؼ� ����� ��ü�� ������ ����°ǰ�?
			// key���ٰ� ������ �־���ϳ�? value ���� �񱳵� �ǰ���?
		}

		// ���� ���ؼ� ��ġ�ϴ� ���� ���� ū���� Ž���Ұž�
		int q;
		String ans = "";
		int r = 0;
		for (int j = 0; j < d.size() - 1; j++) {
			q = eq.get(d.get(0));
			if (q < eq.get(d.get(j))) {
				q = eq.get(d.get(j));
				r = j;
				// ���� ó������ �����صΰ� ó���ź��� ũ�� �ٲٰ� �ƴϸ� �׳� ó���� �����ϸ� ��
			}
		}
		ans = d.get(r);
//		System.out.println("list ũ��" + d.size());
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
