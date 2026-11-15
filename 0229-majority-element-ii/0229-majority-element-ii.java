class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;

        HashMap<Integer, Integer> h1 = new HashMap<>();

        for (int i = 0; i < n; i++) {
            h1.put(nums[i], h1.getOrDefault(nums[i], 0) + 1);
        }

        int div = n / 3;

        List<Integer> ans = new ArrayList<>();

        for (int key : h1.keySet()) {
            if (h1.get(key) > div) {
                ans.add(key);
            }
        }
        return ans;
    }
}