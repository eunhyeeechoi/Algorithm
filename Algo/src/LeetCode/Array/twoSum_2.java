package LeetCode.Array;

import java.util.Arrays;

// 배열과 target 값이 주어지는데 두개의 숫자의 합이 target 이되는 인덱스 리턴
// 정렬을 이용하여 처리했는데 정렬 안되어 있는것에 문제가 있넹
public class twoSum_2 {
    public static void main(String[] args) {
        twoSum_2 aa = new twoSum_2();
        //int[] nums = {2, 7, 11, 15};
        int[] nums = {1, 3, 7, 4, 8};
        //int target = 9;
        int target = 5;
        aa.twoSum(nums, target);
    }

    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }
}