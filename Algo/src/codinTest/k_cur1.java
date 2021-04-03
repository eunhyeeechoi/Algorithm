package codinTest;

import java.util.Stack;

public class k_cur1 {
    public static void main(String[] args) {
        k_cur1 aa = new k_cur1();
        //int[] gift_cards = {4, 5, 3, 2, 1};
        int[] gift_cards = {5,4,5,4,5};
        //int[] wants = {2, 4, 4, 5, 1};
        int[] wants = {1,2,3,5,4};
        System.out.println(aa.solution(gift_cards,wants));

    }

    public int solution(int[] gift_cards, int[] wants) {
        int answer = 0;
        Stack<Integer> st = new Stack<>();
        for(int gi:gift_cards){
            st.push(gi);
        }
        for(int wan:wants){
            if(st.contains(wan)){
                st.pop();
            }
        }
        return st.size();
    }
}
