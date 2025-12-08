class Solution {
    public int prime_Sum(int n) {
        // code here
        int sum=0;
       for(int i=2;i<=n;i++)
       {
           if(isPrime(i))
           {
               sum+=i;
           }
       }
        return sum;
    }
    static boolean isPrime(long n)
    {
        if(n==1)return false;
         for(int i=2;i<=Math.sqrt(n);i++)
         {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;
    }
}