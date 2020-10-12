package programmers.kit;

import java.util.Arrays;

public class t42577_3 {
	public boolean solution(String[] phone_book) {
		boolean answer = true; // sort 를 하구나서!
		Arrays.sort(phone_book);
		for (int i = 0; i < phone_book.length - 1; i++) {
			if (phone_book[i + 1].contains(phone_book[i])) {
				answer = false;
				break;
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		t42577_3 tt = new t42577_3();
//		String[] pb = { "119", "97674223", "1195524421" };
		String[] pb = { "123", "456", "789" };
//		String[] pb = { "12", "123", "1235", "567", "88" };
//		String[] pb = { "1234566", "4567", "908", "2323", "123" };
		boolean aa = tt.solution(pb);
		System.out.println("결과 " + aa);
	}
}
