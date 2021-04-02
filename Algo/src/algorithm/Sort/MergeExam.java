package algorithm.Sort;

public class MergeExam {
	private static void mergeSort(int[] arr) {
		int[] tmp = new int[arr.length]; // 머지소트는 임시저장소가 필요하니 배열 크기만하게 만들기
		mergeSort(arr, tmp, 0, arr.length - 1);
		// 정렬할 배열, 임시저장소, 시작, 끝 인덱스
	}

	private static void mergeSort(int[] arr, int[] tmp, int start, int end) {
		if (start < end) { // 첫 인덱스가 끝 인덱스보다 작은동안 실행
			int mid = (start + end) / 2; // 반을 나누어 진행
			mergeSort(arr, tmp, start, mid); // 앞에꺼
			mergeSort(arr, tmp, mid + 1, end);// 뒤에꺼
			merge(arr, tmp, start, mid, end);
			// 재귀함수가 돌아왔을땐 반반이 정렬이 되어있는 상태이므로
			// 두개로 나누어져있는 배열방을 병합
		}
	}

	// 두개의 배열을 값에따라 순서에 맞게 병합해주는 함수
	private static void merge(int[] arr, int[] tmp, int start, int mid, int end) {
		// 배열과 정렬된 결과를 반복적으로 저장하는 포인터, 임시저장장소, 시작, 중간 인덱스, 끝인덱스
		for (int i = start; i <= end; i++) {
			tmp[i] = arr[i]; // 임시저장소에 배열을 복사
		}
		int part1 = start;
		int part2 = mid + 1;
		// 두개로 나누어진 배열의 첫번째 값
		int index = start;
		// 결과 배열방에 저장할 위치

		while (part1 <= mid && part2 <= end) {
			// 첫번째 배열방이 끝나거나 마지막 배열방이 끝날때까지 두개의 배열방 비교
			if (tmp[part1] <= tmp[part2]) { // 앞 배열방의 값이 작을때
				arr[index] = tmp[part1];
				part1++;
			} else { // 뒷 배열방의 값이 작을때
				arr[index] = tmp[part2];
				part2++;
			}
			index++; // 어디것을 담앗든 합쳐진 배열의 위치는 증가해야하지
		}
		// 뒤쪽 배열이 비고 앞쪽 배열에 데이터가 남아있는 경우를 대비해
		// 앞쪽 포인터가 최종 배열에 데이터를 저장하도록 돌려줌
		// 뒤쪽 데이터는 정렬된 채로 배열의 뒤쪽에 그대로 남아있기때문에
		// 앞쪽 데이터만 넣어주면 
		for (int i = 0; i <= mid - part1; i++) {
			arr[index + i] = tmp[part1 + i];
		}
	}

	private static void printArray(int[] arr) {
		for (int data : arr) {
			System.out.print(data + ",");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int[] arr = { 3, 9, 4, 7, 5, 0, 1, 6, 8, 2 };
		printArray(arr);
		mergeSort(arr);
		printArray(arr);
	}
}
