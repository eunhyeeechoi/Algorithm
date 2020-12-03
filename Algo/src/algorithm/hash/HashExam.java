package algorithm.hash;

import java.util.LinkedList;

//2020.12.03
// 엔지니어대한민국님 강의 - https://www.youtube.com/watch?v=Vi0hauJemxA
//충돌이 생기는걸 대비해서 index 안에 Linked List 를 만들고 여기 저장
// 검색할땐 index를 저장해둿던것으로 찾아오면 됌

class HashTable {
	class Node {
		String key;
		String value;

		public Node(String key, String value) {
			this.key = key;
			this.value = value;
		}

		String value() {
			return value;
		}

		void value(String value) {
			this.value = value;
		}
	}

	// 해시테이블
	LinkedList<Node>[] data;

	HashTable(int size) {
		this.data = new LinkedList[size];
	}

	int getHashCode(String key) {
		// 해시 코드를 생성하는 함수!
		// 이번엔 각 문자열의 아스키 코드값을 받아서 값을 더해서 코드를 생성하는 방식으로 구현
		int hashcode = 0;
		for (char c : key.toCharArray()) {
			hashcode += c;
		}
		return hashcode;
	}

	int convertToIndex(int hashcode) {
		// 해시코드를 받아서 배열방에 인덱스로 변환
		// 해시코드를 문자열 배열방의 크기 길이로 나누어서 나머지에 따라 배정됌
		return hashcode % data.length;
	}

	Node searchKey(LinkedList<Node> list, String key) {
		// 배열방에 노드가 여러개일때 key 를 받아서 검색해오는 함수
		if (list == null)
			return null;
		for (Node node : list) {
			if (node.key.equals(key)) {
				return node;
			}
		}
		return null; // 같은 데이터를 못받았으면 null 반환
	}

	// 데이터를 받아서 저장
	void put(String key, String value) {
		int hashcode = getHashCode(key); // 해시코드를 받고
		int index = convertToIndex(hashcode); // 배열방 번호를 받음
		System.out.println("key(" + key + "), hashcode(" + hashcode + "), index(" + index + ")");
		LinkedList<Node> list = data[index]; // 배열방 번호를 이용해서 list를 받아옴
		if (list == null) {
			list = new LinkedList<Node>(); // 없으면 새로운 거 만들고
			data[index] = list; // 배열방에 넣어줌
		}
		Node node = searchKey(list, key); // 해당 키로 노드가 있는지 확인
		if (node == null) {
			list.addLast(new Node(key, value));
			// 없으면 추가
		} else {
			node.value(value); // 해당 노드의 값을 대체하는 방식으로 중복 키 해결
		}
	}

	String get(String key) {
		// 키를 가지고 데이터를 가지고 오는 함수를 정의
		int hashcode = getHashCode(key);
		int index = convertToIndex(hashcode);

		LinkedList<Node> list = data[index];
		Node node = searchKey(list, key);
		return node == null ? "Not Fount" : node.value();
	}
}

public class HashExam {
	public static void main(String[] args) {
		HashTable h = new HashTable(3);
		h.put("sung", "She is pretty");
		h.put("jin", "She is a model");
		h.put("hee", "She is an angel");
		h.put("min", "She is cute");
		h.put("sung", "She is beautiful");
		// 덮어쓰기
		System.out.println(h.get("sung"));
		System.out.println(h.get("jin"));
		System.out.println(h.get("hee"));
		System.out.println(h.get("min"));
		System.out.println(h.get("jae"));
	}
}
