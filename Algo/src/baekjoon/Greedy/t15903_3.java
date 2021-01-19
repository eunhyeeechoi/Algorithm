package baekjoon.Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

// 백준 15903 카드 합체 놀이
// https://skwzz.tistory.com/49
// 우선순위 큐를 이용한 문제풀이
public class t15903_3 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int cardCnt = Integer.parseInt(st.nextToken());
		int loopCnt = Integer.parseInt(st.nextToken());

		PriorityQueue<Long> pq = new PriorityQueue<Long>();
		st = new StringTokenizer(br.readLine());

		for (int i = 0; i < cardCnt; i++) {
			pq.add(Long.parseLong(st.nextToken()));
		}

		while (loopCnt > 0) {
			long temp = pq.poll();
			temp += pq.poll();

			pq.add(temp);
			pq.add(temp);
			loopCnt--;
		}

		long sum = 0;
		while (!pq.isEmpty()) {
			sum += pq.poll();
		}
		System.out.println(sum);
	}
}
