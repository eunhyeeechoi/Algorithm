package algorithm.DFS.BFS;

import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Stack;

// :: BFS 는 큐를 이용해 노드 탐색
class Queue2<T> {
	class Node<T> {// 같은 타입을 받는 노드 선언
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
		if (first == null) {// 데이터가 없을때
			first = last;// 같은것으로 지정
		}
	}

	public T remove() {
		if (first == null) {
			throw new NoSuchElementException();
		}
		T data = first.data; // 데이터 백업
		first = first.next; // 다음것 first 로 만들어줌
		if (first == null) {
			last = null;
			// last 도 같이 변경
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

class Graph2 { // 그래프클래스
	class Node { // 노드
		int data;// 정수 사용
		LinkedList<Node> adjacent; // 인접한 데이터 표현
		boolean marked;// 방문했는지 체크

		Node(int data) { // 노드의 생성자
			// 데이터를 받고 false 지정, LinkedList 준비
			this.data = data;
			this.marked = false;
			adjacent = new LinkedList<Node>();
		}
	}

	Node[] nodes;

	Graph2(int size) {
		nodes = new Node[size]; // 노드를 받아서 갯수만큼 저장할 배열방 구현(노드저장 배열)
		for (int i = 0; i < size; i++) {
			nodes[i] = new Node(i); // 데이터와 배열방의 번호를 동일하게 만듦
		}
	}

	void addEdge(int i1, int i2) {// 두 노드의 관계를 저장하는 함수
		Node n1 = nodes[i1];
		Node n2 = nodes[i2];

		// 두개의 노드의 인접한 노드를 저장하는 Linked List 에 상대방이 있는지 확인하고
		// 없으면 추가해줌
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
		Node root = nodes[index];// bfs 함수에서 index 로 받은 인자로 Node 생성
		Queue2<Node> queue = new Queue2<Node>();
		queue.add(root); // 큐에 데이터를 추가
		root.marked = true;
		while (!queue.isEmpty()) { // 큐가 비어있을때까지 반복
			Node r = queue.remove(); // 큐에서 데이터를 가져와서
			for (Node n : r.adjacent) { // 큐에서 꺼낸 자식노드들을 노드에 추가
				if (n.marked == false) {
					n.marked = true;
					queue.add(n);
				}
			}
			visit(r);
		}

	}

	void visit(Node n) { // 추가된것 출력
		System.out.print(n.data + " ");
	}
}

public class BFS {
	public static void main(String[] args) {
		Graph2 g = new Graph2(9); // 그래프 생성
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
