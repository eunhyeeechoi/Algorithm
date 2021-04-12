package LeetCode.Array;

import java.util.Arrays;

public class FindtheDuplicateNumber {
    public static void main(String[] args) {
        FindtheDuplicateNumber aa = new FindtheDuplicateNumber();
        int[] nums = {1, 3, 4, 2, 2};
        System.out.println(aa.findDuplicate(nums));
    }

    public int findDuplicate(int[] nums) {
        int ans = 0;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                ans = nums[i + 1];
            }
        }
        return ans;
    }
}
