class Solution {
    public void sortInWave(int arr[]) {
        // code here
        int i=0;
        int j=1;

        while(j!=arr.length && i<arr.length){

            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i+=2;
            j = i+1;
        }
    }
}