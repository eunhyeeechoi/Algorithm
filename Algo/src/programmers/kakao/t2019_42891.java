package programmers.kakao;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

//무지의 먹방 라이브
public class t2019_42891 {
	public int solution(int[] food_times, long k) {
		LinkedList<Food> list = new LinkedList<Food>();
		int n = food_times.length;

		for (int i = 0; i < n; i++)
			list.add(new Food(i + 1, food_times[i]));

		Collections.sort(list, new Comparator<Food>() {
			public int compare(Food f0, Food f1) {
				return Integer.compare(f0.amount, f1.amount);
			}
		});

		int time = 0;
		int index = 0;

		for (Food f : list) {
			long diff = f.amount - time;
			if (diff != 0) {
				long spend = diff * n;
				if (spend <= k) {
					k -= spend;
					time = f.amount;
				} else {
					k %= n;
					list.subList(index, food_times.length).sort(new Comparator<Food>() {
						public int compare(Food o1, Food o2) {
							return o1.number - o2.number;
						}
					});

					return list.get(index + (int) k).number;
				}
			}
			index++;
			n--;
		}

		return -1;
	}

	class Food {
		int number, amount;

		Food(int number, int amount) {
			this.number = number;
			this.amount = amount;
		}
	}
}
