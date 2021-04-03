package LeetCode.Array;

public class binarySearch_concept {
	// two point 사용
	// target 에서 nums 를 찾는다
	public int search(int[] nums, int target) {
		int left = 0;
		int right = nums.length - 1;
		while (left <= right) {
			int pivot = (left + right) / 2;
			if (nums[pivot] == target) {
				return pivot;
			} else if (nums[pivot] < target) {
				left = pivot + 1;
			} else {
				// target<pivot Num
				right = pivot - 1;
			}
		}
		return -1;
	}
}