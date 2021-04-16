package LeetCode.Stack;

import java.util.Stack;

//https://leetcode.com/problems/min-stack/submissions/
// Stack 에 입력되는것중 최소 값을 출력하는 스택 구현.
// 구현문제가 낯설어서 인지 잘못이해함 ㅠㅠ 
//참고 - https://github.com/leetcoders/LeetCode-Java/blob/master/MinStack.java
// 스택을 두개 만들어서 하나에는 전부저장. 하나에는 현재 입력값이 minstack 보다 작으면 삽입
public class MinStack {
    //	public void MinStack() {
    Stack<Integer> stack = new Stack();
    Stack<Integer> minStack = new Stack();
//	}

    public void push(int val) {
        stack.push(val);
        if (minStack.isEmpty() || val <= minStack.peek()) {
            minStack.push(val);
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
