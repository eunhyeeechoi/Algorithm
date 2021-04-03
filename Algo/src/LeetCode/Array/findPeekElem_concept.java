package LeetCode.Array;

public class findPeekElem_concept {
    int findPeakElem(int nums[]){
        int left=0;
        int right = nums.length-1;
        if(nums.length<=1){
            return 0;
        }
        while(left < right){
            int pivot=(left+right)/2;
            int num = nums[pivot];
            int nextNum = nums[pivot+1];

            if(num<nextNum){
                left = pivot+1;
            }else{
                right = pivot;
            }
        }
        return left; // left 와 right 가 만날때 끝나서 뭐여도 상관 없음
    }
}
