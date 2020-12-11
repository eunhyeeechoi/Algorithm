package algorithm.Selection;

// 2020.12.07
//선택 정렬 Selection Sort 배열을 돌면서 가장 작은 값부터 앞으로 하나씩 차곡 차곡 옮김 가장 작은 값을 찾고, 변수에
//저장하구 맨앞 값과 교체 하는 방식으로 진행 앞에서부터 한칸씩 이동하며 이때바다 전체방을 한번씩 반복하기 때문에 
//시간복잡도가 O(n2) 이다.
public class SelectionExam {

	private static void selectionSort(int[] arr) {
		selectionSort(arr, 0);// 배열, 정렬이 안된곳의 시작위치를 넘김
	}

	private static void selectionSort(int[] arr, int start) {
		// 배열과 시작점을 인자로 받아서 진행
		if (start < arr.length - 1) { // 시작점이 배열보다 작을동안 진행
			int min_index = start; // 가장 작은 방의 인덱스를 저장할 변수
			for (int i = start; i < arr.length; i++) {
				if (arr[i] < arr[min_index])
					min_index = i;
				// 가장 작은값으로 지정해 뒀던 인덱스의 값보다 탐색한 방의 값이 작을때 인덱스 교체
			}
			swap(arr, start, min_index);
			// 가장 작은 값과 start index 가 가리키는 값을 교환
			selectionSort(arr, start + 1);
			// 시작점을 하나 증가시켜 한번더 진행

		}
	}

	private static void swap(int[] arr, int index1, int index2) {
		int tmp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = tmp;
	}

	private static void printArray(int[] arr) {
		for (int data : arr) {
			System.out.print(data + ",");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int[] arr = { 3, 6, 1, 8, 2, 4 };
		printArray(arr);
		selectionSort(arr);
		printArray(arr);
	}
}
