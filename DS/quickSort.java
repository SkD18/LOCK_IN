class Solution {
    static void quickSort(int[] arr, int low, int high) {
        // code here
        //base case
        if(low>=high) return;
        
        int pivot=partition(arr,low,high);
        
        quickSort(arr,low,pivot-1);
        
        quickSort(arr,pivot+1,high);
        
        
    }

    private static int partition(int[] arr, int low, int high) {
        
        // they asked pivot as last element
        int pivot = arr[high];
         int count=0;

         //counting elements less than pivot
         for(int i=low; i<high;i++){
             if(arr[i]<=pivot){
                 count++;
             }
         }

         //new pivotIndex
        int pivotIndex=low+count;

        //swap current pivot with value @ pivotIndex
        int temp = arr[pivotIndex];
        arr[pivotIndex]=arr[high];
        arr[high]=temp;
        
        int i=low;
        int j=high;
        
        //left side less than pivot, righ side more than pivot
        while(i<pivotIndex && j>pivotIndex){
            
            while(arr[i]<=pivot){
                i++;
            }
            while(arr[j]>pivot){
                j--;
            }
            
            //swap values if found discrepency
            if(i<pivotIndex && j>pivotIndex){
            int temp1 = arr[i];
            arr[i]=arr[j];
            arr[j]=temp1; 
            i++;
            j--;
            }
        }

         return pivotIndex;
    }
}