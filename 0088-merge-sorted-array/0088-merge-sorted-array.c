void merge(int* nums1, int nums1Size, int m, int* nums2, int nums2Size, int n) {
    int sortary[m+n];
    int i=0,j=0,k=0;

    while(i < m && j < n ){

            if(nums1[i]<nums2[j]){
                sortary[k++]=nums1[i++];
            }
            else{
                sortary[k++]=nums2[j++];
            }
    }  

    while(i < m){
        sortary[k++]=nums1[i++];
    }     
    while(j < n){
        sortary[k++]=nums2[j++];
    }

        for (int x = 0; x < m+n; x++) {
        nums1[x] = sortary[x];
    }
}