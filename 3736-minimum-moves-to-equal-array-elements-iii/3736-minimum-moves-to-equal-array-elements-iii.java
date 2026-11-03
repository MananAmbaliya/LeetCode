class Solution {
    public int minMoves(int[] nums) {
        int n=nums.length;
        int ans=0;
        int max=0;
        for(int i=0;i<n;i++){
            if(nums[i]>max){
                max=nums[i];
            }
        }

        for(int i=0;i<n;i++){
            ans+=(max-nums[i]);
        }
        return ans;
    }
}