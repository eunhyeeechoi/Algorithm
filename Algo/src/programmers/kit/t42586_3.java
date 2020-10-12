package programmers.kit;

import java.util.LinkedList;
import java.util.Queue;

//프로그래머스 기능 개발 - 은혜 풀이
public class t42586_3 {
	public static int[] solution(int[] progresses, int[] speeds) {
		int[] pro = progresses; // 복사본
		Queue<Integer> result = new LinkedList<>(); // 배포 수 저장
		int index = 0, count = 0; // index: 배포할 수 있는 기준, count: 한 번에 배포되는 수

		while (index < pro.length) { // 작업의 갯수만큼 실행
			for (int i = 0; i < pro.length; i++) // 하루 진도율 처리
				pro[i] += speeds[i];

			if (pro[index] >= 100) { // index 작업이 배포될 수 있으면
				while (index < pro.length && pro[index] >= 100) { // 다른 것도 같이 배포될 수 있는지
					count++;
					index++;
				}

				result.offer(count); // 한 번에 배포된 개수 저장
				count = 0;
			}
		}

		int[] answer = new int[result.size()];
		for (int i = 0; i < answer.length; i++)
			answer[i] = result.poll();

		return answer;
	}

	public static void main(String[] args) {
		t42586_3 aa = new t42586_3();
		int[] progresses = { 93, 30, 55 };
		int[] speeds = { 1, 3, 5 };
		int[] bb = aa.solution(progresses, speeds);
		for (int ans : bb) {
			System.out.println("결과 :" + ans);
		}
	}
}
