package LeetCode.Array;

public class MoveZeroes {
	public static void main(String[] args) {
		MoveZeroes aa = new MoveZeroes();
		int[] nums = { 0, 1, 0, 3, 12 };
		aa.moveZeroes(nums);
	}

	public void moveZeroes(int[] nums) {
		int zIdx = 0; // zero 인것을 찾는 포인터
		for (int mIdx = 0; mIdx < nums.length; mIdx++) {
			// mIdx 는 계속 돌아다니며 값을 찾는 포인터
			if (nums[mIdx] != 0) {
				swap(nums, zIdx, mIdx);
				zIdx++;
			}
		}
		// 값 확인 출력용
		for (int n : nums) {
			System.out.println(n);
		}
		//--
	}

	private void swap(int[] nums, int zidx, int midx) {
		// 두개의 값을 교환
		int tmp = nums[zidx];
		nums[zidx] = nums[midx];
		nums[midx] = tmp;
	}
}
