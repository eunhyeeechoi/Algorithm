package programmers.kit.sort;

import java.util.Arrays;

public class t42748_2 {
	public int[] solution(int[] array, int[][] commands) {
		int[] answer = new int[commands.length];
		for (int i = 0; i < commands.length; i++) {
			// 범위로 copyOfRange 하는 방식
			int[] temp = Arrays.copyOfRange(array, commands[i][0] - 1, commands[i][1]);
			Arrays.sort(temp);
			answer[i] = temp[commands[i][2] - 1];
//            System.out.println(answer[i]);
		}
		return answer;
	}

	public static void main(String[] args) {
		int command[][] = { { 2, 5, 3 }, { 4, 4, 1 }, { 1, 7, 3 } };
		int array[] = { 1, 5, 2, 6, 3, 7, 4 };
		t42748_2 tt = new t42748_2();
		int[] bb = tt.solution(array, command);
//		System.out.println(bb);
	}
}
