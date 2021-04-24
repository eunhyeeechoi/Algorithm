package LeetCode.Stack;

import java.util.Stack;

// 문자열에서 반복되는 문자 제거 하는것
public class RemoveAllAdjacentDuplicatesInString_3 {
    public static void main(String[] args) {
        RemoveAllAdjacentDuplicatesInString_3 aa = new RemoveAllAdjacentDuplicatesInString_3();
        String S = "abbaca";
        System.out.println(aa.removeDuplicates(S));

    }

    public String removeDuplicates(String S) {
        Stack<Character> stack = new Stack<>();
        for (char c : S.toCharArray()) {
            if (!stack.isEmpty() && stack.peek() == c) {
                // 지금 입력되는 값이랑 같은지 비교하고 같으면 스택에서 제거
                stack.pop();
            } else {
                // 지금 입력되는 값이 다르면 추가
                stack.push(c);
            }
        }
        StringBuilder builder = new StringBuilder("");
        for (char ch : stack) {
            builder.append(ch);
        }
        return builder.toString();
    }
}
