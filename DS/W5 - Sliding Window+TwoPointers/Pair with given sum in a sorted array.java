// User function Template for Java

class Solution {

    int countPairs(int arr[], int target) {
        // Complete the function
        int l=0;
        int r=arr.length-1;
        int c=0;

        while(l<r){
            int sum=arr[l]+arr[r];

            if(sum<target){
                l++;
            }
            else if(sum>target){
                r--;
            }

            else{ //sum==target

                int el1=arr[l];
                int el2=arr[r];
                int c1=0;
                int c2=0;
                while(l<=r && arr[l]==el1){
                    c1++;
                    l++;
                }
                while(l<=r && arr[r]==el2){
                    c2++;
                    r--;
                }
                //there are two condn.
                //cond1: if arr[l]==arr[r]
                //means all in between are dupl, handshake formula
                //2,2,2,2,2
                if(el1==el2){
                    c+=(c1*(c1-1))/2;
                }
                //cond2: two distint numbers but each have dupl
                //2,2,3,3,3
                else {
                    c+=c1*c2;
                }
            }
        }

        return c;
    }
}
