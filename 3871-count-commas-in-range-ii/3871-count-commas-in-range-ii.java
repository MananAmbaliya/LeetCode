class Solution {
    public long countCommas(long n) {
        long ans = 0;
        long start = 1000;
        long commas = 1;

        while (start <= n) {
            long end;

            if (start > Long.MAX_VALUE / 1000) {
                end = Long.MAX_VALUE;
            } else {
                end = start * 1000 - 1;
            }

            long upper = Math.min(n, end);

            if (upper >= start) {
                ans += (upper - start + 1) * commas;
            }

            if (start > Long.MAX_VALUE / 1000) {
                break;
            }

            start *= 1000;
            commas++;
        }

        return ans;
    }
}