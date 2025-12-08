// User function Template for Java

class Solution {
    boolean isDigitSumPalindrome(int n) {
        // code here
        String s= String.valueOf(n);
        char[] a= s.toCharArray();
        int sum=0;
        int l=0;
        for(int i=0; i<a.length; i++){
            sum = sum + a[i] - '0';
        }
        String m= String.valueOf(sum);
        char[] b= m.toCharArray();
        int r= b.length-1;
        while (l < r) { 
          if (b[l] != b[r]) {
        return false;
        }
          l++;
          r--;
            
        }
return true;
    }
}