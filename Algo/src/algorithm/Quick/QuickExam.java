package algorithm.Quick;

// :: ����Ʈ ����

public class QuickExam {
	private static void quickSort(int[] arr) {
		quickSort(arr, 0, arr.length - 1);
		// ������ �迭�� ������ġ�� �� ��ġ�� ���ڷ� ����
	}

	private static void quickSort(int[] arr, int start, int end) {
		int part2 = partition(arr, start, end); // �ش� �迭���� ����, �� ������
		if (start < part2 - 1) {// ������ �� ù���� ������ͼ� ���ϴµ� ���� ���̰� 1�̻��϶�
			quickSort(arr, start, part2 - 1); // ���� ��Ƽ��.
		}
		if (part2 < end) { // ������ ��Ƽ���� �������� �ǳ��ͺ��� ������
			quickSort(arr, part2, end); // ������ ��Ƽ��.
		}
	}

	private static int partition(int[] arr, int start, int end) {
		// ��Ƽ���� ������ �޼ҵ� ���� - �迭���� �ּ�, ��Ƽ�� ù��, ���������� ���ڷ� ����
		int pivot = arr[(start + end) / 2]; // pivot ���� ��Ƽ���� ù���� ������ �߰����� ����
		while (start <= end) { // �������� �� �������� �۰ų� �������� �����͸� ������ �ϳ��� ������ �ű�
			while (arr[start] < pivot) // pivot ���� start ���� ũ�� ��� �ڷ� ������
				start++;
			while (arr[end] > pivot) // �� ���������� pivot ������ end ���� Ŭ�� ��� ������ ������
				end--;
			if (start <= end) { // �������� ������ ���� ����ġġ �ʾҴ��� Ȯ�� ��
				swap(arr, start, end); // �� ��ȯ
				start++;
				end--;
			}
		}
		System.out.println(start);
		return start;
		// �ΰ��� ���� �ᱹ ������ ����ĥ������ ������ ��
		// start �����Ϳ� ���� ���� ��Ƽ���� ������ ù��° �ε����� ��
	}

	private static void swap(int[] arr, int start, int end) {
		int tmp = arr[start];
		arr[start] = arr[end];
		arr[end] = tmp;
	}

	// �迭 �� ���
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
