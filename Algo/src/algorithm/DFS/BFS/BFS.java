package algorithm.DFS.BFS;

import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Stack;

// :: BFS �� ť�� �̿��� ��� Ž��
class Queue2<T> {
	class Node<T> {// ���� Ÿ���� �޴� ��� ����
		private T data;
		private Node<T> next;

		public Node(T data) {
			this.data = data;
		}
	}

	private Node<T> first;
	private Node<T> last;

	public void add(T item) {
		Node<T> t = new Node<T>(item);
		if (last != null) {
			last.next = t;
		}
		last = t;
		if (first == null) {// �����Ͱ� ������
			first = last;// ���������� ����
		}
	}

	public T remove() {
		if (first == null) {
			throw new NoSuchElementException();
		}
		T data = first.data; // ������ ���
		first = first.next; // ������ first �� �������
		if (first == null) {
			last = null;
			// last �� ���� ����
		}
		return data;
	}

	public T peek() {
		if (first == null) {
			throw new NoSuchElementException();
		}
		return first.data;
	}

	public boolean isEmpty() {
		return first == null;
	}

}

class Graph2 { // �׷���Ŭ����
	class Node { // ���
		int data;// ���� ���
		LinkedList<Node> adjacent; // ������ ������ ǥ��
		boolean marked;// �湮�ߴ��� üũ

		Node(int data) { // ����� ������
			// �����͸� �ް� false ����, LinkedList �غ�
			this.data = data;
			this.marked = false;
			adjacent = new LinkedList<Node>();
		}
	}

	Node[] nodes;

	Graph2(int size) {
		nodes = new Node[size]; // ��带 �޾Ƽ� ������ŭ ������ �迭�� ����(������� �迭)
		for (int i = 0; i < size; i++) {
			nodes[i] = new Node(i); // �����Ϳ� �迭���� ��ȣ�� �����ϰ� ����
		}
	}

	void addEdge(int i1, int i2) {// �� ����� ���踦 �����ϴ� �Լ�
		Node n1 = nodes[i1];
		Node n2 = nodes[i2];

		// �ΰ��� ����� ������ ��带 �����ϴ� Linked List �� ������ �ִ��� Ȯ���ϰ�
		// ������ �߰�����
		if (!n1.adjacent.contains(n2)) {
			n1.adjacent.add(n2);
		}
		if (!n2.adjacent.contains(n2)) {
			n2.adjacent.add(n1);
		}
	}

	// BFS
	void bfs() {
		bfs(0);
	}

	void bfs(int index) {
		Node root = nodes[index];// bfs �Լ����� index �� ���� ���ڷ� Node ����
		Queue2<Node> queue = new Queue2<Node>();
		queue.add(root); // ť�� �����͸� �߰�
		root.marked = true;
		while (!queue.isEmpty()) { // ť�� ������������� �ݺ�
			Node r = queue.remove(); // ť���� �����͸� �����ͼ�
			for (Node n : r.adjacent) { // ť���� ���� �ڽĳ����� ��忡 �߰�
				if (n.marked == false) {
					n.marked = true;
					queue.add(n);
				}
			}
			visit(r);
		}

	}

	void visit(Node n) { // �߰��Ȱ� ���
		System.out.print(n.data + " ");
	}
}

public class BFS {
	public static void main(String[] args) {
		Graph2 g = new Graph2(9); // �׷��� ����
		g.addEdge(0, 1);
		g.addEdge(1, 2);
		g.addEdge(1, 3);
		g.addEdge(2, 4);
		g.addEdge(2, 3);
		g.addEdge(3, 4);
		g.addEdge(3, 5);
		g.addEdge(5, 3);
		g.addEdge(5, 6);
		g.addEdge(5, 7);
		g.addEdge(6, 8);
		g.bfs();
	}
}
