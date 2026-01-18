import java.util.*;

class Solution {
    public int longestKSubstr(String s, int k) {
        int n = s.length();
        int left = 0, maxLength = -1;
        // Map to store frequency of characters in current window
        Map<Character, Integer> map = new HashMap<>();

        for (int right = 0; right < n; right++) {
            char rChar = s.charAt(right);
            map.put(rChar, map.getOrDefault(rChar, 0) + 1);

            // If unique characters exceed k, shrink the window from the left
            while (map.size() > k) {
                char lChar = s.charAt(left);
                map.put(lChar, map.get(lChar) - 1);
                if (map.get(lChar) == 0) {
                    map.remove(lChar);
                }
                left++;
            }

            // If we have exactly k unique characters, update maxLength
            if (map.size() == k) {
                maxLength = Math.max(maxLength, right - left + 1);
            }
        }

        return maxLength;
    }
}