package programmers.kit;

public class t42577_2 {
	public boolean solution(String[] phone_book) {
		for (int i = 0; i < phone_book.length - 1; i++) {
			for (int j = i + 1; j < phone_book.length; j++) {
				if (phone_book[i].startsWith(phone_book[j])) {
					return false;
				}
				if (phone_book[j].startsWith(phone_book[i])) {
					return false;
				}
			}
		}
		return true;
	}

	public static void main(String[] args) {
		t42577_2 tt = new t42577_2();
//		String[] pb = { "119", "97674223", "1195524421" };
		String[] pb = { "123", "456", "789" };
//		String[] pb = { "12", "123", "1235", "567", "88" };
//		String[] pb = { "1234566", "4567", "908", "2323", "123" };
		boolean aa = tt.solution(pb);
		System.out.println("°á°ú " + aa);
	}
}
