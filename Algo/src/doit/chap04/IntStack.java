package doit.chap04;

public class IntStack {
	private int max; // 스택 크기
	private int ptr; // 스택 포인터
	private int[] stk; // 스택 본체

	// 스택 비어있을때 예외
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
			stk = new int[max]; // 스택 본체용 배열 생성
		} catch (OutOfMemoryError e) {
			max = 0;
		}
	}

	// 스택에 x 를 푸시
	public int push(int x) throws OverflowStackException {
		if (ptr >= max) // 스택이 가득찼을때
			throw new OverflowStackException();
		return stk[ptr++] = x;
	}

	// 스택에서 데이터를 팝 (정상에 있는 데이터를 꺼냄)
	public int pop() throws EmptyIntStackException {
		if (ptr <= 0) // 스택이 비어있음
			throw new EmptyIntStackException();
		return stk[--ptr];
	}

	// 스택에서 데이터를 피크 (정상에 있는 데이터체크)
	public int peek() throws EmptyIntStackException {
		if (ptr <= 0)
			throw new EmptyIntStackException();
		return stk[ptr - 1];
	}

	// 스텍에서 x 를 찾아 인덱스 반환 , 없을시 -1
	public int indexOf(int x) {
		for (int i = ptr - 1; i >= 0; i--) { // 정상쪽에서부터 선형검색
			if (stk[i] == x)
				return i; // 검색 성공
		}
		return -1; // 검색실패
	}

	// 스택을 비움
	public void clear() {
		ptr = 0;
	}

	// 스택의 용량을 반환
	public int capacity() {
		return max;
	}

	// 스택에 쌓여있는 데이터 수 반환
	public int size() {
		return ptr;
	}

	// 스택이 비어있는가?
	public boolean isEmpty() {
		return ptr <= 0;
	}

	// 스택이 가득 찼는가?
	public boolean isFull() {
		return ptr >= max;
	}

	// 스택안의 모든 데이터를 바닥 - 꼭대기 순으로 출력
	public void dump() {
		if (ptr <= 0) {
			System.out.println("스택이 비어있습니다.");
		} else {
			for (int i = 0; i < ptr; i++)
				System.out.println(stk[i] + " ");
			System.out.println();
		}
	}
}