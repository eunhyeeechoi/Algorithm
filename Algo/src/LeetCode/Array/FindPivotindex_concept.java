package LeetCode.Array;

public class FindPivotindex_concept {
	int pivotIndex(int[] nums) {
		int sum = bhap(nums);
		int leftSum = 0;
		int rightSum = sum; // 오른쪽에 다더해져 있지 
		int pastPivotNum = 0; // 이전 pivot의 값
		for (int idx = 0; idx < nums.length; idx++) {
			int pivot = nums[idx]; // pivot 은 nums 의 인덱스
			rightSum = rightSum - pivot; // pivot 이 정해지는 순간 rightSum 에서 pivot 값 빼기
			leftSum = leftSum + pastPivotNum; // pivot 이 바뀔때 이전 pivot 값을 왼쪽값에 더하기
			if (leftSum == rightSum) { // 양쪽 Sum 의 값이 같다면 인덱스 리턴
				return idx;
			}
			pastPivotNum = pivot; // pivot 이 옮겨갈때 이전 pivot 변수에 원래의 pivot 값 삽입
		}
		return -1;
	}

	private int bhap(int[] nums) {
		int hap = 0;
		for (int i = 0; i < nums.length; i++) {
			hap += nums[i];
		}
		return hap;
	}
}
