package LeetCode;

import java.util.Vector;

// https://engkimbs.tistory.com/648
public class IntegertoRoman_2 {
	public String intToRoman(int num) {
		int romanUnit[] = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
		Vector<String> romanSyambol = new Vector<String>();
		romanSyambol.add("M");
		romanSyambol.add("CM");
		romanSyambol.add("D");
		romanSyambol.add("CD");
		romanSyambol.add("C");
		romanSyambol.add("XC");
		romanSyambol.add("L");
		romanSyambol.add("XL");
		romanSyambol.add("X");
		romanSyambol.add("IX");
		romanSyambol.add("V");
		romanSyambol.add("IV");
		romanSyambol.add("I");
//		{ "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };
		String ret = "";
		int i = 0;
		while (num > 0) { // 연산 결과 값이 0보다 클때 계속 진행
			int unitNum = num / romanUnit[i]; // 숫자를 들어있는 값으로 나눔 큰것부터 작은것 순으로
			for (int k = 0; k < unitNum; k++) { // 나눈 값까지 진행 (1000) 으로 나누었을때 3이면 3번 문자열 더함
				ret += romanSyambol.get(i); // 결과값에 문자열 추가
			}
			num -= unitNum * romanUnit[i]; // 꺼낸것만큼 감소시켜줌
			i++;
		}
		return ret; // 연산을 반복했을때의 결과 값 
	}

	public static void main(String[] args) {
		IntegertoRoman_2 aa = new IntegertoRoman_2();
		int num = 1994;
		System.out.println(aa.intToRoman(num));
	}
}
