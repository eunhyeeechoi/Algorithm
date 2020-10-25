package programmers.kit.sort;

public class t42748 {
	public int[] solution(int[] array, int[][] commands) {
		int[] answer = {};
		int[] a = {};
		for (int i = 0; i < commands.length; i++) {
			for (int j = 0; j < commands[i].length; j++) {
				a = new int[commands[i].length];
				a[j] = commands[i][j];
				System.out.print(a[j]);
//				System.out.print(commands[i][j]);
				for (int p = a[0]; p < a[1]; p++) {
//					int[] array2 = array[p];
//					System.out.print("p °ª:" + p);
				}
			}
			System.out.println(".");
//			System.out.println(commands[i][j]);

		}
		for (int q = 0; q < a.length; q++) {
			System.out.println("a °ª: "+a[q]);
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
