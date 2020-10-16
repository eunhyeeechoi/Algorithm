package doit.chap04;

public class IntQueue {
	// int 형 큐
	private int max; // 큐 용량
	private int front; // 첫번째 요소 커서
	private int rear; // 마지막 요소 커서
	private int num; // 현재 데이터 수
	private int[] que; // 큐 본체

	// 큐가 비어있는 예외
	public class EmptyIntQueueException extends RuntimeException {
		public EmptyIntQueueException() {
		}
	}

	// 큐가 가득찬 예외
	public class OverflowInputQueueException extends RuntimeException {
		public OverflowInputQueueException() {
		}
	}

	// 생성자
	public IntQueue(int capacity) {
		num = front = rear = 0;
		max = capacity;
		try {
			que = new int[max]; // 큐 본체용 배열 생성
		} catch (OutOfMemoryError e) {
			max = 0;
		}
	}

	// 큐에 데이터를 인큐
	public int enque(int x) throws OverflowInputQueueException {
		if (num >= max)
			throw new OverflowInputQueueException();
		que[rear++] = x;
		num++;
		if (rear == max)
			rear = 0;
		return x;
	}

	// 큐에서 데이터를 인큐
	public int deque() throws EmptyIntQueueException {
		if (num <= 0)
			throw new EmptyIntQueueException();
		int x = que[front++];
		num--;
		if (front == max)
			front = 0;
		return x;
	}

	// 큐에서 데이터를 피크 (프런트 데이터를 들여다봄)
	public int peek() throws EmptyIntQueueException {
		if (num <= 0)
			throw new EmptyIntQueueException();
		return que[front];
	}

	// 큐에서 x 를 검색하여 인덱스 리턴, 찾지못하면 -1 리턴
	public int indexOf(int x) {
		for (int i = 0; i < num; i++) {
			int idx = (i + front) % max;
			if (que[idx] == x) // 검색 성공
				return idx;
		}
		return -1;// 검색 실패
	}

	// 큐를 비움
	public void clear() {
		num = front = rear = 0;
	}

	// 큐의 용량을 반환
	public int capacity() {
		return max;
	}

	// 큐에 쌓여있는 데이터 수 반환
	public int size() {
		return num;
	}

	// 큐가 비어있는지 확인
	public boolean isFull() {
		return num >= max;
	}

	// 큐 안의 모든 데이터를 프런트 - 리어순으로 출력
	public void dump() {
		if (num <= 0)
			System.out.println("큐가 비어있습니다.");
		else {
			for (int i = 0; i < num; i++) {
				System.out.println(que[(i + front) % max] + " ");
				System.out.println();
			}
		}

	}
}
