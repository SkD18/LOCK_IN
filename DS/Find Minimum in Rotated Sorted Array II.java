class Solution {
    public int findMin(int[] nums) {
        int l=0;
        int r= nums.length-1;
/*
If nums[mid] > nums[r], 
the minimum element must be in the right half (mid+1 to r),
 as the left half is sorted and nums[mid] 
 is greater than nums[r], indicating a rotation point
  after mid.
If nums[mid] < nums[r], the minimum element is 
in the left half (l to mid), including mid, because 
the right part is sorted and nums[mid] is smaller than 
nums[r].
*/
        while(l<r){
            int mid=l+(r-l)/2;
            
            if(nums[mid]>nums[r]) 
                l=mid+1;
            else if(nums[mid]<nums[r])
                 r=mid;
            else 
                r--;
        }
        return nums[l];
    }
}