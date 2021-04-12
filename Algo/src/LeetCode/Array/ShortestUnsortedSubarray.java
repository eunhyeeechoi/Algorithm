package LeetCode.Array;

import java.util.Arrays;

// 581.Shortest Unsorted Continuous Subarray

//주어진 Array 를 오름차순으로 정렬하는데 전체중에 어떤 부분을 정렬 하면 전체가 오름 차순 배열이 된다. 그 최소길이를 리턴하는 문제.
// brute fore search 이용 풀이
public class ShortestUnsortedSubarray {
    public static void main(String[] args) {
        ShortestUnsortedSubarray aa = new ShortestUnsortedSubarray();
        //   int[] nums = {2, 5, 7, 6, 3, 9, 15};
        //int[] nums = {2, 6, 4, 6, 10, 9, 15};
        //int[] nums = {1, 2, 3, 4};
        //  int[] nums = {1};
        int[] nums = {2, 1};
        System.out.println(aa.findUnsortedSubarray(nums));
    }

    public int findUnsortedSubarray(int[] nums) {
        //int[] num2=nums; // 얕은복사
        // int[] nums2 = Arrays.copyOf(nums, nums.length); // 깊은복사
        int[] nums2 = nums.clone();
        Arrays.sort(nums);
        int ans1 = nums.length;
        int ans2 = nums.length;
        for (int i = 0; i < nums.length; i++) {
            if (nums2[i] != nums[i]) {
                //System.out.println("diff i s" + nums2[i] + " / i " + i);
                ans1 = i;
                break;
            }
        }
        for (int j = nums.length - 1; j > 0; j--) {
            if (nums2[j] != nums[j]) {
                //System.out.println("diff j " + nums2[j] + " / j " + j);
                ans2 = j;
                break;
            }
        }
        return ans1 == ans2 ? 0 : ans2 - ans1 + 1;
    }
}