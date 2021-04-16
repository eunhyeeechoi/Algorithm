package LeetCode.Array;

import java.util.Arrays;
// 정수가 포함된 배열 nums 가 주어지고 반복되는 숫자가 하나 존재할때 이 반복되는 수를 반환
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
