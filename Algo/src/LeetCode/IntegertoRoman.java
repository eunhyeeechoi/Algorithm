package LeetCode;

public class IntegertoRoman {
	public String intToRoman(int num) {
		String answer = "";
		if (num / 1000 > 0) {
			int fir = num / 1000;
			for (int i = 0; i < fir; i++) {
				answer += "M";
			}
		} else if (num / 100 > 0) {
			int sec = num / 100;
			if (sec < 4) {
				answer += "C";
			} else if (sec == 4) {
				answer += "CD";
			} else if (4 < sec || sec < 9) {
				if (sec / 5 > 0) {
					answer += "D";
					int b = sec - 5;
					for (int p = 0; p < b; p++) { // 800 같은 수는 D 에 800-500 한것만큼 C를 더함
						answer += "C";
					}
				} else {
					answer += "D";
				}
			} else if (sec == 9) {
				answer += "CM";
			}
		} else if (num / 10 > 0) {
			int thir = num / 10;
			if (thir < 4) {
				for (int q = 0; q < thir; q++) {
					answer += "X";
				}
			} else if (thir == 4) {
				answer += "IV";
			} else if (4 < thir || thir < 9) {
				answer += "L";
				int c = thir - 5;
				for (int r = 0; r < c; r++) {
					answer += "X";
				}
			} else if (thir == 9) {
				answer += "XC";
			}
		} else if (num % 10 > 0) {
			int forth = num % 10;
			if (forth < 4) {
				for (int e = 0; e < forth; e++) {
					answer += "I";
				}
			} else if (forth == 4) {
				answer += "IV";
			} else if (4 < forth || forth < 9) {
				answer += "V";
				int d = forth - 5;
				for (int z = 0; z < d; z++) {
					answer += "I";
				}
			} else if (forth == 9) {
				answer += "IX";
			}
		}
		System.out.println(answer);
		return answer;
	}

	public static void main(String[] args) {
		IntegertoRoman aa = new IntegertoRoman();
		int num = 1994;
		aa.intToRoman(num);
	}
}
