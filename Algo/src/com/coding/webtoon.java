package com.coding;

public class webtoon {
//	A�繫�ǿ��� Ư�������� ����� �ð��� ��ϵ� �Ŵ��� �α������� �ִٰ� �Ѵ�.
//	������ ������ ������ ����. (�� ���ο��� �պκ��� ��ٽð�(HH:MM:SS), �޺κ��� ��ٽð��̴�)
//	09:12:23 11:14:35
//	10:34:01 13:23:40
//	10:34:31 11:20:10
//	Ư���ð��� �Է�(��:11:05:20)���� �־��� �� �� �ð��� �� �� ���� �繫�ǿ� �־����� �˷��ִ� �Լ��� �ۼ��Ͻÿ�.
	public int sol(String[] data, String target) {
		int ans = 0;
		int tar = Integer.parseInt(target);
		int cnt = 0;
//		String[] aa = data.split(" ");
		for (int i = 0; i < data.length; i++) {
			String[] data2 = data[i].split(" ");
			String chul = data2[0];
			String thoe = data2[1];
			int chul2 = Integer.parseInt(chul);
			int thoe2 = Integer.parseInt(thoe);
			if (chul2 < tar && tar < thoe2) {
				cnt++;
			}
			ans = cnt;
		}

		// String �� int �ιٲ㼭 ���̿� ������ count ++;
		return ans;
	}

	public static void main(String[] args) {
		webtoon aa = new webtoon();
//		String data = "09:12:23 11:14:35";
		String[] data = { "09:12:23 11:14:35", "10:34:01 13:23:40" };
		String target = "11:05:20";
		aa.sol(data, target);
	}
}
