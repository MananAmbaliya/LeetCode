/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* runningSum(int* nums, int numsSize, int* returnSize) {
    *returnSize=numsSize;

    int *ans=malloc(numsSize * sizeof(int));

    for(int i=0;i<numsSize;i++){
        int temp=0;
        for(int j=0;j<=i;j++){
            temp+=nums[j];
        }
        ans[i]=temp;
    }
    return ans;
}