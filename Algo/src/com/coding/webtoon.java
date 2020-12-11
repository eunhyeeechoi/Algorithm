package com.coding;

public class webtoon {
//	A사무실에는 특정일자의 출퇴근 시간이 기록된 거대한 로그파일이 있다고 한다.
//	파일의 형식은 다음과 같다. (한 라인에서 앞부분은 출근시간(HH:MM:SS), 뒷부분은 퇴근시간이다)
//	09:12:23 11:14:35
//	10:34:01 13:23:40
//	10:34:31 11:20:10
//	특정시간을 입력(예:11:05:20)으로 주었을 때 그 시간에 총 몇 명이 사무실에 있었는지 알려주는 함수를 작성하시오.
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

		// String 을 int 로바꿔서 사이에 있으면 count ++;
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
