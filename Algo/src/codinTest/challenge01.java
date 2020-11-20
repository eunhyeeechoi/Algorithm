package codinTest;

public class challenge01 {
	public int solution(int n, int[] v) {
		int answer = 0;
		int left = 0; // 왼쪽합
		int right = 0; // 오른쪽합
		int q[] = new int[v.length];

		// 먼저 왼쪽, 오른쪽의 합을 구할까
		for (int i = 0; i < v.length; i++) {
			for (int j = 0; j <= i; j++) {
				left += v[j];
			}
			for (int p = i + 1; p < v.length; p++) {
				right += v[p];
			}

			// 두값의 차를 배열에 삽입
			if (right > left) {
				q[i] = right - left;
			} else if (right < left) {
				q[i] = left - right;
			} else if (right - left == 0) {
				// 이미 차이가 0인경우 바로 리턴
				answer = i + 1;
			}
			left = 0;
			right = 0;
		}
		int min = 0;
		int j = 0;
		// 배열 내 최소값을 구해 위치 리턴
		for (int z = 0; z < q.length; z++) {
			if (q[z] < q[min]) {
				min = z;
				j = z;
//				System.out.println("최소값은 " + min + " 자리는" + (j + 1));
				answer = j + 1;
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		int n = 5;
		int[] v = { 1, 2, 1, 2, 1 };
//		int n = 7;
//		int[] v = { 3, 2, 3, 4, -1, -2, -3 };

//		 왼쪽것이 0개일때 오른쪽배열의 합이 0인경우
//		int n = 4;
//		int[] v = { -2, -2, 3, 1 };
		challenge01 aa = new challenge01();
		int qq = aa.solution(n, v);
		System.out.println("최소값을 가지는 왼쪽 배열의 갯수 " + qq);
	}
}
