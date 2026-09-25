class Solution {
    public int findGCD(int[] nums) {
        Arrays.sort(nums);
        int small=nums[0];
        int large=nums[nums.length-1];

        int divistor=1;

        for(int i=1;i<=small;i++){
            if(small % i == 0 && large % i == 0){
                divistor=i;
            }
        }
        return divistor;
    }
}