class Solution {
    public int searchInsert(int[] nums, int target) {
        int result=binarySearch(nums,target);
        return result;
    }

    int binarySearch(int[] nums, int target){
        int l=0;
        int r=nums.length-1;

        while(l<=r){

            int mid=l+(r-l)/2;

            if(target==nums[mid]){
                return mid;
            }
            else if(target<nums[mid]){
                r=mid-1;
            }
            else{
                l=mid+1;
            }
        }
        return l;// l will be mid+1 after loop ends
        //  thus its correct index for the qs
    }
}