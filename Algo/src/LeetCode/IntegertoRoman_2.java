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
		while (num > 0) {
			int unitNum = num / romanUnit[i];
			for (int k = 0; k < unitNum; k++) {
				ret += romanSyambol.get(i);
			}
			num -= unitNum * romanUnit[i];
			i++;
		}
		System.out.println(ret);
		return ret;
	}

	public static void main(String[] args) {
		IntegertoRoman_2 aa = new IntegertoRoman_2();
		int num = 1994;
		aa.intToRoman(num);
	}

}
