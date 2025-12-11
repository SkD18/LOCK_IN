class Solution {
    public int singleNonDuplicate(int[] nums) {

      if(nums.length==1) return nums[0];
      //eleminating first and last element to remove edge case
      if(nums[0]!=nums[1]) return nums[0];
      if(nums[nums.length-1]!=nums[nums.length-2]) return nums[nums.length-1];

      int l=1;
      int r=nums.length-2;

        while(l<=r){
            int mid = l+(r-l)/2;
        //if adjacent element is not equal then its the element
            if(nums[mid]!=nums[mid-1] && nums[mid]!=nums[mid+1])
            return nums[mid];
        /* if we see odd even indexing
        [1,1,2,3,3,4,4,8,8]
        element left to mid will be in even odd order
        ele right to mid will be in odd even order
        position of elements even odd -- 
        its in left of our mid, so mid lies on right, eleminate left and vice versa 
        ex: [1,1,2,3,3,4,4,8,8], m=4, arr[m]=3
        mid is even, its adjacent right is !=arr[mid], our element relies on left,
        means eleminate right.. thats the main logic
        */
            if((mid%2==1 && nums[mid-1]==nums[mid]) ||
            (mid%2==0 && nums[mid]==nums[mid+1]))
            l=mid+1;
            else 
            r=mid-1;
        }
        return -1;


    }
}