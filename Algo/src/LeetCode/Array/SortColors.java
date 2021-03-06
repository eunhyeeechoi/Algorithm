package LeetCode.Array;

public class SortColors {
    public static void main(String[] args) {
        SortColors aa = new SortColors();
        int[] nums = {2, 0, 2, 1, 1, 0};
        aa.sortColors(nums);
    }

    public void sortColors(int[] nums) {
        int ju = 0; // 0 찾는애
        int gre = nums.length - 1; // 2 찾는애 - 뒤에서부터 출발
        int bun = 0; // 바꿔주는애
        while (bun <= gre) {
            if (nums[bun] == 0) {
                swap(nums, bun, ju);
                ju++;
                bun++;
            } else if (nums[bun] == 2) {
                swap(nums, bun, gre);
                gre--;
            } else { // nums[bun] == 1 일때
                bun++;
            }
        }
        // 확인용 출력 코드
        for (int n : nums) {
            System.out.println(n);
        }
    }

    private void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
}
