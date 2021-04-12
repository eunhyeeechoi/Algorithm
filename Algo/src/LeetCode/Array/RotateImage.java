package LeetCode.Array;

public class RotateImage {
    // 2차원 배열을 회전시키는 문제
    // 다른 배열을 생성하지 않고 in-place 방식으로 회전을 시켜야한다.
    // 문제 - https://leetcode.com/problems/rotate-image/
    // 참고 -  https://iamheesoo.github.io/blog/algo-leet48
    public static void main(String[] args) {
        RotateImage aa = new RotateImage();
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        aa.rotate(matrix);
    }

    public void rotate(int[][] matrix) {
        int n=matrix.length;
        int top=0, down=n-1;
        while(top<down){ // 위와 아래 행렬을 swap, 둘이 만날 때 까지 반복
            int[] temp=matrix[top];
            matrix[top]=matrix[down];
            matrix[down]=temp;
            top++;
            down--;
        }

        for(int i=0;i<n;i++){ // 대각선 기준 대칭 swap
            for(int j=i+1;j<n;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
    }
}
