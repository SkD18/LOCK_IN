class Solution {
    //brute
    public int lastStoneWeight(int[] stones) {
        int n = stones.length;

        for (int i = 0; i < n - 1; i++) {
            Arrays.sort(stones);
            int stone1 = stones[n-1];
            int stone2 = stones[n-2];

            stones[n-1] = stone1 - stone2;
            stones[n-2] = 0;
        }
        Arrays.sort(stones);
        return stones[n-1];
    }
    //priority queue :
    /**
     class Solution {
     public int lastStoneWeight(int[] stones) {
     // Create a Max-Heap using a PriorityQueue with reverse order
     PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

     // Add all stones to the heap - O(n log n)
     for (int stone : stones) {
     maxHeap.add(stone);
     }

     // Process stones until 1 or 0 remain - O(n log n)
     while (maxHeap.size() > 1) {
     int stone1 = maxHeap.poll(); // Heaviest
     int stone2 = maxHeap.poll(); // Second heaviest

     if (stone1 != stone2) {
     maxHeap.add(stone1 - stone2);
     }
     }

     // Return the weight of the last stone, or 0 if none left
     return maxHeap.isEmpty() ? 0 : maxHeap.poll();
     }
     }

     */
}