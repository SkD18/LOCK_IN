class Solution {
    public boolean isPowerOfTwo(int n) {
        if (n <= 0) return false;
        //bit manipulation approach
        /**
         *  return n > 0 && (n & (n - 1)) == 0;
         * if n = 8, binary of 8 = 1000
         * (1000) - 1 = 7(0111), (0111) & (1000) = 0000, (0000) == 0 is true. Result: true.
         */
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