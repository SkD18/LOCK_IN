class Solution {
    boolean twoSum(int arr[], int target) {
        // code here
        HashSet<Integer> set = new HashSet<>();

        for(int a : arr) {
            int res = target - a;
            if(set.contains(res)) {
                return true;
            }
            set.add(a);
        }
        return false;
    }
}

/**
 * two pointers :
 * class Solution {
 *     boolean twoSum(int arr[], int target) {
 *         // code here
 *         int l=0;
 *         int r=arr.length-1;
 *         boolean b=false;
 *         Arrays.sort(arr);
 *
 *         while(l<r){
 *              int sum=arr[l]+arr[r];
 *
 *             if(sum==target){
 *                 return true;
 *             } else if(sum<target){
 *                 l++;
 *             } else {
 *                 r--;
 *             }
 *
 *         }
 *
 *         return b;
 *     }
 * }
 *
 *
 * */