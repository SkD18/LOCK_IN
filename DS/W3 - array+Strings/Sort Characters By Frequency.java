class Solution {
    public String frequencySort(String s) {
        // Create a frequency map to count occurrences of each character
        // Initial capacity of 52 for uppercase and lowercase letters
        Map<Character, Integer> frequencyMap = new HashMap<>(52);

        // Count the frequency of each character in the string
        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            frequencyMap.merge(currentChar, 1, Integer::sum);
        }

        // Create a list of unique characters from the frequency map
        List<Character> uniqueChars = new ArrayList<>(frequencyMap.keySet());

        // Sort characters in descending order by their frequency
        uniqueChars.sort((char1, char2) -> frequencyMap.get(char2) - frequencyMap.get(char1));

        // Build the result string by appending each character based on its frequency
        StringBuilder result = new StringBuilder();
        for (char character : uniqueChars) {
            int frequency = frequencyMap.get(character);
            // Append the character 'frequency' times to the result
            for (int count = 0; count < frequency; count++) {
                result.append(character);
            }
        }

        // Return the final sorted string
        return result.toString();
    }
}