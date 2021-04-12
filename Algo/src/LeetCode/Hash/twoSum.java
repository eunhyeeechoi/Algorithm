package LeetCode.Hash;

import java.util.HashMap;

public class twoSum {
    public static void main(String[] args) {
        //int [] nums = {2,7,11,15};
        int[] nums = {13, 7, 5, 1, 3, 2};
        //int target = 9;
        int target = 10;


    }

    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hash = new HashMap();
        // 숫자, index 저장
        // 앞에서부터 탐색하며 target 값을 만들기 위한 값을 찾고, 찾고나면 두개를 리턴
        for (int i = 0; i < nums.length; i++) {
            hash.put(nums[i], i);
        }
        for (int p = 0; p < nums.length; p++) {
            int tem = target - nums[p];
            for (int q = p + 1; q < nums.length; q++) {
                if (nums[q] == tem) {
                    return new int[]{p, q};
                }
            }
        }
        return null;
    }
}
