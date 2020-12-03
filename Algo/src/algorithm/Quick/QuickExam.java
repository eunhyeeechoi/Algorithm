package algorithm.Quick;

// :: 퀵소트 구현

public class QuickExam {
	private static void quickSort(int[] arr) {
		quickSort(arr, 0, arr.length - 1);
		// 정렬할 배열의 시작위치와 끝 위치를 인자로 받자
	}

	private static void quickSort(int[] arr, int start, int end) {
		int part2 = partition(arr, start, end); // 해당 배열방의 시작, 끝 나누고
		if (start < part2 - 1) {// 오른쪽 방 첫값을 가지고와서 비교하는데 값의 차이가 1이상일때
			quickSort(arr, start, part2 - 1); // 왼쪽 파티션.
		}
		if (part2 < end) { // 오른쪽 파티션의 시작점이 맨끝것보다 작을때
			quickSort(arr, part2, end); // 오른쪽 파티션.
		}
	}

	private static int partition(int[] arr, int start, int end) {
		// 파티션을 나누는 메소드 정의 - 배열방의 주소, 파티션 첫값, 마지막값을 인자로 나눔
		int pivot = arr[(start + end) / 2]; // pivot 값은 파티션의 첫값과 끝값의 중간으로 지정
		while (start <= end) { // 시작점이 끝 지점보다 작거나 같을때만 포인터를 앞으로 하나씩 앞으로 옮김
			while (arr[start] < pivot) // pivot 값이 start 보다 크면 계속 뒤로 움직임
				start++;
			while (arr[end] > pivot) // 맨 끝에서부터 pivot 값보다 end 값이 클때 계속 앞으로 움직임
				end--;
			if (start <= end) { // 시작점과 끝점이 서로 지나치치 않았는지 확인 후
				swap(arr, start, end); // 값 교환
				start++;
				end--;
			}
		}
		System.out.println(start);
		return start;
		// 두개의 값이 결국 만나서 지나칠때까지 진행한 후
		// start 포인터에 새로 나눌 파티션의 오른쪽 첫번째 인덱스가 들어감
	}

	private static void swap(int[] arr, int start, int end) {
		int tmp = arr[start];
		arr[start] = arr[end];
		arr[end] = tmp;
	}

	// 배열 값 출력
	private static void printArray(int[] arr) {
		for (int data : arr) {
			System.out.print(data + " , ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int[] arr = { 3, 9, 4, 7, 5, 0, 1, 6, 8, 2 };
		printArray(arr);
		quickSort(arr);
		printArray(arr);
	}

}
