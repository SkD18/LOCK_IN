class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        // Base case
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) return false;

        int m = matrix.length;
        int n = matrix[0].length;

        // Binary search over rows
        for (int i = 0; i < m; i++) {
            // Check if target could potentially be in the current row
            if (target >= matrix[i][0] && target <= matrix[i][n - 1]) {
                int left = 0;
                int right = n - 1;

                // Perform binary search in the current row
                while (left <= right) {
                    int mid = left + (right - left) / 2;
                    if (matrix[i][mid] == target) {
                        return true;
                    } else if (matrix[i][mid] < target) {
                        left = mid + 1;
                    } else {
                        right = mid - 1;
                    }
                }
            }
        }
        return false; // Target not found
    }
}