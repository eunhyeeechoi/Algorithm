package algorithm.Bubble;
// :: 2020.12.07
// ���������� �տ������� �� ���� �ٷ� �ڱ� ���� �ִ� �迭���� ���Ͽ� �������� ������ ū���� �ڷ� ��ġ�ϸ� �迭�� ������ �ݺ��Ͽ� ������
// �ϴ� ���.
// �տ������� �� ���� �ڷ� ���鼭 ���� ����. �ѹ� �������� n-1 ��ŭ ����
// �ð����⵵ O(n2)
public class BubbleExam {
	private static void bubbleSort(int[] arr) {
		bubbleSort(arr, arr.length - 1);
		// �迭�� �ּҿ� �迭���� ������ �ȵ� �κ��� ������ �ε����� �ѱ�
	}


	private static void bubbleSort(int[] arr, int last) {
		if (last > 0) { // ������ �ε����� 0���� Ŭ������ ����
			for (int i = 1; i <= last; i++) { // 1������ �����ؾ��ϴ� �κ��� ���������� ����
				if (arr[i - 1] > arr[i]) { // �� �տ� �ִ� �迭���� ���ǰͺ��� ū�� Ȯ��
					swap(arr, i - 1, i);
				}
			}
			bubbleSort(arr, last - 1); // �� �ں��� ������ �ǹǷ� last-1
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
