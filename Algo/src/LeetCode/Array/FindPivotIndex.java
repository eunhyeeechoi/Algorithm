package LeetCode.Array;
// 배열 내에서 좌우 값들의 합이 같아지는 인덱스 리턴
public class FindPivotIndex {
	public static void main(String[] args) {
		FindPivotIndex aa = new FindPivotIndex();
		int[] nums = { 1, 7, 3, 6, 5, 6 };
		System.out.println(aa.pivotIndex(nums));
	}

	public int pivotIndex(int[] nums) {
		int sum = bsum(nums);
		int leftSum = 0;
		int rightSum = sum;
		int pastPivot = 0;
		for (int i = 0; i < nums.length; i++) {
			int pivot = nums[i];
			rightSum = rightSum - pivot;
			leftSum = leftSum + pastPivot;
			if (rightSum == leftSum) {
				return i;
			}
			pastPivot = pivot;
		}
		return -1;
	}

	private int bsum(int[] nums) {
		int hap = 0;
		for (int i = 0; i < nums.length; i++) {
			hap += nums[i];
		}
		return hap;
	}

}
