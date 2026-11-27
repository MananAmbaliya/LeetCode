class Solution {
    public int maxArea(int[] height) {
        int n=height.length;
        int l=0;
        int r=n-1;
        int dis=0;
        int maxdis=0;

        while(l<r){
            dis=((r - l) * Math.min(height[l], height[r]));

            maxdis=Math.max(maxdis,dis);

            if(height[l]<height[r]){
                l++;
            }
            else{
                r--;
            }
        }
        return maxdis;
    }
}