package doit.chap04;

public class IntStack {
	private int max; // ���� ũ��
	private int ptr; // ���� ������
	private int[] stk; // ���� ��ü

	// ���� ��������� ����
	public class EmptyIntStackException extends RuntimeException {
		public EmptyIntStackException() {
		}
	}

	public class OverflowStackException extends RuntimeException {
		public OverflowStackException() {
		}
	}

	public IntStack(int capacity) {
		ptr = 0;
		max = capacity;
		try {
			stk = new int[max]; // ���� ��ü�� �迭 ����
		} catch (OutOfMemoryError e) {
			max = 0;
		}
	}

	// ���ÿ� x �� Ǫ��
	public int push(int x) throws OverflowStackException {
		if (ptr >= max) // ������ ����á����
			throw new OverflowStackException();
		return stk[ptr++] = x;
	}

	// ���ÿ��� �����͸� �� (���� �ִ� �����͸� ����)
	public int pop() throws EmptyIntStackException {
		if (ptr <= 0) // ������ �������
			throw new EmptyIntStackException();
		return stk[--ptr];
	}

	// ���ÿ��� �����͸� ��ũ (���� �ִ� ������üũ)
	public int peek() throws EmptyIntStackException {
		if (ptr <= 0)
			throw new EmptyIntStackException();
		return stk[ptr - 1];
	}

	// ���ؿ��� x �� ã�� �ε��� ��ȯ , ������ -1
	public int indexOf(int x) {
		for (int i = ptr - 1; i >= 0; i--) { // �����ʿ������� �����˻�
			if (stk[i] == x)
				return i; // �˻� ����
		}
		return -1; // �˻�����
	}

	// ������ ���
	public void clear() {
		ptr = 0;
	}

	// ������ �뷮�� ��ȯ
	public int capacity() {
		return max;
	}

	// ���ÿ� �׿��ִ� ������ �� ��ȯ
	public int size() {
		return ptr;
	}

	// ������ ����ִ°�?
	public boolean isEmpty() {
		return ptr <= 0;
	}

	// ������ ���� á�°�?
	public boolean isFull() {
		return ptr >= max;
	}

	// ���þ��� ��� �����͸� �ٴ� - ����� ������ ���
	public void dump() {
		if (ptr <= 0) {
			System.out.println("������ ����ֽ��ϴ�.");
		} else {
			for (int i = 0; i < ptr; i++)
				System.out.println(stk[i] + " ");
			System.out.println();
		}
	}
}