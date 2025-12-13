class Solution {
    public int nthMagicalNumber(int n, int a, int b) {
        long mod = 1000000007;
        long lcm = lcm(a, b);
        long low = Math.min(a, b), high = (long) n *
                Math.min(a, b), ans = 0;
        while (low <= high) {
            long mid = low + (high - low) / 2;
            if (count(mid, a, b, lcm) >= n) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return (int) (ans % mod);
    }

    private long count(long x, int a, int b, long lcm) {
        return x / a + x / b - x / lcm;
    }

    private long lcm(int a, int b) {
        return (long) a / gcd(a, b) * b;
    }

    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }
}