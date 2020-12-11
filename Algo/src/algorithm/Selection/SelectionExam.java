package algorithm.Selection;

// 2020.12.07
//���� ���� Selection Sort �迭�� ���鼭 ���� ���� ������ ������ �ϳ��� ���� ���� �ű� ���� ���� ���� ã��, ������
//�����ϱ� �Ǿ� ���� ��ü �ϴ� ������� ���� �տ������� ��ĭ�� �̵��ϸ� �̶��ٴ� ��ü���� �ѹ��� �ݺ��ϱ� ������ 
//�ð����⵵�� O(n2) �̴�.
public class SelectionExam {

	private static void selectionSort(int[] arr) {
		selectionSort(arr, 0);// �迭, ������ �ȵȰ��� ������ġ�� �ѱ�
	}

	private static void selectionSort(int[] arr, int start) {
		// �迭�� �������� ���ڷ� �޾Ƽ� ����
		if (start < arr.length - 1) { // �������� �迭���� �������� ����
			int min_index = start; // ���� ���� ���� �ε����� ������ ����
			for (int i = start; i < arr.length; i++) {
				if (arr[i] < arr[min_index])
					min_index = i;
				// ���� ���������� ������ �״� �ε����� ������ Ž���� ���� ���� ������ �ε��� ��ü
			}
			swap(arr, start, min_index);
			// ���� ���� ���� start index �� ����Ű�� ���� ��ȯ
			selectionSort(arr, start + 1);
			// �������� �ϳ� �������� �ѹ��� ����

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
