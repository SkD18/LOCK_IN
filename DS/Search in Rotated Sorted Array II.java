class Solution {
    public boolean search(int[] nums, int target) {
        int l=0;
        int r=nums.length-1;
    // Intuition: This is a modified binary search for rotated arrays with duplicates.
    // At each step, check mid. If target found, return true.
    // If left half is sorted, decide if target lies in it; else search right.
    // If right half is sorted, decide if target lies in it; else search left.
    // When nums[l] == nums[mid], duplicates make it unclear, so move l++ to shrink search space.

        while(l<=r){
            int mid = l + (r - l) / 2;

            if(target==nums[mid]) return true;

            if(nums[l]<nums[mid]){//left search
                if(target >= nums[l] && target < nums[mid]){
                    r=mid-1;
                }
                else{
                    l=mid+1;
                }
            }
            else if(nums[l]>nums[mid]){  //right search
                if(target <= nums[r] && target > nums[mid]){
                    l=mid+1;
                }
                else{
                    r=mid-1;
                }
            }
            else {
                l++;
            }
        }
        
        return false;
    }
}