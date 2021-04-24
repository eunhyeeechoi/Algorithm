package LeetCode.Stack;

import java.util.Stack;

//https://leetcode.com/problems/min-stack/submissions/
// Stack 에 입력되는것중 최소 값을 출력하는 스택 구현.
//참고 - https://github.com/leetcoders/LeetCode-Java/blob/master/MinStack.java
// 스택을 두개 만들어서 하나에는 전부저장. 하나에는 현재 입력값이 minstack 보다 작으면 삽입
public class MinStack {
    //	public void MinStack() {
    Stack<Integer> stack = new Stack();
    Stack<Integer> minStack = new Stack();
//	}

    public void push(int val) {
        stack.push(val); // 전부 저장하는 스택
        if (minStack.isEmpty() || val <= minStack.peek()) {
            minStack.push(val); // 가장 작은값을 저장하는 스택. 최상위에 가장 작은값이 존재.
        }
    }

    public void pop() {
        if (stack.pop().equals(minStack.peek()))
            minStack.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int getMin() {
        return minStack.peek();
    }

    public static void main(String[] args) {
        MinStack minstack = new MinStack();
//		minstack.MinStack();
        minstack.push(5);
        minstack.top();
        minstack.pop();
        minstack.push(3);
        minstack.push(2);
        System.out.println(minstack.getMin());
    }

}
