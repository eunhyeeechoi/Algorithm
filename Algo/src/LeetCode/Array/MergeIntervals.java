package LeetCode.Array;

import java.util.Arrays;
import java.util.Comparator;

public class MergeIntervals {
    public static void main(String[] args) {
        MergeIntervals aa = new MergeIntervals();
        int[][] intervals = {{1, 3}, {2, 6}, {8, 10}, {15, 18}};
        aa.merge(intervals);
    }

    public int[][] merge(int[][] intervals) {
        int[][] ans = new int[0][];
        // 시작값으로 정렬
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return Integer.compare(o1[0], o2[0]);
            }
        });
        // 1차원 배열로 만들까 하나씩 꺼내서 겹치는지 확인하고 merge 하까

        for (int i = 0; i < intervals.length - 1; i++) {
            int nstart = intervals[i + 1][0];
            int bend = intervals[i][1];
            System.out.println("start" + nstart);
            System.out.println(bend);
        }

        return ans;
    }
}
