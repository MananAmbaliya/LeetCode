int missingNumber(int* nums, int numsSize) {
    int m=0;
    for(int i=0;i<numsSize;i++){
        for(int j=0;j<numsSize;j++){
            if(nums[j]==m){
                m++;
            }
            
        }
    }
    return m;
}