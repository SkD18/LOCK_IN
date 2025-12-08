// User function Template for Java
class Solution {
    static ArrayList<Integer> getTable(int n) {
        // code here
        int[] arr = new int[10];
        
        for(int i=0; i<arr.length; i++)
        {
            arr[i] = n * (i+1);
        }
        
        ArrayList<Integer> r = new ArrayList<>();
        for(int j=0; j<arr.length; j++)
        {
            r.add(arr[j]);
        }
        
        return r;
        
    }
}