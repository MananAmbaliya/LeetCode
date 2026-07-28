class Solution {
    public int waysToMakeFair(int[] nums) {

        int rightEven = 0;
        int rightOdd = 0;

        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0)
                rightEven += nums[i];
            else
                rightOdd += nums[i];
        }

        int leftEven = 0;
        int leftOdd = 0;
        int ans = 0;

        for (int i = 0; i < nums.length; i++) {

            if (i % 2 == 0)
                rightEven -= nums[i];
            else
                rightOdd -= nums[i];

            int even = leftEven + rightOdd;
            int odd = leftOdd + rightEven;

            if (even == odd)
                ans++;

            if (i % 2 == 0)
                leftEven += nums[i];
            else
                leftOdd += nums[i];
        }

        return ans;
    }
}