class Solution {
    public boolean isPowerOfTwo(int n) {
        if (n <= 0) return false;
        return isTrue(n);
    }

    private boolean isTrue(int n) {
        // Base case: We reached 1, so it's a power of two
        if (n == 1) return true;

        // Base case: If it's odd and not 1, it's NOT a power of two
        if (n % 2 != 0) return false;

        // Recursive step: Keep dividing
        return isTrue(n / 2);
    }
}