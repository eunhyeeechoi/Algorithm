package codility.stackQueue;

import java.util.Stack;
// https://m.blog.naver.com/PostView.nhn?blogId=lsc401&logNo=221338955740&proxyReferer=https:%2F%2Fwww.google.com%2F
public class Fish_2 {
	public int solution(int[] A, int[] B) {
		// write your code in Java SE 8
		int upFish = 0;
		Stack<Integer> downFish = new Stack();

		for (int i = 0; i < A.length; i++) {
			if (B[i] == 0) {
				if (downFish.empty()) { // downFish 가 없으므로 upfish 가 살았다
					upFish++;
				} else {
					while (!downFish.empty()) {
						// downFish 가 있으므로 크기를 비교
						if (downFish.peek() > A[i]) {
							// upFish 가 죽었을때
							break;
						} else {
							downFish.pop(); // downFish 가 죽었다
						}
					}
					if (downFish.empty()) {
						upFish++;
					}
				}
			} else {
				downFish.push(A[i]);
			}
		}
		return upFish + downFish.size();
	}
}
