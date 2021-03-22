package baekjoon.basic.foruses;

public class googoodan {
	public void gogodan(int n) {
		for (int i = 1; i < 10; i++) {
			System.out.println(n + "*" + i + "=" + n * i);
		}

	}

	public static void main(String[] args) {
		googoodan aa = new googoodan();
		aa.gogodan(2);
	}
}
