package LeetCode.Array;

// 정렬이 되어있는 두개의 Array 를 합치는것
// index 로 접근하는 사고방식이 중요 !
// 각각의 Read index 와 write 인덱스가 중요함
public class MergeSortArray_concept {
    void merge(int nums1[], int m, int nums2[], int n) { // 배열과 크기
        int num1idx = m - 1; // 분홍포인터 (nums1의 맨끝부터)
        int num2idx = n - 1; // 초록 포인터 (nums2의 맨끝부터)
        int wIdx = nums1.length - 1; // 파랑 넣을곳의 맨끝! 오른쪽에서 왼쪽으로 이동
        if (num2idx < 0) {
            return;
        }
        while (0 <= num1idx && 0 <= num2idx) { // 분홍과 초록이 모두 0보다 클때
            int num1 = nums1[num1idx];
            int num2 = nums2[num2idx];
            if (num2 <= num1) { // 분홍과 초록의 값을 비교 초록이 더 클때
                int num = num1;
                nums1[wIdx] = num; // 넣을곳의 맨끝에 분홍을 삽입
                num1idx--; // 넣은것 포인터 왼쪽으로 이동
                wIdx--; // 넣을곳 왼쪽으로 이동
            } else { // 분홍이 더 클때
                int num = num2; // 분홍을 num 에 담고
                nums1[wIdx] = num; // 넣을곳에 분홍을 삽입
                num2idx--; // 분홍 포인터 이동
                wIdx--; // 넣을곳 포인터도 이동
            }
        }
        // memory copy s
        /*
        nums 1 = {4,5,6,0,0,0};
        nums 2 = {1,2,3};
        처럼 생긴 경우를 위해
        */
        while (0 <= num2idx) {
            nums1[wIdx] = nums2[num2idx];
            num2idx--;
            wIdx--;
        }
    }
}
