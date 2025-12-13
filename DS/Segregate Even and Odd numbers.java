class Solution {
    void segregateEvenOdd(int arr[]) {
        // Step 1: Sort array
        Arrays.sort(arr);

        // Step 2: Create temp array
        int temp[] = new int[arr.length];
        int j = 0;  // pointer for placing numbers

        // Step 3: First put even numbers
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                temp[j] = arr[i];
                j++;
            }
        }

        // Step 4: Then put odd numbers
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                temp[j] = arr[i];
                j++;
            }
        }

        // Step 5: Copy back to original array
        for (int i = 0; i < arr.length; i++) {
            arr[i] = temp[i];
        }


    }
}