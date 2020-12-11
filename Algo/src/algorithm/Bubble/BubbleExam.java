package algorithm.Bubble;
// :: 2020.12.07
// 버블정렬은 앞에서부터 두 개씩 바로 자기 옆에 있는 배열값과 비교하여 작은값을 앞으로 큰값을 뒤로 배치하며 배열의 끝까지 반복하여 정렬을
// 하는 방법.
// 앞에서부터 한 개씩 뒤로 가면서 정렬 진행. 한번 돌때마다 n-1 만큼 진행
// 시간복잡도 O(n2)
public class BubbleExam {
	private static void bubbleSort(int[] arr) {
		bubbleSort(arr, arr.length - 1);
		// 배열의 주소와 배열에서 정렬이 안된 부분의 마지막 인덱스를 넘김
	}


	private static void bubbleSort(int[] arr, int last) {
		if (last > 0) { // 마지막 인덱스가 0보다 클때까지 진행
			for (int i = 1; i <= last; i++) { // 1번부터 정렬해야하는 부분의 마지막까지 진행
				if (arr[i - 1] > arr[i]) { // 내 앞에 있는 배열값이 뒤의것보다 큰지 확인
					swap(arr, i - 1, i);
				}
			}
			bubbleSort(arr, last - 1); // 맨 뒤부터 정렬이 되므로 last-1
		}

	}

	private static void swap(int[] arr, int source, int target) {
		int tmp = arr[source];
		arr[source] = arr[target];
		arr[target] = tmp;

	}

	private static void printArray(int[] arr) {
		for (int data : arr) {
			System.out.print(data + ",");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int[] arr = { 3, 5, 4, 2, 1 };
		printArray(arr);
		bubbleSort(arr);
		printArray(arr);

	}
}
