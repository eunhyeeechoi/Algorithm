package algorithm.Binary;

class Tree {
	class Node {
		int data;
		Node left;
		Node right;

		// ����� ������ data �� �޾Ƽ� ����
		Node(int data) {
			this.data = data;
		}
	}

	Node root; // Ʈ���� ���۵Ǵ� root ���

	// Ʈ���� ����� ���� �������ִ� �Լ�
	public void makeTree(int[] a) {
		root = makeTreeR(a, 0, a.length - 1);
		// ����Լ��� �ʿ��� �����͸� �����ִ���
		// ���ȣ���� ������ ���� ����� ����� ���� �޾� root �� ����
	}

	private Node makeTreeR(int[] a, int start, int end) {
		// ���� ,�� �ε����� ���� ����Լ�
		if (start > end)
			return null; // ������ ������ ��Ȯ��
		int mid = (start + end) / 2; // �߰����� ã��
		Node node = new Node(a[mid]); // �߰������� ������ ��� ����
		node.left = makeTreeR(a, start, mid - 1);
		node.right = makeTreeR(a, mid + 1, end);
		return node;
	}

	// Ʈ���� �� ����������� �����˻����� Ȯ��
	public void searchBTree(Node n, int find) {
		// ���۳��� ã�� �����͸� �޾Ƽ�
		if (find < n.data) {
			System.out.println("Data is smaller than " + n.data);
			searchBTree(n.left, find); // ã�°��� ���� ��尪���� ������ ���� Ž��
		} else if (find > n.data) {
			System.out.println("Data is bigger than " + n.data);
			searchBTree(n.right, find); // ã�°��� ���� ��庸�� ũ�ϱ� ������ ã�ƾ���
		} else {
			System.out.println("Data found!" + n.data);
		}
	}
}

public class BinaryExam {
	public static void main(String[] args) {
		int[] a = new int[10];
		for (int i = 0; i < a.length; i++) {
			a[i] = i;
		}
		Tree t = new Tree();
		t.makeTree(a);
		t.searchBTree(t.root, 2);
	}
}
