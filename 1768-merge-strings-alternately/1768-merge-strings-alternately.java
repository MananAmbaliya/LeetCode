class Solution {
    public String mergeAlternately(String word1, String word2) {
        int n = word1.length() + word2.length();
        char[] ans = new char[n];

        int l1 = word1.length();
        int l2 = word2.length();

        int m = 0;

        for (int i = 0; i < n; i++) {
            if (i < l1) {
                ans[m++] = word1.charAt(i);
            }

            if (i < l2) {
                ans[m++] = word2.charAt(i);
            }
        }

        return new String(ans);
    }
}