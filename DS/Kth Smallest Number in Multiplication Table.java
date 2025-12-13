class Solution {
    public int findKthNumber(int m, int n, int k) {
        int low = 1, high = m * n, ans = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (countLessEqual(mid, m, n) >= k) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }

    private int countLessEqual(int x, int m, int n) {
        int count = 0;
        for (int i = 1; i <= m; i++) {
            count += Math.min(x / i, n);
        }
        return count;
    }
}