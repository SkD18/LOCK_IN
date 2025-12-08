class Main {
    public static void main(String[] args) {
        int[] arr = {38, 27, 43, 9, 9, 82, 10};
        //Solution sorter = new Solution();

        System.out.println("Original array:");
        printArray(arr);

        mergeSort(arr, 0, arr.length - 1);

        System.out.println("Sorted array:");
        printArray(arr);
    }

    static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    static void mergeSort(int arr[], int l, int r) {
        // Recursively splits array into halves, sorts each half,
        // then merges them back in sorted order.        

        // base case
        if (l >= r) {
            return;
        }
        int mid = (l + r) / 2;

        mergeSort(arr, l, mid);
        mergeSort(arr, mid + 1, r);

        // merge two sorted arrays
        merge(arr, l, mid, r);
    }

    // Fixed merge method signature to accept mid as parameter
    static void merge(int[] arr, int l, int mid, int r) {
        int n1 = mid - l + 1;
        int n2 = r - mid;

        int[] left = new int[n1];
        int[] right = new int[n2];

        // adding values of each array
        int mainIndex = l;
        for (int i = 0; i < n1; i++) {
            left[i] = arr[mainIndex++];
        }

        mainIndex = mid + 1;
        for (int j = 0; j < n2; j++) {
            right[j] = arr[mainIndex++];
        }

        int i = 0;
        int j = 0;
        mainIndex = l;

        // sort elements from subarrays then add it to main array
        while (i < n1 && j < n2) {
            if (left[i] < right[j]) {
                arr[mainIndex++] = left[i++];
            } else {
                arr[mainIndex++] = right[j++];
            }
        }

        // if there are extra elements from each array 
        // just add it in main array
        while (i < n1) {
            arr[mainIndex++] = left[i++];
        }
        while (j < n2) {
            arr[mainIndex++] = right[j++];
        }
    }
}