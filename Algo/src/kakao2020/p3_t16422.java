package kakao2020;

public class p3_t16422 {
	public int[] solution(String[] info, String[] query) {
		int[] answer = new int[info.length];
		for (int i = 0; i < info.length; i++) {
//			System.out.println(info[i]);
			String[] pp = info[i].split(" ");
			String[] qq = query[i].split("and");
			for (int j = 0; j < pp.length; j++) {
				System.out.println("infos - " + pp[j]);
				System.out.println("querys - " + qq[j]);
				System.out.println("====================");
			}
			System.out.println("====================");
			System.out.println(query[i]);
		}

		return answer;
	}

	public static void main(String[] args) {
		p3_t16422 aa = new p3_t16422();
		String[] info = { "java backend junior pizza 150", "python frontend senior chicken 210",
				"python frontend senior chicken 150", "cpp backend senior pizza 260", "java backend junior chicken 80",
				"python backend senior chicken 50" };

		String[] query = { "java and backend and junior and pizza 100",
				"python and frontend and senior and chicken 200", "cpp and - and senior and pizza 250",
				"- and backend and senior and - 150", "- and - and - and chicken 100", "- and - and - and - 150" };
		aa.solution(info, query);
	}
}
