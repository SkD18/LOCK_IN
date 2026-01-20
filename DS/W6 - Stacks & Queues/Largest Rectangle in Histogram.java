class Solution {
    public int largestRectangleArea(int[] heights) {

        int maxArea = 0;
        int n = heights.length;

        Deque<Integer> stack = new ArrayDeque<>();
        int[] left = new int[n];
        int[] right = new int[n];
        Arrays.fill(right, n);

        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && heights[stack.peek()] >= heights[i]) {
                right[stack.pop()] = i;
            }

            // The remaining top of stack (if exists) is the left boundary for current element
            left[i] = stack.isEmpty() ? -1 : stack.peek();

            // Push current index to stack
            stack.push(i);
        }

        // Calculate the maximum rectangle area for each bar as the minimum height
        for (int i = 0; i < n; i++) {
            // Width of rectangle with heights[i] as the minimum height
            int width = right[i] - left[i] - 1;
            int area = heights[i] * width;
            maxArea = Math.max(maxArea, area);
        }

        return maxArea;

        /*int maxRectangle=0;

        for(int i=0;i<heights.length;i++){
            int minbar=heights[i];
             for(int j=i;j<heights.length;j++){
               minbar=Math.min(minbar,heights[j]);
               int width= j-i+1;
                int currRectangle = width*minbar;
                maxRectangle=Math.max(maxRectangle,currRectangle);
            }
        }
        return maxRectangle;*/
    }
}