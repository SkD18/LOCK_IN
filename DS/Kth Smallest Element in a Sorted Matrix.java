class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int n = matrix.length;
        // Create a list to store all elements from the matrix
        List<Integer> list = new ArrayList<>();

        // Traverse the matrix and add all elements to the list
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                list.add(matrix[i][j]);
            }
        }

        // Sort the list
        Collections.sort(list);

        // The k-1 element in the sorted list is the kth smallest element (0-based index)
        return list.get(k - 1);
    }
}