package LeetCode.Array;

public class moveZeroes_concept {
	void moveZeros(int nums[]) {
		int wIdx = 0; // 0을 가리키는 인덱
		for (int idx = 0; idx < nums.length; idx++) {
			if (nums[idx] != 0) { // 0이 아닌것을 찾는 인덱스
//				swap(nums[wIdx], nums[idx]);
				nums[wIdx] = nums[idx];
				wIdx++;
			}
		}
		// 0으로 채우는 방식 
		for (; wIdx < nums.length; wIdx++) {
			nums[wIdx] = 0;
		}
	}
}
