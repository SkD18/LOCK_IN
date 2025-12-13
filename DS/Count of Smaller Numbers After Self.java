class Solution {
    public List<Integer> countSmaller(int[] nums) {
        int n = nums.length;
        Integer[] result = new Integer[n];
        Arrays.fill(result, 0);

        int[] idx = new int[n];
        for (int i = 0; i < n; i++) idx[i] = i;

        mergeSort(nums, idx, result, 0, n);
        return Arrays.asList(result);
    }

    private void mergeSort(int[] nums, int[] idx, Integer[] res, int l, int r) {
        if (r - l <= 1) return;
        int m = (l + r) / 2;
        mergeSort(nums, idx, res, l, m);
        mergeSort(nums, idx, res, m, r);

        int[] tmp = new int[r - l];
        int i = l, j = m, k = 0;
        int rightTaken = 0;

        while (i < m && j < r) {
            if (nums[idx[i]] <= nums[idx[j]]) {
                res[idx[i]] += rightTaken;
                tmp[k++] = idx[i++];
            } else {
                tmp[k++] = idx[j++];
                rightTaken++;
            }
        }
        while (i < m) {
            res[idx[i]] += rightTaken;
            tmp[k++] = idx[i++];
        }
        while (j < r) {
            tmp[k++] = idx[j++];
        }
        System.arraycopy(tmp, 0, idx, l, r - l);
    }
}