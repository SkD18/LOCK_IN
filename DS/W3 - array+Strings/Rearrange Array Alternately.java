class Solution {
    public void rearrange(int arr[]) {
        // code here
        Arrays.sort(arr);
        int[] in = new int[arr.length];
        int k = arr.length-1;
        int j=0;
        int h =0;
        while(j<k){
            in[h++] = arr[k];
            k--;
            in[h++] = arr[j];
            j++;
        }
        if(arr.length%2!=0){
            in[h] = arr[j];
        }
        for(int i=0;i<arr.length;i++){
            arr[i] = in[i];
        }
    }
}