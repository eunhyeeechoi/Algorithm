package LeetCode.Stack;

import java.util.Stack;

public class ValidParentheses_2 {
    public boolean isValid(String s) {
        Stack<Integer> st = new Stack<>();
        for (char c : s.toCharArray()) {
            switch (c) {
                case '(':
                    st.push(1);
                    break;
                case '{':
                    st.push(2);
                    break;
                case '[':
                    st.push(3);
                    break;
                case ')':
                    if (st.size() <= 0)
                        return false;
                    if (st.pop() != 1)
                        return false;
                    break;
                case '}':
                    if (st.size() <= 0)
                        return false;
                    if (st.pop() != 2)
                        return false;
                    break;
                case ']':
                    if (st.size() <= 0)
                        return false;
                    if (st.pop() != 3)
                        return false;
                    break;
            }
        }
        if (st.size() > 0)
            return false;
        return true;
    }

    public static void main(String[] args) {
        ValidParentheses_2 aa = new ValidParentheses_2();
        //       String s = "([)]";
       // String s = "()[]{}";
        String s = "{()[]{}}";
        System.out.println(aa.isValid(s));
    }
}
