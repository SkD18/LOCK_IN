// User function Template for Java

class Solution {
    static int largestPrimeFactor(int n) {
        // code here
        int ans = -1;
            
            // Check for the number of 2s that divide n
            while (n % 2 == 0) 
            {
            ans = 2;
            n /= 2;
            }
            
            // n must be odd at this point, so a skip of 2 (i.e., i = i + 2) can be used
            for (int i = 3; i <= Math.sqrt(n); i += 2) {
            // While i divides n, update n and ans
            while (n % i == 0) {
                ans = i;
                n /= i;
            }
            }
            
            // This condition is to handle the case when n is a prime number
            // greater than 2
            if (n > 2) {
            ans = n;
            }
            
            return ans;
    }
}