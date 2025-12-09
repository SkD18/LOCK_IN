class Solution {
    static int binarySearch(int[] arr, int target) {
        // code here
        //tc = O(logn), sc = O(1)
        int result = Search(arr,target);
        return result;
    }

    static int Search(int[] arr, int target){

        int l=0;
        int r=arr.length-1;
        int ans=-1;

        while(l<=r){
            //fetch the mid of array
            int mid=l+(r-l)/2;

            if(target==arr[mid]){
                ans = mid;//found the target
            }
            else if(target<arr[mid]){
                r=mid-1;//shift right to mid-1
            }
            else{
                l=mid+1;//shift left to mid+1
            }
        }

        return ans;//if nothing found, returns -1
    }
}