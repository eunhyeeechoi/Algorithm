package programmers.kit.sort;

import java.util.Arrays;

public class t42748 {
	public int[] solution(int[] array, int[][] commands) {
		int[] answer = new int[commands.length];
		int[] a = {};
		int[] b = {};
		int index = 0;
		for (int i = 0; i < commands.length; i++) {
			a = new int[commands[i].length];
			for (int j = 0; j < commands[i].length; j++) {
				a[j] = commands[i][j];
				// 2차원 배열을 1차원 배열로 분리 해서 새로운 배열 생성
			}
			int c = 0;
			b = new int[a[1] - a[0] + 1];
			for (int p = a[0] - 1; p < a[1]; p++) {
//				System.out.print(array[p]);
				b[c++] = array[p];
//				System.out.print("b값 : " + b[p]);
			}
			Arrays.sort(b);
//			System.out.println(b[1]);
//			System.out.println(a[2] - 1 + "/ " + b[a[2] - 1]);
			answer[index++] = b[a[2] - 1];
		}
		return answer;
	}

	public static void main(String[] args) {
		int command[][] = { { 2, 5, 3 }, { 4, 4, 1 }, { 1, 7, 3 } };
		int array[] = { 1, 5, 2, 6, 3, 7, 4 };
		t42748 tt = new t42748();
		int[] bb = tt.solution(array, command);
//		System.out.println(bb);
	}
}
