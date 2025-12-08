class Solution {
    public static int[] lcmAndGcd(int a, int b) {
        // code here
        int r;
        int temp1 =a;
        int temp2 =b;
        
        while(b!=0)
        {
            r = a%b;
            a=b;
            b=r;
            
        }
        int gcd = a;
        int lcm = temp1*temp2/gcd;
        int[] arr = new int[]{lcm, gcd};
        return arr;
        
    }
}