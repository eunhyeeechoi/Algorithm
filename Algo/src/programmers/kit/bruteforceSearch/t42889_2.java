package programmers.kit.bruteforceSearch;

import java.util.*;

// :: 프로그래머스 완전탐색 - 소수찾기
// 2020.11.10
// 참조https://steady-coding.tistory.com/70
public class t42889_2 {
	static int answer = 0;
	static Set<Integer> set = new HashSet<>();

	public int solution(String numbers) {

		char[] arr = numbers.toCharArray();
		boolean[] select = new boolean[numbers.length()];
		char[] output = new char[numbers.length()];

		for (int i = 1; i <= numbers.length(); i++) {
			perm(arr, select, output, 0, numbers.length(), i);
		}

		return answer;

		// 2. 모든 조합을 찾고 소수인지 체크 한 후 cnt ++
	}

	public static void perm(char[] arr, boolean[] select, char[] output, int num, int size, int r) {
		if (num == r) {
			if (isPrime(output, r)) {
				answer++;
			}
			return;
		}

		for (int i = 0; i < size; i++) {
			if (select[i]) {
				continue;
			}
			select[i] = true;
			output[num] = arr[i];
			perm(arr, select, output, num + 1, size, r);
			select[i] = false;
		}
	}

	public static boolean isPrime(char[] arr, int size) {
		if (arr[0] == '0') {
			return false;
		}

		String str = "";
		for (int i = 0; i < size; i++) {
			str += arr[i];
		}

		int temp = Integer.parseInt(str);
		if (temp <= 1 || set.contains(temp)) {
			return false;
		}

		for (int i = 2; i * i <= temp; i++) {
			if (temp % i == 0) {
				return false;
			}
		}
		set.add(temp);
		return true;
	}

	public static void main(String[] args) {
		String numbers = "17";
//		String numbers = "011";
		t42889_2 aa = new t42889_2();
		int bb = aa.solution(numbers);
		System.out.println(bb);
	}
}
