class Solution {
    public String removeDuplicateLetters(String s) {
        int[] count = new int[26];
        boolean[] seen = new boolean[26];
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            count[c - 'a']++;
        }

        for (char c : s.toCharArray()) {
            count[c - 'a']--;
            if (seen[c - 'a']) continue;

            while (!stack.isEmpty() && c < stack.peek() && count[stack.peek() - 'a'] > 0) {
                seen[stack.pop() - 'a'] = false;
            }

            stack.push(c);
            seen[c - 'a'] = true;
        }

        StringBuilder sb = new StringBuilder();
        for (char c : stack) sb.append(c);
        return sb.toString();
    }
    /***
     * sliding window approach :
     * class Solution {
     *     public String removeDuplicateLetters(String s) {
     *
     *         int[] freq = new int[26];
     *         boolean[] used = new boolean[26];
     *
     *         for (char c : s.toCharArray()) {
     *             freq[c - 'a']++;
     *         }
     *
     *         StringBuilder res = new StringBuilder();
     *
     *         for (char c : s.toCharArray()) {
     *             freq[c - 'a']--;
     *
     *             if (used[c - 'a']) continue;
     *
     *             while (res.length() > 0) {
     *                 char last = res.charAt(res.length() - 1);
     *
     *                 if (last > c && freq[last - 'a'] > 0) {
     *                     used[last - 'a'] = false;
     *                     res.deleteCharAt(res.length() - 1);
     *                 } else {
     *                     break;
     *                 }
     *             }
     *
     *             res.append(c);
     *             used[c - 'a'] = true;
     *         }
     *
     *         return res.toString();
     *     }
     * }
     */
    /
}
