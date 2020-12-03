package algorithm.hash;

import java.util.LinkedList;

//2020.12.03
// �����Ͼ���ѹα��� ���� - https://www.youtube.com/watch?v=Vi0hauJemxA
//�浹�� ����°� ����ؼ� index �ȿ� Linked List �� ����� ���� ����
// �˻��Ҷ� index�� �����؊x�������� ã�ƿ��� ��

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

	// �ؽ����̺�
	LinkedList<Node>[] data;

	HashTable(int size) {
		this.data = new LinkedList[size];
	}

	int getHashCode(String key) {
		// �ؽ� �ڵ带 �����ϴ� �Լ�!
		// �̹��� �� ���ڿ��� �ƽ�Ű �ڵ尪�� �޾Ƽ� ���� ���ؼ� �ڵ带 �����ϴ� ������� ����
		int hashcode = 0;
		for (char c : key.toCharArray()) {
			hashcode += c;
		}
		return hashcode;
	}

	int convertToIndex(int hashcode) {
		// �ؽ��ڵ带 �޾Ƽ� �迭�濡 �ε����� ��ȯ
		// �ؽ��ڵ带 ���ڿ� �迭���� ũ�� ���̷� ����� �������� ���� ������
		return hashcode % data.length;
	}

	Node searchKey(LinkedList<Node> list, String key) {
		// �迭�濡 ��尡 �������϶� key �� �޾Ƽ� �˻��ؿ��� �Լ�
		if (list == null)
			return null;
		for (Node node : list) {
			if (node.key.equals(key)) {
				return node;
			}
		}
		return null; // ���� �����͸� ���޾����� null ��ȯ
	}

	// �����͸� �޾Ƽ� ����
	void put(String key, String value) {
		int hashcode = getHashCode(key); // �ؽ��ڵ带 �ް�
		int index = convertToIndex(hashcode); // �迭�� ��ȣ�� ����
		System.out.println("key(" + key + "), hashcode(" + hashcode + "), index(" + index + ")");
		LinkedList<Node> list = data[index]; // �迭�� ��ȣ�� �̿��ؼ� list�� �޾ƿ�
		if (list == null) {
			list = new LinkedList<Node>(); // ������ ���ο� �� �����
			data[index] = list; // �迭�濡 �־���
		}
		Node node = searchKey(list, key); // �ش� Ű�� ��尡 �ִ��� Ȯ��
		if (node == null) {
			list.addLast(new Node(key, value));
			// ������ �߰�
		} else {
			node.value(value); // �ش� ����� ���� ��ü�ϴ� ������� �ߺ� Ű �ذ�
		}
	}

	String get(String key) {
		// Ű�� ������ �����͸� ������ ���� �Լ��� ����
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
		// �����
		System.out.println(h.get("sung"));
		System.out.println(h.get("jin"));
		System.out.println(h.get("hee"));
		System.out.println(h.get("min"));
		System.out.println(h.get("jae"));
	}
}
