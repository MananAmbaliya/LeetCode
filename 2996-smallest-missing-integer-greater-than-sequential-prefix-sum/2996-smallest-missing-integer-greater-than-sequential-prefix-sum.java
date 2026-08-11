class Solution {

    public int missingInteger(int[] nums) {
        int sum = nums[0];
        int n=nums.length;

        for (int i = 0; i < n - 1; i++) {
            if (nums[i + 1] == nums[i] + 1) {
                sum += nums[i + 1];
            } else {
                break;
            }
        }

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, 1);
        }

        while (map.containsKey(sum)) {
            sum++;
        }


        return sum;

    }
}