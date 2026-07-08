int findNumbers(int* nums, int numsSize) {
    int even=0;

    for(int i=0;i<numsSize;i++){
        int count=0;
        int num=nums[i];

        if(num==0)
            count=1;

        while(num!=0){
            num/=10;
            count++;
        }
        if(count%2==0){
            even++;
        }
    }
    return even;
}