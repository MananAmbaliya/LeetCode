
import java.util.*;

class Solution {
    public String digitSum(String s, int k) {

        while (s.length() > k) {

            List<Integer> l1 = new ArrayList<>();
            int ans = 0;
            int count = 0;

            for (int i = 0; i < s.length(); i++) {

                int digit = s.charAt(i) - '0';

                ans += digit;
                count++;

                if (count == k || i == s.length() - 1) {
                    l1.add(ans);
                    count = 0;
                    ans = 0;
                }
            }

            StringBuilder sb = new StringBuilder();

            for (int i = 0; i < l1.size(); i++) {
                sb.append(l1.get(i));
            }

            s = sb.toString();
        }

        return s;
    }
}
