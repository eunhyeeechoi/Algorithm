package programmers.kit;

//���α׷��ӽ� �ֽİ���
public class t42584 {
	public int[] solution(int[] prices) {
		int[] answer = new int[prices.length];
		int ret = 0;
		for (int i = 0; i < prices.length; i++) {

			for (int j = i + 1; j < prices.length; j++) {
				ret++;
				if (prices[i] > prices[j]) {
					break;
				}
			}

			answer[i] = ret;

			ret = 0;
		}
		return answer;
	}

	public static void main(String[] args) {
		t42584 aa = new t42584();
		int[] prices = { 1, 2, 3, 2, 3 };
		int[] bb = aa.solution(prices);
		for (int cc : bb) {
			System.out.println(cc);
		}

	}
}
