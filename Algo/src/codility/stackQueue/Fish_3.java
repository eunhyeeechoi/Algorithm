package codility.stackQueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Fish_3 {
	class MovingFish {
		int dir;
		int size;

		// 크기 , 방향
		public MovingFish(int size, int dir) {
			this.size = size;
			this.dir = dir;
		}
	}

	public int solution(int[] A, int[] B) {
		Queue<MovingFish> queue = new LinkedList<>();
		Stack<Integer> stack = new Stack<>();
		int cnt = 0;
		for (int i = 0; i < A.length; i++) {
			queue.add(new MovingFish(A[i], B[i])); // 물고기 전부를 큐에 저장 
		}

		while (!queue.isEmpty()) {
			MovingFish fish = queue.peek();
			if (fish.dir == 1)
				stack.add(fish.size); // 하류로가는 물고기만 stack 에 저장
			else if (!stack.isEmpty()) {
				if (stack.peek() < fish.size) { // 하류로 가는 물고기중 가장 위에 있는것과 큐에서 꺼낸 물고기 (상류로 가는애) 비교 
					stack.pop();
					continue;
				}
			} else
				cnt++;
			queue.poll();
		}
		return cnt + queue.size() + stack.size();
	}
}
