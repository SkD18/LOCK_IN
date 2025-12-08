// User function Template for Java
class Solution {

    String reverseEqn(String S) {
        // your code here
       /*char[] arr = S.toCharArray();
        for(int i=0; i<S.length()/2; i++)
        {
            char temp = arr[i];
            arr[i] = arr[S.length()-i-1];
            arr[S.length()-i-1] = temp;
        }
        
     return new String(arr);*/
     
          List<String> tokens = new ArrayList<>();
        int n = S.length();
        int i = 0;

        // 1. Tokenization: Break the string into numbers and operators
        while (i < n) {
            char currentChar = S.charAt(i);

            // If it's an operator (+, -, *, /)
            if (currentChar == '+' || currentChar == '-' || currentChar == '*' || currentChar == '/') {
                tokens.add(String.valueOf(currentChar));
                i++;
            } 
            // If it's a digit, read the entire number
            else if (Character.isDigit(currentChar)) {
                StringBuilder number = new StringBuilder();
                // Keep appending digits until a non-digit character is found or the end of the string is reached
                while (i < n && Character.isDigit(S.charAt(i))) {
                    number.append(S.charAt(i));
                    i++;
                }
                tokens.add(number.toString());
            } 
            // Handle any other characters (though the problem guarantees only numbers and operators)
            else {
                i++;
            }
        }

        // 2. Reverse the Token List
        Collections.reverse(tokens);

        // 3. Concatenation: Join the tokens back into a single string
        StringBuilder result = new StringBuilder();
        for (String token : tokens) {
            result.append(token);
        }

        return result.toString();
    }
}