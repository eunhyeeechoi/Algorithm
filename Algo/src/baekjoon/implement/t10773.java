package baekjoon.implement;

import java.util.*;
import java.io.*;

public class t10773 {
	public int solution(int[] arr) {
		int sum = 0;
		Stack<Integer> stack = new Stack<>();
		for (int num : arr) {
			if (num != 0) {
				stack.add(num);
			} else {
				stack.pop();
			}
		}

		while (!stack.isEmpty()) {
			sum += stack.pop();
		}

		return sum;
	}

	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int[] arr = new int[Integer.parseInt(br.readLine())];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = Integer.parseInt(br.readLine());
			}

			System.out.println(new t10773().solution(arr));

		} catch (Exception e) {
			e.printStackTrace();
		} // try~catch end

	}
}
