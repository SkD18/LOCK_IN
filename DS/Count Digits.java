// User function Template for Java

class Solution {
    static int evenlyDivides(int n) {
        // code here
        int sum=0;
        int temp =n;
        while(n!=0)
        {
            int s = n%10;
            n =n/10;
            if(s!=0 && temp%s==0)
            sum++;
        }
        return sum;
    }
}