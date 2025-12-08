// User function Template for Java
class Solution {
    static boolean armstrongNumber(int n) {
        // code here
        int temp = n;
        int m=0;
        int A=0;
        
        while(n!=0)
        {
            int c= n%10;
            m = c*c*c;
            A= A+m;
            n=n/10;
        }
        
        if(temp == A)
        return true;
        
        return false;
    }
}