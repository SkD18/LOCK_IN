class Solution {

    void printNos(int N) {
        // code here
        printN(N);
    }

    void printN(int n){
        if(n==1) {
            System.out.print(n);
            return;
        }

        System.out.print(n + " ");
        printN(n-1);
    }
}