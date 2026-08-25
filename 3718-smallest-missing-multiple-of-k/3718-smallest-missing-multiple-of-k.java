
class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], 1);
        }

        int j = 1;

        while (true) {
            int multiple = j * k;

            if (!map.containsKey(multiple)) {
                return multiple;
            }

            j++;
        }
    }
}

