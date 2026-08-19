import java.util.Stack;

class Solution {
    public int calPoints(String[] operations) {

        Stack<Integer> s = new Stack<>();

        for (String c : operations) {

            if (c.equals("C")) {
                s.pop();
            }

            else if (c.equals("D")) {
                s.push(s.peek() * 2);
            }

            else if (c.equals("+")) {
                int last = s.pop();
                int secondLast = s.peek();

                s.push(last);
                s.push(last + secondLast);
            }

            else {
                s.push(Integer.parseInt(c));
            }
        }

        int sum = 0;

        while (!s.isEmpty()) {
            sum += s.pop();
        }
        return sum;
    }
}