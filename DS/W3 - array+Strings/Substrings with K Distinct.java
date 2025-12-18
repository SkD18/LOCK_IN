class Solution {
    int countSubstr(String s, int k) {
        // your code here
        int start=0,end=0,n=s.length(),count=0,subs=0;
        int arr[]=new int[26];
        while(end<n)
        {
            char c=s.charAt(end);
            int i=c-'a';
            if(arr[i]==0)
            {
                arr[i]++;
                count++;
                end++;
            }
            else if(arr[i]>0)
            {
                arr[i]++;
                end++;
            }
            if(k==count)
                subs++;
            else if(count>k)
            {
                Arrays.fill(arr,0);
                start++;
                count=0;
                end=start;
            }
            if(end==n && start<end)
            {
                Arrays.fill(arr,0);
                start++;
                end=start;
                count=0;
            }
        }
        return subs;
    }
}