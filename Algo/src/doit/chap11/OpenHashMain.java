package doit.chap11;

import java.util.Scanner;

// :: ���� �ּҹ��� ���� �ؽ��� ��� ��
public class OpenHashMain {
	static Scanner stdIn = new Scanner(System.in);

	// ������ (ȸ����ȣ + �̸�)
	static class Data {
		static final int NO = 1; // ��ȣ�� �Է� �޽��ϱ�?
		static final int NAME = 2; // �̸��� �Է� �޽��ϱ�?

		private Integer no; // ȸ����ȣ (Ű ��)
		private String name; // �̸�

		// Ű ��
		Integer KeyCode() {
			return no;
		}

		// ���ڿ��� ��ȯ�մϴ�.
		public String toString() {
			return name;
		}

		// �����͸� �Է��մϴ�.
		void scanData(String guide, int sw) {
			System.out.println(guide + " �� �����͸� �Է��ϼ���.");

			if ((sw & NO) == NO) {
				System.out.print("��ȣ : ");
				no = stdIn.nextInt();
			}
			if ((sw & NAME) == NAME) {
				System.out.print("�̸� : ");
				name = stdIn.next();
			}
		}
	}

	// �޴� ������
	enum Menu {
		ADD("�߰�"), REMOVE("����"), SEARCH("�˻�"), DUMP("���"), TERMINATE("����");

		private final String message;// ����� ���ڿ�

		static Menu MenuAt(int idx) { // ������ idx �� ���Ÿ� ��ȯ
			for (Menu m : Menu.values())
				if (m.ordinal() == idx)
					return m;
			return null;
		}

		Menu(String string) {// ������
			message = string;
		}

		String getMessage() { // ����� ���ڿ��� ��ȯ
			return message;
		}
	}

	// �޴� ����
	static Menu SelectMenu() {
		int key;
		do {
			for (Menu m : Menu.values())
				System.out.printf("(%d) %s", m.ordinal(), m.getMessage());
			System.out.print(":");
			key = stdIn.nextInt();
		} while (key < Menu.ADD.ordinal() || key > Menu.TERMINATE.ordinal());
		return Menu.MenuAt(key);
	}

	public static void main(String[] args) {
		Menu menu; // �޴�
		Data data; // �߰��� ������ ����
		Data temp = new Data(); // �Է¿� ������

		OpenHash<Integer, Data> hash = new OpenHash<Integer, Data>(13);

		do {
			switch (menu = SelectMenu()) {
			case ADD: // �߰�
				data = new Data();
				data.scanData("�߰�", Data.NO | Data.NAME);
				int k = hash.add(data.KeyCode(), data);
				switch (k) {
				case 1:
					System.out.println("�� Ű ���� �̹� ��ϵǾ� �ֽ��ϴ�.");
					break;

				case 2:
					System.out.println("�ؽ� ���̺��� ���� á���ϴ�.");
					break;
				}
				break;
			case REMOVE: // ����
				temp.scanData("����", Data.NO);
				hash.remove(temp.KeyCode());
				break;

			case SEARCH: // �˻�
				temp.scanData("�˻�", Data.NO);
				Data t = hash.search(temp.KeyCode());
				if (t != null)
					System.out.println("�� Ű�� ���� �����ʹ� " + t + "�Դϴ�.");
				else
					System.out.println("�� �����Ͱ� �����ϴ�.");
				break;

			case DUMP: // ���
				hash.dump();
				break;
			}
		} while (menu != Menu.TERMINATE);
	}

}