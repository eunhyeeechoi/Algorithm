package LeetCode.Array;

// peak element - 어떠한 숫자가 그 이웃 숫자보다 큰것
// 정수배열에서 peak element 를 찾는 문제 . 답이 여러개 나올 수 있음
public class findPeekElem_concept {
    int findPeakElem(int nums[]) {
        int left = 0;
        int right = nums.length - 1;
        if (nums.length <= 1) {
            return 0;
        }
        while (left < right) {
            int pivot = (left + right) / 2;
            int num = nums[pivot];
            int nextNum = nums[pivot + 1];
            // 범위를 이동하여 푸는 문제
            if (num < nextNum) {
                left = pivot + 1; // 반 나눈것보다 옆의것이 크다면 오른쪽에 peak 이 존재 
            } else {
                right = pivot; // peak 을 포함해서 peak 이 될 수 있기때문에 왼쪽으로 이동
            }
        }
        return left; // left 와 right 가 만날때 끝나서 뭐여도 상관 없음
    }
}
