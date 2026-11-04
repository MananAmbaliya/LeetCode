class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int low=1;
        int high=0;
        int n=piles.length;

        for(int i=0;i<n;i++){
             if(piles[i]>high){
                high=piles[i];
            }
        }
        int [] arr = new int[n];

        while(low < high ){

            int speed = low + (high-low)/2;

            int hours=0;

            for(int i=0;i<n;i++){
                hours += (piles[i] + speed - 1) / speed;
            }

            if(hours <= h){
                high=speed;
            }
            else{
                low=speed+1;
            }
        }
        return low;
    }
}