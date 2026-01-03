class Solution {
    public double myPow(double x, int n) {

        long b = n;
        double a = 1.0;
/**
 *  2^10 == (2*2)^5
 *  4^5 == 4 * 4^4     <<  returning 256 for 4^4
 *  4^4 == (4*4)^2       |
 *  16^2 == (16*16)^1    |
 *  256^1 == 256 * 256^0 >>
 */
        /
        if(b<0) b= -1 * b;

        while(b>0){
            if(b%2==1){
                a=a*x;
                b=b-1;
            }
            else {
                x=x*x;
                b=b/2;
            }
        }
        if(n<0) a=1/a;

        return a;

    }
}