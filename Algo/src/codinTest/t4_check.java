package codinTest;

public class t4_check {
	public String solution(String document) {
		String[] doc = document.split(" ");
		int cnt = 0;
		String bb = "";
		for (int i = 0; i < doc.length; i++) {
//			System.out.println("��� ���" + doc[i]);
			// 2. ����ǥ�� ����ǥ�� �����ִ� -> �ϳ��� ����ǥ
			if (doc[i].contains("?") && doc[i].contains("!")) {
//				System.out.println("���� �Ѵ� �ִ°ǵ�" + doc[i]);
				bb += doc[i].replace("?", "").replace("!", "?")+" ";
				System.out.println("�Ѵ��ִ°� ������" + bb);
			} else if (doc[i].indexOf("!") >= 0) {
				// 1. ����ǥ ������ -> �Ѱ��� ����ǥ
				String[] cc = doc[i].split("!");
				String dd = cc[0];
				cnt = cc.length - 1;
				if (cc.length < 2) {
					bb += cc[0] + "!"+" ";
				} else {
					bb += "!" + cc[cnt]+" ";
				}
				System.out.println("��ħ ����" + bb);
			} else if (doc[i].indexOf("?") >= 0) {
				System.out.println("����� ����ǥ�� ������" + doc[i]);
				
			} else {
				System.out.println(doc[i]);
			}

			// 3. �ɰ� String �迭 ��ġ��
		}
		System.out.println("ó�� ������ : " + bb);
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
