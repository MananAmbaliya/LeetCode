class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        int n = pushed.length;
        Stack<Integer> stack = new Stack<>();
        int m = 0;

        for (int i = 0; i < n; i++) {
            stack.push(pushed[i]);

            while (!stack.isEmpty() && stack.peek() == popped[m]) {
                stack.pop();
                m++;
            }
        }

        return stack.isEmpty();
    }
}