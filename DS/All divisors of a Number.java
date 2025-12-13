import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public static void print_divisors(int n) {
        ArrayList<Integer> ar = new ArrayList<>();
        for(int i=1; i*i<=n; i++){
            if(n%i==0)
            {
                ar.add(i);
                int d= n/i;
                if(i!=d) ar.add(d);
            }
        }
        Collections.sort(ar);
        for(int e:ar)
        System.out.print(e+" ");
    }
}