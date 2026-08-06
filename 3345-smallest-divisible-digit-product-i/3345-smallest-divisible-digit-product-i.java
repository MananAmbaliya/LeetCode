class Solution {
    public int smallestNumber(int n, int t) {
        int num = n;

        while (true) {
            int ans = 1; 
            int temp = num;

            while (temp != 0) {
                int rem = temp % 10;
                ans *= rem;
                temp /= 10;
            }

            if (ans % t == 0) {
                return num;
            }

            num++;
        }
    }
}