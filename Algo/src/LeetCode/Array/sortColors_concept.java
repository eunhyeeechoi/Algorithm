package LeetCode.Array;

/*
  	0,1,2 로 구성된 배열을 inplace sort 를 이용하여 정렬 
 	QuickSort 처럼 partition 을 나누는것이 중요한 문제 
 	분 : 0을 만날때마다 주황과 swap / 2를 만날때 분홍과 swap 
	주 : 0을 가리키는 포인터  / 분홍이 0을 만나면 swap 
	초 : 2만 가리키는 포인터 생성 / 분홍이 2를 만나면 swap 
	partitioning
 */
public class sortColors_concept {
	void sortColors(int[] nums) {
		int idx0 = 0; // 주황 포인터 생성
		int idx2 = nums.length - 1; // 초록 : 2 저장
		int i = 0; // 분홍 index
		while (i <= idx2) { // 분홍 < 초록
			if (nums[i] == 0) { // 분홍이 0일때
				swap(nums, nums[i], nums[idx0]);
				idx0++;
				i++;
			} else if (nums[i] == 2) {
				swap(nums, nums[i], nums[idx2]);
				idx2--;
			} else { // nums[i] == 1
				i++;
			}
		}
	}

	private void swap(int[] nums, int i, int j) {
		int tmp = nums[i];
		nums[i] = nums[j];
		nums[j] = tmp;
	}

}
