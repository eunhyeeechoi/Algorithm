package hackerrank.String;

import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class SherlockandtheValidString {
	// Complete the isValid function below.
	static String isValid(String s) {
		System.out.println(s);
		HashMap<Character, Integer> count = new HashMap<Character, Integer>();
		/*
		 * String ���ڿ����� �ٸ� ���ĺ��� ������ ���� �ϰ������ �ٸ��� ���Դ��� ��� �����ϱ� ������ ���ĺ��� �ش��ϴ°� üũ�� ��� ��¡
		 * ������ �������Ѽ� Hash Map <���ڿ�, ����> �̷��� �ϰ������ ��Ƴ� ��
		 */
		return "TRUE";
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
//		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		String s = scanner.nextLine();

		String result = isValid(s);

		System.out.println(result);
//		bufferedWriter.write(result);
//		bufferedWriter.newLine();
//
//		bufferedWriter.close();

		scanner.close();
	}
}
