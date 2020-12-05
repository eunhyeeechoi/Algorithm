package algorithm.Merge;

public class MergeExam {
	private static void mergeSort(int[] arr) {
		int[] tmp = new int[arr.length]; // ������Ʈ�� �ӽ�����Ұ� �ʿ��ϴ� �迭 ũ�⸸�ϰ� �����
		mergeSort(arr, tmp, 0, arr.length - 1);
		// ������ �迭, �ӽ������, ����, �� �ε���
	}

	private static void mergeSort(int[] arr, int[] tmp, int start, int end) {
		if (start < end) { // ù �ε����� �� �ε������� �������� ����
			int mid = (start + end) / 2; // ���� ������ ����
			mergeSort(arr, tmp, start, mid); // �տ���
			mergeSort(arr, tmp, mid + 1, end);// �ڿ���
			merge(arr, tmp, start, mid, end);
			// ����Լ��� ���ƿ����� �ݹ��� ������ �Ǿ��ִ� �����̹Ƿ�
			// �ΰ��� ���������ִ� �迭���� ����
		}
	}

	// �ΰ��� �迭�� �������� ������ �°� �������ִ� �Լ�
	private static void merge(int[] arr, int[] tmp, int start, int mid, int end) {
		// �迭�� ���ĵ� ����� �ݺ������� �����ϴ� ������, �ӽ��������, ����, �߰� �ε���, ���ε���
		for (int i = start; i <= end; i++) {
			tmp[i] = arr[i]; // �ӽ�����ҿ� �迭�� ����
		}
		int part1 = start;
		int part2 = mid + 1;
		// �ΰ��� �������� �迭�� ù��° ��
		int index = start;
		// ��� �迭�濡 ������ ��ġ

		while (part1 <= mid && part2 <= end) {
			// ù��° �迭���� �����ų� ������ �迭���� ���������� �ΰ��� �迭�� ��
			if (tmp[part1] <= tmp[part2]) { // �� �迭���� ���� ������
				arr[index] = tmp[part1];
				part1++;
			} else { // �� �迭���� ���� ������
				arr[index] = tmp[part2];
				part2++;
			}
			index++; // ������ ��ѵ� ������ �迭�� ��ġ�� �����ؾ�����
		}
		// ���� �迭�� ��� ���� �迭�� �����Ͱ� �����ִ� ��츦 �����
		// ���� �����Ͱ� ���� �迭�� �����͸� �����ϵ��� ������
		// ���� �����ʹ� ���ĵ� ä�� �迭�� ���ʿ� �״�� �����ֱ⶧����
		// ���� �����͸� �־��ָ� ��
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
