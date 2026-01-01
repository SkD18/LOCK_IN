class Solution {
    public int[] plusOne(int[] digits) {
        int[] space = new int[digits.length+1];
        int n= digits.length-1;

        //peak last digit -- if less than 9 add 1 and return, unless convert as zero
        for(int i=n;i>=0;i--){
            if(digits[i]<9){
                digits[i]++;
                return digits;
            }
            else {
                digits[i]=0;
            }
        }

        //loop ends only when all value are zero
        //by default integer array values are zero
        //put first digit as 1 as other are zero
        space[0]=1;
        return space;
    }
}