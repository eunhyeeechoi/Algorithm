package algorithm.LinkedList;

// 단방향 LinkedList 구현
class Node {
	// Node 클래스 정의
	int data;
	Node next = null;

	// 생성자
	Node(int d) {
		this.data = d;
	}

	void append(int d) {
		// 맨마지막에 노드 삽입
		Node end = new Node(d);
		Node n = this; // 포인터 생성
		while (n.next != null) {
			n = n.next;
		}
		// n에 마지막 노드 값이 선택됨
		n.next = end; // 새로 생성한 친구가 맨 마지막 노드가됌
	}

	void delete(int d) {
		// 마지막 노드를 지우는 함수
		Node n = this;
		while (n.next != null) {
			if (n.next.data == d) {
				// 다음 노드에 d 가 들어있다면 삭제
				n.next = n.next.next;
				// 그 다음 노드의 값을 가져와서 그 다음 노드는 사라짐
			} else {
				n = n.next;
			}
		}
	}
	// 첫번째 노드는 비교를 안함
	// 헤더는 값을 가진 노드이기 이전에 이 링크드 리스를 대표하는 첫번째 노드이기 때문에
	// 지웠을때 다른 오브젝트가 삭제된 노드를 가지고 있을 수 있기때문에

	void retrieve() {
		Node n = this;
		while (n.next != null) { // 마지막 노드 전까지 반복
			System.out.print(n.data + " -> ");
			n = n.next; // 다음 노드로 이동
		}
		System.out.println(n.data);
	}
}

public class SinglyLindedList {
	public static void main(String[] args) {
		Node head = new Node(1);
		head.append(2);
		head.append(3);
		head.append(4);
		head.retrieve();
		head.delete(2);
		head.retrieve();
	}
}
