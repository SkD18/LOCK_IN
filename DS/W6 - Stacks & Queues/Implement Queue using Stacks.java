import java.util.Stack;

class MyQueue {
    private Stack<Integer> input;
    private Stack<Integer> output;

    public MyQueue() {
        input = new Stack<>();
        output = new Stack<>();
    }

    // Push element x to the back of queue
    public void push(int x) {
        input.push(x);
    }

    // Removes the element from the front of queue and returns it
    public int pop() {
        shiftStacks();
        return output.pop();
    }

    // Get the front element
    public int peek() {
        shiftStacks();
        return output.peek();
    }

    // Returns whether the queue is empty
    public boolean empty() {
        return input.isEmpty() && output.isEmpty();
    }

    // Helper method to move elements from input to output stack
    private void shiftStacks() {
        // Only shift if output stack is empty
        if (output.isEmpty()) {
            while (!input.isEmpty()) {
                output.push(input.pop());
            }
        }
    }
}