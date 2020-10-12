package programmers.kit;

public class t42584_2 {
	public int[] solution(int[] prices) {
		int[] answer = new int[prices.length];
		int an = 0;
		int ret = 0;
		for (int i = 0; i < prices.length; i++) {
			an = prices[i];
			for (int j = i + 1; j < prices.length; j++) {
				// System.out.println(prices[j]);
				if (an <= prices[j]) {
					System.out.println(an + " / " + prices[j]);
					ret = prices.length - (i + 1);
				}
				System.out.println(ret);
				answer[i] = ret;
			}
		}
		return answer;
	}
}
