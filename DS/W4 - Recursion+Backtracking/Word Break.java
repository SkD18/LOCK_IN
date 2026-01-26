/*
interview approach :
class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        Set<String> dict = new HashSet<>(wordDict); // O(1) lookup
        int n = s.length();
        boolean[] m = new boolean[n + 1];
        m[0] = true; 

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                if (m[j] && dict.contains(s.substring(j, i))) {
                    m[i] = true;
                    break;
                }
            }
        }

        return m[n];
    }
}*/

//recursive approach
class Solution {

    public boolean wordBreak(String s, List<String> wordDict) {
        Boolean[] memo = new Boolean[s.length()];
        return f(s, wordDict, 0, memo);
        
    }

    boolean f(String s, List<String> wordDict, int idx, Boolean[] memo) {

  
        if (idx == s.length()) return true;


        if (memo[idx] != null) return memo[idx];

        for (String word : wordDict) {

            int len = word.length();


            if (idx + len <= s.length() &&
                s.substring(idx, idx + len).equals(word)) {

                if (f(s, wordDict, idx + len, memo)) {
                    return memo[idx] = true;
                }
            }
        }

        return memo[idx] = false;
    }
}

