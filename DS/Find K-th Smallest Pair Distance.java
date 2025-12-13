class Solution {
    /**
     * Finds the k-th smallest distance among all pairs of integers in the array.
     * Uses binary search on the answer space (distance values).
     *
     * @param nums the input array of integers
     * @param k the k-th smallest distance to find (1-indexed)
     * @return the k-th smallest distance
     */
    public int smallestDistancePair(int[] nums, int k) {
        // Sort the array to enable binary search
        Arrays.sort(nums);

        // Binary search on the distance value
        // Minimum possible distance is 0, maximum is the difference between max and min elements
        int minDistance = 0;
        int maxDistance = nums[nums.length - 1] - nums[0];

        while (minDistance < maxDistance) {
            int midDistance = (minDistance + maxDistance) >> 1;  // Equivalent to (minDistance + maxDistance) / 2

            // Count how many pairs have distance <= midDistance
            if (count(midDistance, nums) >= k) {
                // If count >= k, the k-th smallest distance is at most midDistance
                maxDistance = midDistance;
            } else {
                // If count < k, the k-th smallest distance is greater than midDistance
                minDistance = midDistance + 1;
            }
        }

        return minDistance;
    }

    /**
     * Counts the number of pairs in the sorted array with distance <= targetDistance.
     * For each element, uses binary search to find the leftmost element that forms
     * a valid pair (distance <= targetDistance).
     *
     * @param targetDistance the maximum distance to consider
     * @param nums the sorted array of integers
     * @return the count of pairs with distance <= targetDistance
     */
    private int count(int targetDistance, int[] nums) {
        int pairCount = 0;

        // For each element at index i, find all valid pairs where nums[i] is the larger element
        for (int i = 0; i < nums.length; ++i) {
            // Binary search to find the leftmost index where nums[i] - nums[index] <= targetDistance
            int leftIndex = 0;
            int rightIndex = i;

            while (leftIndex < rightIndex) {
                int midIndex = (leftIndex + rightIndex) >> 1;  // Equivalent to (leftIndex + rightIndex) / 2

                // Calculate the minimum value that can form a valid pair with nums[i]
                int minimumValue = nums[i] - targetDistance;

                if (nums[midIndex] >= minimumValue) {
                    // nums[midIndex] can form a valid pair, try to find a smaller index
                    rightIndex = midIndex;
                } else {
                    // nums[midIndex] is too small, search in the right half
                    leftIndex = midIndex + 1;
                }
            }

            // All elements from leftIndex to i-1 can form valid pairs with nums[i]
            pairCount += i - leftIndex;
        }

        return pairCount;
    }
}