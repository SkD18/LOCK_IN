class Solution {
    public int[] searchRange(int[] nums, int target) {
        //used two binary searches
        //first one for leftmost element
        //second one for rightmost element
        //used flag to separate each flow
        //TC: O(logn+logn)= O(logn), SC : O(1)
        int ind1=binarySearch(nums,target,false);
        int ind2=binarySearch(nums,target,true);
        int[] result =new int[]{ind1,ind2};
        return result;
    }

    int binarySearch(int[] arr, int target, boolean flag){

        int l=0;
        int r=arr.length-1;
        int ans=-1;

        while(l<=r){

            int mid = l + (r-l) / 2;

            if(target==arr[mid] && flag==false){
                ans=mid;
                r=mid-1;// to search leftmost 
            }
            else if(target==arr[mid] && flag==true){
                ans=mid;
                l=mid+1;//to search rightmost
            }
            else if(target<arr[mid]){
                r=mid-1;
            }
            else {
                l=mid+1;
            }

        }
        
        return ans;
    }
}