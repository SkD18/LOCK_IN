class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();

        gen(result,"",0,0,n);
        return result;
    }
    void gen(List<String> r, String current, int open, int close, int n){

        //base case
        if(current.length()==n*2){
            r.add(current);
            return;
        }

        //recursive case

        //we can add open parentheses if its count less than n
        //(less cuz we adding base case when equal to n)
        if(open<n){
            gen(r,current+"(",open+1,close,n);
        }

        //we can only add close parentheses if its count less than open ones (
        //(we count close = open in base case)
        if(close<open) {
            gen(r,current+")",open,close+1,n);
        }
    }

}