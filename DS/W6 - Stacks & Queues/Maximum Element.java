
//https://www.hackerrank.com/challenges/maximum-element/problem
public static List<Integer> getMax(List<String> operations) {
    // Write your code here
    Stack<Integer> stack = new Stack<>();
    Stack<Integer> maxStack = new Stack<>();
    List<Integer> result = new ArrayList<>();
    for (String op : operations) {
        String[] parts = op.split(" ");
        int type = Integer.parseInt(parts[0]);

        if (type == 1) {
            int x = Integer.parseInt(parts[1]);
            stack.push(x);
            if (maxStack.isEmpty() || x >= maxStack.peek()) {
                maxStack.push(x); } }
        else if (type == 2) {
            int removed = stack.pop();
            if (removed == maxStack.peek()) {
                maxStack.pop(); } }
        else if (type == 3) {
            result.add(maxStack.peek()); } }

    return result;

}

}