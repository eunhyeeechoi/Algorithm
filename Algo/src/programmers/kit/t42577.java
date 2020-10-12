package programmers.kit;

public class t42577 {
	public boolean solution(String[] phone_book) {
		boolean answer = true;
		String aa = "";
		for (int i = 0; i < phone_book.length; i++) {
			aa = phone_book[i];
			System.out.println("기준값" + aa);
			for (int j = i + 1; j < phone_book.length; j++) {
				System.out.println("비교값" + phone_book[j]);
				if (phone_book[j].contains(aa)) {
					answer = false;
				}
			}
		}

		System.out.println("거꾸로 비교 시작");
		for (int p = phone_book.length; p < 0; p--) {
			aa = phone_book[p];
			System.out.println("기준값" + aa);
			for (int q = p - 1; q < phone_book.length; q--) {
				System.out.println("비교값" + phone_book[q]);
				if (phone_book[q].contains(aa)) {
					answer = false;
				}
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		t42577 tt = new t42577();
//		String[] pb = { "119", "97674223", "1195524421" };
		String[] pb = { "123", "456", "789" };
//		String[] pb = { "12", "123", "1235", "567", "88" };
//		String[] pb = { "1234566", "4567", "908", "2323", "123" };
		boolean aa = tt.solution(pb);
		System.out.println("결과 " + aa);
	}
}
