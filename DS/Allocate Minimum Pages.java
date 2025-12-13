class Solution {
    // Helper function to check if it's possible to allocate books such that
    // no student gets more than 'maxPages'.
    static boolean isPossible(int[] arr, int k, int maxPages) {
        int students = 1;
        int sum = 0;

        for (int pages : arr) {
            // If a single book has more pages than the limit, it's impossible
            if (pages > maxPages) return false;

            // If adding the current book exceeds the limit, assign to the next student
            if (sum + pages > maxPages) {
                students++;
                sum = pages;

                // If the number of students required exceeds k, return false
                if (students > k) return false;
            } else {
                // Add pages to the current student's allocation
                sum += pages;
            }
        }
        return true;
    }

    // Main function to find the minimum of the maximum pages allocated to a student
    static int findPages(int[] arr, int k) {
        int n = arr.length;
        // If students are more than books, allocation is not possible
        if (k > n) return -1;

        int low = Integer.MIN_VALUE;
        int high = 0;

        // Calculate search space:
        // low: Max pages in a single book (minimum possible max pages)
        // high: Sum of all pages (maximum possible max pages)
        for (int pages : arr) {
            low = Math.max(low, pages);
            high += pages;
        }

        int result = -1;
        // Binary search on the answer
        while (low <= high) {
            int mid = low + (high - low) / 2;

            // If allocation is possible with 'mid' pages, try to minimize it further
            if (isPossible(arr, k, mid)) {
                result = mid;
                high = mid - 1;
            } else {
                // If not possible, we need to increase the page limit
                low = mid + 1;
            }
        }
        return result;
    }
}