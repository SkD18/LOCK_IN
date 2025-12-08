// User function Template for Java

class Solution {
    static int countSquares(int n) {
        // code here
      /* HashMap<Integer,Integer> hm 
       = new HashMap<>();
       
       int c=0; 
        
        for(int i=1; i<n ; i++)
        {
            hm.put(i,i*i);
            if(hm.containsValue(i))
            c++;
        }
        return c;*/
        
       int c =0;
       for(int i=1; i*i<n; i++)
       {
           if(i*i<n)
           c++;
       }
    return c;
    }
}