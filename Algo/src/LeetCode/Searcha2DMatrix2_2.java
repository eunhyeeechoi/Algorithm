package LeetCode;

public class Searcha2DMatrix2_2 {
	// bfs 문제인거가태 ㅋㅋㅋ
	public static void main(String[] args) {
		Searcha2DMatrix2 aa = new Searcha2DMatrix2();
		int[][] matrix = { { 1, 4, 7, 11, 15 }, { 2, 5, 8, 12, 19 }, { 3, 6, 9, 16, 22 }, { 10, 13, 14, 17, 24 },
				{ 18, 21, 23, 26, 30 } };
		int target = 20;
		aa.searchMatrix(matrix, target);
	}
}
