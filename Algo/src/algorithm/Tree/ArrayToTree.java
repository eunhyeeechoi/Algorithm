package algorithm.Tree;

class Tree {
//  배열을 이진 검색 트리로 만들기
	// 정렬이 되어있는 배열을 이용하여 이진 검색 트리로 만듦
	class Node {
		int data;
		Node left;
		Node right;

		Node(int data) {
			this.data = data;
			// 생성자에서 데이터를 받아서 노드에 저장
		}
	}

	Node root;

	// 배열정보를 받아서 트리를 만들기 시작
	public void makeTree(int[] a) {
		// 재귀 함수를 호출하기 앞서 재귀호출에 필요한 데이터를 던져줌
		// 재귀호출이 끝나면 꼭대기의 루트값을 받아 저장
		root = makeTreeR(a, 0, a.length - 1);
	}

	// 재귀함수 (시작인덱스, 끝 인덱스)
	public Node makeTreeR(int[] a, int start, int end) {
		if (start > end)
			// 시작점이 끝나는점보다 커지면! null 반환
			return null;
		int mid = (start + end) / 2;
		// 시작지점과 끝지점의 중간값으로 노드를 생성
		Node node = new Node(a[mid]);
		node.left = makeTreeR(a, start, mid - 1);
		// 왼쪽 노드에 처음부터 중간지점까지
		node.right = makeTreeR(a, mid + 1, end);
		// 중간지점것부터 오른쪽 지점것까지
		return node;
	}

	// 트리가 잘 만들어졌는지 확인하는 함수
	public void searchBTree(Node n, int find) {
		if (find < n.data) {
			// 찾아야 하는값이 현재 노드의 값보다 작은지 확인
			System.out.println("Data is smaller than " + n.data);
			searchBTree(n.left, find);
		} else if (find > n.data) {
			// 찾아야 하는 값이 현재 노드의 값보다 큰지 확인
			System.out.println("Data is bigger than " + n.data);
			searchBTree(n.right, find);
		} else {
			System.out.println("Data fond! " + find);
		}
	}
}

public class ArrayToTree {
	public static void main(String[] args) {
		int[] a = new int[10];
		// 테스트를 할 배열을 만듦
		for (int i = 0; i < a.length; i++) {
			a[i] = i;
			// 값 삽입
		}
		Tree t = new Tree();
		// 트리 생성
		t.makeTree(a);
		t.searchBTree(t.root, 2);
		// 확인 (시작위치, 찾을 값)

	}
}