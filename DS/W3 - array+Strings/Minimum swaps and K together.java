int minSwap(int arr[], int n, int k) {
    // Complet the function

    //1. First of all we have to find which numbers are less than equal
    // to k.
    int count = 0;
    for(int i=0;i<n;i++){
        if(arr[i]<=k){
            count = count+1;
        }
    }
    //Now those numbers which are greater than k, are being called
    //bad numbers.
    int bad = 0;
    for(int i=0;i<count;i++){
        if(arr[i]>k){
            bad = bad+1;
        }
    }

    int ans = bad;

    for(int i=0, j = count;j<n;++i,++j){
        if(arr[i]>k){
            --bad;
        }
        if(arr[j]>k){
            ++bad;
        }
        ans = min(ans,bad);
    }
    return ans;
}