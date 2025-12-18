class Solution {
    public int maxCircularSum(int arr[]) {
        // code here
        int maxSoFar = arr[0];
        int max = arr[0];
        int minSoFar = arr[0];
        int min = arr[0];

        int total = arr[0];

        for(int i=1;i<arr.length;i++)
        {
            max = Math.max(arr[i],arr[i]+max);
            maxSoFar = Math.max(maxSoFar,max);

            min = Math.min(arr[i],arr[i]+min);
            minSoFar = Math.min(minSoFar,min);

            total+=arr[i];
        }

        if(maxSoFar<0)
            return maxSoFar;

        return Math.max(maxSoFar,total-minSoFar);

    }
}