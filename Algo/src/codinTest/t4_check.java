package codinTest;

public class t4_check {
	public String solution(String document) {
		String[] doc = document.split(" ");
		int cnt = 0;
		String bb = "";
		for (int i = 0; i < doc.length; i++) {
//			System.out.println("모두 출력" + doc[i]);
			// 2. 느낌표와 물음표가 섞여있다 -> 하나의 물음표
			if (doc[i].contains("?") && doc[i].contains("!")) {
//				System.out.println("여긴 둘다 있는건데" + doc[i]);
				bb += doc[i].replace("?", "").replace("!", "?")+" ";
				System.out.println("둘다있는거 제거후" + bb);
			} else if (doc[i].indexOf("!") >= 0) {
				// 1. 느낌표 여러개 -> 한개의 느낌표
				String[] cc = doc[i].split("!");
				String dd = cc[0];
				cnt = cc.length - 1;
				if (cc.length < 2) {
					bb += cc[0] + "!"+" ";
				} else {
					bb += "!" + cc[cnt]+" ";
				}
				System.out.println("고침 ㅎㅎ" + bb);
			} else if (doc[i].indexOf("?") >= 0) {
				System.out.println("여기는 물음표가 여러개" + doc[i]);
				
			} else {
				System.out.println(doc[i]);
			}

			// 3. 쪼갠 String 배열 합치기
		}
		System.out.println("처리 끝난거 : " + bb);
		return bb;
	}

	public static void main(String[] args) {
//		String document = "a??a ?!a a!?b b!?!C C?!!D D?!?EE ??? FF!!! !???!";
		String document2 = "a??a ?!a a!?b b!?!C C?!!D D?!?EE ??? FF!!! !???! !!!AA";
		t4_check aa = new t4_check();
		String bb = aa.solution(document2);
//		System.out.println(bb);
	}
}
