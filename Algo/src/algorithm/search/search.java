package algorithm.search;

import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Stack;

// :: BFS 는 큐를 이용해 노드 탐색
class Queue<T> {
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

class Graph { // 그래프클래스
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

	Graph(int size) {
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

	// ::DFS
	void dfs() { // 그냥 호출하면 0 부터 시작
		dfs(0);
	}

	void dfs(int index) { // 시작하는 index 를 받아서 dfs 순의 결과 출력 함수
		Node root = nodes[index]; // 해당인덱스로 노드를 가져오고
		Stack<Node> stack = new Stack<Node>(); // 스택을 하나 생성
		stack.push(root);
		// 현재 노드를 스택에 추가
		root.marked = true;
		// 스택에 들어갓다고 추가

		while (!stack.isEmpty()) { // 스택에 데이터가 없을때까지 반복
			Node r = stack.pop();
			// 스택에서 데이터를 가져오고, 가져온 노드의 자식들을 스택에 추가
			for (Node n : r.adjacent) {// 스택에 추가되지 않는 노드들만 추가
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
		Node root = nodes[index];// bfs 함수에서 index 로 받은 인자로 Node 생성
		Queue<Node> queue = new Queue<Node>();
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

	// :: 재귀호출을 이용한 DFS
	void dfsR(Node r) {
		// 재귀호출때는 LinkedList 가 노드의 주소를 가지고 있기때문에 노드를 받는 형태로 구축
		if (r == null)
			return; // 받은 노드가 null 일때
		r.marked = true; // 호출 마킹
		visit(r); // 데이터 출력
		for (Node n : r.adjacent) {
			if (n.marked == false) {
				dfsR(n);// 호출 되지 않은 자식 호출
			}
		}
	}

	void dfsR(int index) { // 시작노드를 다양하게 테스트 하기위해
		// 배열방에 인덱스를 받는 방식으로 호출
		Node r = nodes[index];
		// index 에 해당하는 노드를 찾아 노드를 시작으로 재귀호출 진행
		dfsR(r);
	}

	void dfsR() {
		dfsR(0); // 아무것도 없을때 0부터 시작
	}

	void visit(Node n) { // 추가된것 출력
		System.out.print(n.data + " ");
	}
}

public class search {
	public static void main(String[] args) {
		Graph g = new Graph(9); // 그래프 생성
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
