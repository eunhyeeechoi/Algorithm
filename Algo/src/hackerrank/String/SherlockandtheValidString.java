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
		 * String 문자열에서 다른 알파벳이 나오면 저장 하고싶은뎅 다른게 나왔는지 어떻게 구분하구 각각의 알파벳에 해당하는것 체크를 어떠케 하징
		 * 갯수를 증가시켜서 Hash Map <문자열, 갯수> 이렇게 하고싶은데 어렵넹 흡
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
