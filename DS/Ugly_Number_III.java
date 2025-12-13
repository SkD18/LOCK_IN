class Solution {
    public int nthUglyNumber(int n, int a, int b, int c) {
        // Calculate LCM for all pairs and triplet to apply inclusion-exclusion principle
        long lcmAB = lcm(a, b);
        long lcmBC = lcm(b, c);
        long lcmAC = lcm(a, c);
        long lcmABC = lcm(lcmAB, c);

        // Binary search range: minimum is 1, maximum is 2 * 10^9
        long left = 1;
        long right = 2000000000;

        // Binary search to find the nth ugly number
        while (left < right) {
            long mid = (left + right) >> 1;  // Equivalent to (left + right) / 2

            // Count how many ugly numbers are <= mid using inclusion-exclusion principle
            // Count = |A| + |B| + |C| - |A∩B| - |B∩C| - |A∩C| + |A∩B∩C|
            long count = mid / a + mid / b + mid / c
                    - mid / lcmAB - mid / lcmBC - mid / lcmAC
                    + mid / lcmABC;

            // If count >= n, the answer is at mid or smaller
            if (count >= n) {
                right = mid;
            } else {
                // Otherwise, search in the upper half
                left = mid + 1;
            }
        }

        return (int) left;
    }

    /**
     * Calculate Greatest Common Divisor using Euclidean algorithm.
     *
     * @param a First number
     * @param b Second number
     * @return GCD of a and b
     */
    private long gcd(long a, long b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    /**
     * Calculate Least Common Multiple using the formula: LCM(a,b) = a*b / GCD(a,b).
     *
     * @param a First number
     * @param b Second number
     * @return LCM of a and b
     */
    private long lcm(long a, long b) {
        return a * b / gcd(a, b);
    }
}