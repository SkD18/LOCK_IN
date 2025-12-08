class Solution {
    public int countPrimes(int n) {
      // Edge case: no primes less than 2
        if (n <= 2) {
            return 0;
        }
      
        // Initialize boolean array to track prime status
        // isPrime[i] represents whether number i is prime
        boolean[] isPrime = new boolean[n];
        Arrays.fill(isPrime, true);
      
        // 0 and 1 are not prime numbers
        isPrime[0] = false;
        isPrime[1] = false;
      
        int primeCount = 0;
      
        // Sieve of Eratosthenes: iterate through numbers starting from 2
        for (int i = 2; i < n; i++) {
            // If current number is prime
            if (isPrime[i]) {
                primeCount++;
              
                // Mark all multiples of i as non-prime
                // Optimization: start from i * i instead of i + i
                if ((long) i * i < n) {
                    for (int j = i * i; j < n; j += i) {
                        isPrime[j] = false;
                    }
                }
            }
        }
      
        return primeCount;   
    }
}