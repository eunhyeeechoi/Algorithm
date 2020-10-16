package doit.chap04;

import java.util.Scanner;

public class IntQueMain {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		IntQueue s = new IntQueue(64);

		while (true) {
			System.out.println("���� ������ �� :" + s.size() + " / " + s.capacity());
			System.out.println("(1)��ť   (2)��ť   (3)��ũ   (4)����   (0)����");

			int menu = stdIn.nextInt();
			if (menu == 0)
				break;

			int x;
			switch (menu) {
			case 1: // ��ť
				System.out.println("������ : ");
				x = stdIn.nextInt();
				try {
					s.enque(x);
				} catch (IntQueue.OverflowInputQueueException e) {
					System.out.println("ť�� ���� á���ϴ�.");
				}
				break;
			case 2: // ��ť
				try {
					x = s.deque();
					System.out.println("��ť�� �����ʹ� " + x + "�Դϴ�.");
				} catch (IntQueue.EmptyIntQueueException e) {
					System.out.println("ť�� ����ֽ��ϴ�.");
				}
				break;

			case 3: // ��ũ
				try {
					x = s.peek();
					System.out.println("��ũ�� �����ʹ�" + x + "�Դϴ�.");
				} catch (IntQueue.EmptyIntQueueException e) {
					System.out.println("ť�� ����ֽ��ϴ�.");
				}
				break;
			case 4: // ����
				s.dump();
				break;
			}
		}
	}
}
