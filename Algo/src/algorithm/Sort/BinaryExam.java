package algorithm.Sort;

class Tree {
	class Node {
		int data;
		Node left;
		Node right;

		// 노드의 생성자 data 를 받아서 생성
		Node(int data) {
			this.data = data;
		}
	}

	Node root; // 트리가 시작되는 root 노드

	// 트리를 만드는 일을 시작해주는 함수
	public void makeTree(int[] a) {
		root = makeTreeR(a, 0, a.length - 1);
		// 재귀함수에 필요한 데이터를 던져주는일
		// 재귀호출이 끝나면 가장 꼭대기 노드의 값을 받아 root 에 저장
	}

	private Node makeTreeR(int[] a, int start, int end) {
		// 시작 ,끝 인덱스를 받은 재귀함수
		if (start > end)
			return null; // 끝나는 시점을 정확히
		int mid = (start + end) / 2; // 중간값을 찾고
		Node node = new Node(a[mid]); // 중간지점의 값으로 노드 생성
		node.left = makeTreeR(a, start, mid - 1);
		node.right = makeTreeR(a, mid + 1, end);
		return node;
	}

	// 트리가 잘 만들어졌는지 이진검색으로 확인
	public void searchBTree(Node n, int find) {
		// 시작노드와 찾을 데이터를 받아서
		if (find < n.data) {
			System.out.println("Data is smaller than " + n.data);
			searchBTree(n.left, find); // 찾는값이 현재 노드값보다 작으니 왼쪽 탐색
		} else if (find > n.data) {
			System.out.println("Data is bigger than " + n.data);
			searchBTree(n.right, find); // 찾는값이 현재 노드보다 크니까 오른쪽 찾아야지
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
