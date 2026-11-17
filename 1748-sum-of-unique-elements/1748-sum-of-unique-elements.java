class Solution {
    public int sumOfUnique(int[] nums) {
        int ans = 0;
        int[] arr = new int[101];

        for (int i = 0; i < nums.length; i++) {
            arr[nums[i]]++;
        }

        for (int i = 0; i < nums.length; i++) {
            if(arr[nums[i]]==1){
                ans+=nums[i];
            }
        }

        return ans;
    }
}