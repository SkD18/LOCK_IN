class Solution {
    public int[] selectionSrt(int[] num) {
        int n = num.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (num[j] < num[minIndex]) {
                    minIndex = j;
                }
            }
            // Swap the found minimum element with the first element
            int temp = num[minIndex];
            num[minIndex] = num[i];
            num[i] = temp;
        }
        return num;
    }

    public int[] bubbleSrt(int[] num) {
        int n = num.length;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (num[j] > num[j + 1]) {
                    // Swap num[j] and num[j+1]
                    int temp = num[j];
                    num[j] = num[j + 1];
                    num[j + 1] = temp;
                    swapped = true;
                }
            }
            // If no two elements were swapped in the inner loop, then break
            if (!swapped) {
                break;
            }
        }
        return num;
    }

    //insertion sort
    public int[] insertionSrt(int[] num) {
        int n = num.length;

        for (int i = 1; i < n; i++) {
            int key = num[i];
            int j = i - 1;

            // Move elements of num[0..i-1], that are greater than key,
            // to one position ahead of their current position
            while (j >= 0 && num[j] > key) {
                num[j + 1] = num[j];
                j = j - 1;
            }
            num[j + 1] = key;
        }
        return num;
    }
}