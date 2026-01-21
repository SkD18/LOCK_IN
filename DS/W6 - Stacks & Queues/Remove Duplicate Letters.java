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
}
