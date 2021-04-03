package codinTest;

import java.util.Arrays;
import java.util.Stack;

public class back_1 {
    public static void main(String[] args) {
        back_1 aa = new back_1();
        int[] lotts = {44, 1, 0, 0, 31, 25};
        //int [] lotts = {0,0,0,0,0,0};
        //int[] lotts = {45, 4, 35, 20, 3, 9};

        int[] win_nums = {31, 10, 45, 1, 6, 19};
        //int [] win_nums= {38,19,20,40,15,25};
        //int[] win_nums = {20, 9, 3, 45, 4, 35};
        aa.solution(lotts, win_nums);
        // System.out.println(aa.solution(lotts,win_nums));

    }

    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        Stack<Integer> st = new Stack<>();
        int cnt = 0;
        for (int lo : lottos) {
            st.push(lo);
        }
        for (int win : win_nums) {
            if (st.contains(win)) { // 뽑은번호와 로또 당첨번호가 같은것은 빼고
                st.pop();
            } else if (st.contains(0)) { // st 의 값중 알수 없는것을 빼
                cnt++; // 0의 갯수를 세고
                st.pop();
            }
        }
        int max = 6 - (st.size());
        int min = 6 - (st.size() + cnt);
        if (max == 6) {
            answer[0] = 1;
        } else if (max == 5) {
            answer[0] = 2;
        } else if (max == 4) {
            answer[0] = 3;
        } else if (max == 3) {
            answer[0] = 4;
        } else if (max == 2) {
            answer[0] = 5;
        } else {
            answer[0] = 6;
        }
        if (min == 6) {
            answer[1] = 1;
        } else if (min == 5) {
            answer[1] = 2;
        } else if (min == 4) {
            answer[1] = 3;
        } else if (min == 3) {
            answer[1] = 4;
        } else if (min == 2) {
            answer[1] = 5;
        } else {
            answer[1] = 6;
        }
        // 출력용
        for (int p = 0; p < answer.length; p++) {
            System.out.println(answer[p]);
        }
        return answer;
    }
}

