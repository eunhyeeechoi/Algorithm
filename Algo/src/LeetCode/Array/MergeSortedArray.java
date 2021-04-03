package LeetCode.Array;

public class MergeSortedArray {
    public static void main(String[] args) {
        MergeSortedArray aa = new MergeSortedArray();
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};
        int m = 3;
        int n = 3;
        aa.merge(nums1, m, nums2, n);

    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int num1p = m - 1;
        int num2p = n - 1;
        int wp = nums1.length - 1;

        if (num2p < 0) {
            return;
        } else if (num1p < 0) { // num1 = {0,0,0,0,0}; num2 = {1,2,3,4,5} 일때 처리
            for (int i = 0; i < nums2.length; i++) {
                nums1[i] = nums2[i];
            }
            return;
        }
        while (0 <= num1p && 0 <= num2p) {
            int num1 = nums1[num1p];
            int num2 = nums2[num2p];
            if (num2 <= num1) {
                int num = num1;
                nums1[wp] = num;
                num1p--;
                wp--;
            } else {
                int num = num2;
                nums1[wp] = num;
                num2p--;
                wp--;
            }
        }

        while (0 <= num2p) {
            nums1[wp] = nums2[num2p];
            num2p--;
            wp--;
        }

        for (int aa : nums1) {
            System.out.println(aa);
        }
    }
}
