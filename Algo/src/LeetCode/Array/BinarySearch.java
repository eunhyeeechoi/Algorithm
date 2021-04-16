package LeetCode.Array;

public class BinarySearch {
    public static void main(String[] args) {
        BinarySearch aa = new BinarySearch();
        int[] nums = {-1, 0, 3, 5, 9, 12};
        int target = 9;
//		int target = 2;
        System.out.println(aa.search(nums, target));
    }

    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int pivot = (left + right) / 2; // pivot index를ㅌ 잡고
            if (nums[pivot] == target) {
                return pivot;
            } else if (nums[pivot] < target) {
                left = pivot + 1;
            } else {
                right = pivot - 1;
            }
        }
        return -1;
    }
}
