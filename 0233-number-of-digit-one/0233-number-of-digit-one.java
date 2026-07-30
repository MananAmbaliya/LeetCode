class Solution {
    public int countDigitOne(int n) {
        long factor = 1;
        int count = 0;

        while (factor <= n) {
            long high = n / (factor * 10);
            long curr = (n / factor) % 10;
            long low = n % factor;

            if(curr == 0){
                count+= high * factor;
            }
            else if(curr == 1){
                count+= high * factor + low + 1;
            }
            else{
                count+=(high + 1) * factor;
            }

            factor*=10;
        }

        return count;
    }
}