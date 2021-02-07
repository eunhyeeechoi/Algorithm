package codinTest;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class sample2 {

	/*
	 * Complete the 'oddNumbers' function below.
	 *
	 * The function is expected to return an INTEGER_ARRAY. The function accepts
	 * following parameters: 1. INTEGER l 2. INTEGER r
	 */

	public static List<Integer> oddNumbers(int l, int r) {
		// Write your code here

	}

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		int l = Integer.parseInt(bufferedReader.readLine().trim());

		int r = Integer.parseInt(bufferedReader.readLine().trim());

		List<Integer> result = sample2.oddNumbers(l, r);

		for (int i = 0; i < result.size(); i++) {
			bufferedWriter.write(String.valueOf(result.get(i)));

			if (i != result.size() - 1) {
				bufferedWriter.write("\n");
			}
		}

		bufferedWriter.newLine();

		bufferedReader.close();
		bufferedWriter.close();
	}

}
