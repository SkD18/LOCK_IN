class Solution {
    public boolean isPossible(int[] stalls, int k, int minDistance)
    {
        int count = 1;
        int l = 0;
        for(int i = 1; i < stalls.length; i++)
        {
            if(stalls[i] - stalls[l] >= minDistance)
            {
                count++;
                l = i;
            }
            if(count == k) return true;
        }
        return false;
    }
    public int aggressiveCows(int[] stalls, int k) {

        Arrays.sort(stalls);
        int low = 0;
        int high = stalls[stalls.length - 1];

        while(low <= high)
        {
            int mid = (low+high)/2;
            if(isPossible(stalls, k, mid)) low = mid + 1;
            else high = mid - 1 ;
        }

        return low - 1;

    }
}