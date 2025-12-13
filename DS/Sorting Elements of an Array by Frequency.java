import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
    public static void ans_fun(int[] arr)
    {
        Map<Integer,Integer> mp = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<arr.length;i++)
        {
            mp.put(arr[i],mp.getOrDefault(arr[i],0)+1);
            list.add(arr[i]);
        }
        Collections.sort(list,(n1,n2)->{
            int freq1 = mp.get(n1) ;
            int freq2 = mp.get(n2);
            if(freq1!=freq2) return freq2-freq1; //descending order according to frequency
            return n1-n2; // ascending order according to numbers
        });
        for(int i=0;i<list.size();i++)
        {
            System.out.print(list.get(i)+" ");
        }
        System.out.println();

    }
    public static void main (String[] args) {
//code
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0)
        {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for(int i=0;i<n;i++)
            {
                arr[i] = sc.nextInt();
            }
            ans_fun(arr);
        }
    }
}