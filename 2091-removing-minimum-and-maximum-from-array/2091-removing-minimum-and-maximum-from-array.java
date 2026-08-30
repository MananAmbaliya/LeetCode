class Solution {
    public int minimumDeletions(int[] nums) {
        int n=nums.length;
        int min=nums[0];
        int max=nums[0];

        int minindex=0;
        int maxindex=0;

        for(int i=1;i<n;i++){
            if(nums[i]<min){
                min=nums[i];
                minindex=i;
            }
            if(nums[i]>max){
                max=nums[i];
                maxindex=i;
            }
        }

        int left=Math.min(minindex,maxindex);
        int right=Math.max(minindex,maxindex);

         int bothLeft = right + 1;
         int bothRight = n - left;

        int oneEach = (left + 1) + (n - right);

        return Math.min(bothLeft, Math.min(bothRight, oneEach));
    }
}