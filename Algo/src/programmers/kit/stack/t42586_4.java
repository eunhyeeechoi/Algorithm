package programmers.kit.stack;

import java.util.LinkedList;
import java.util.Queue;

public class t42586_4 {
	public int[] solution(int[] progresses, int[] speeds) {
		int[] pro = progresses;
		Queue<Integer> result = new LinkedList<>(); // 배포수 저장
		int index = 0, count = 0; // index : 배포 가능 기준 , count : 한번에 꺼낼것 갯수

		while (index < pro.length) { // 작업의 갯수만큼 진행
			for (int i = 0; i < pro.length; i++) { // 하루 진도율 처리
				pro[i] += speeds[i];
			}

			if (pro[index] >= 100) { // index 작업이 배포될 수 있으면
				while (index < pro.length && pro[index] >= 100) {
					// 다른것도 같이 배포 가능한지
					count++;
					index++;
				}
				result.offer(count); // 한번에 배포된 개수 저장
				count = 0; // 다음것을 위해 초기화
			}
		}
		int[] answer = new int[result.size()];
		for (int i = 0; i < answer.length; i++) {
			answer[i] = result.poll();
			System.out.println(answer[i]);
		}
		return answer;
	}

	public static void main(String[] args) {
		int[] progresses = { 93, 30, 55 };
		int[] speeds = { 1, 30, 5 };
		t42586_4 aa = new t42586_4();
		aa.solution(progresses, speeds);
	}
}