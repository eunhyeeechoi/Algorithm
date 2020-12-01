package algorithm.search;

import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Stack;

// :: BFS �� ť�� �̿��� ��� Ž��
class Queue<T> {
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

class Graph { // �׷���Ŭ����
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

	Graph(int size) {
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

	// ::DFS
	void dfs() { // �׳� ȣ���ϸ� 0 ���� ����
		dfs(0);
	}

	void dfs(int index) { // �����ϴ� index �� �޾Ƽ� dfs ���� ��� ��� �Լ�
		Node root = nodes[index]; // �ش��ε����� ��带 ��������
		Stack<Node> stack = new Stack<Node>(); // ������ �ϳ� ����
		stack.push(root);
		// ���� ��带 ���ÿ� �߰�
		root.marked = true;
		// ���ÿ� ���ٰ� �߰�

		while (!stack.isEmpty()) { // ���ÿ� �����Ͱ� ���������� �ݺ�
			Node r = stack.pop();
			// ���ÿ��� �����͸� ��������, ������ ����� �ڽĵ��� ���ÿ� �߰�
			for (Node n : r.adjacent) {// ���ÿ� �߰����� �ʴ� ���鸸 �߰�
				if (n.marked == false) {
					n.marked = true;
					stack.push(n);
				}
			}
			visit(r);
		}
	}

	// BFS
	void bfs() {
		bfs(0);
	}

	void bfs(int index) {
		Node root = nodes[index];// bfs �Լ����� index �� ���� ���ڷ� Node ����
		Queue<Node> queue = new Queue<Node>();
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

	// :: ���ȣ���� �̿��� DFS
	void dfsR(Node r) {
		// ���ȣ�⶧�� LinkedList �� ����� �ּҸ� ������ �ֱ⶧���� ��带 �޴� ���·� ����
		if (r == null)
			return; // ���� ��尡 null �϶�
		r.marked = true; // ȣ�� ��ŷ
		visit(r); // ������ ���
		for (Node n : r.adjacent) {
			if (n.marked == false) {
				dfsR(n);// ȣ�� ���� ���� �ڽ� ȣ��
			}
		}
	}

	void dfsR(int index) { // ���۳�带 �پ��ϰ� �׽�Ʈ �ϱ�����
		// �迭�濡 �ε����� �޴� ������� ȣ��
		Node r = nodes[index];
		// index �� �ش��ϴ� ��带 ã�� ��带 �������� ���ȣ�� ����
		dfsR(r);
	}

	void dfsR() {
		dfsR(0); // �ƹ��͵� ������ 0���� ����
	}

	void visit(Node n) { // �߰��Ȱ� ���
		System.out.print(n.data + " ");
	}
}

public class search {
	public static void main(String[] args) {
		Graph g = new Graph(9); // �׷��� ����
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
