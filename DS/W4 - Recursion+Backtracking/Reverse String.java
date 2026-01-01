class Solution {
    public void reverseString(char[] s) {
        //approach 1 : two pointer, tc o(n) sc o(1)
        /*
        int l=0;
        int r=s.length-1;

        while(l<r){
            char t=s[l];
            s[l]=s[r];
            s[r]=t;
            l++;
            r--;
        }
        */

        //approach 2: recursion tc o(n) sc o(n)
        rev(s,0,s.length-1);
    }

    void rev(char[] s, int l, int r){
        if(l>=r)
            return;

        char t=s[l];
        s[l]=s[r];
        s[r]=t;

        rev(s,l+1,r-1);

    }
}