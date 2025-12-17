class Solution {
    public int maxChunksToSorted(int[] arr) {
        // Initialize counter for number of chunks and track maximum value seen so far
        int chunkCount = 0;
        int maxValueSoFar = 0;

        // Iterate through each element in the array
        for (int i = 0; i < arr.length; i++) {
            // Update the maximum value encountered up to current index
            maxValueSoFar = Math.max(maxValueSoFar, arr[i]);

            // Check if we can form a chunk at current position
            // A chunk can be formed when the maximum value seen so far equals the current index
            // This means all elements from 0 to i are present in the range [0, i]
            if (i == maxValueSoFar) {
                chunkCount++;
            }
        }

        // Return the total number of chunks that can be formed
        return chunkCount;
    }
}