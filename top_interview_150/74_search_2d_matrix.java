// 74. Search a 2D Matrix
// https://leetcode.com/problems/search-a-2d-matrix/

class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int start = 0;
        int end = matrix.length * matrix[0].length - 1;
        int m, i, j;
        boolean found = false;

        while (start <= end) {
            m = (start + end) / 2;
            i = m / matrix[0].length;
            j = m % matrix[0].length;

            if (target < matrix[i][j]) {
                end = m - 1;
            } else if (matrix[i][j] < target) {
                start = m + 1;
            } else {
                return true;
            }
        }
        return false;
    }
}
