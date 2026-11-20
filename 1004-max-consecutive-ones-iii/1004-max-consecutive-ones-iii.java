class Solution {
    public int longestOnes(int[] nums, int k) {
        int n = nums.length;
        int count = 0;
        int maxlen = 0;
        int l = 0;

        for (int i = 0; i < n; i++) {

            if (nums[i] == 0) {
                count++;
            }

            while (count > k) {
                if (nums[l] == 0) {
                    count--;
                }
                l++;
            }

            maxlen = Math.max(maxlen, i - l + 1);
        }

        return maxlen;
    }
}