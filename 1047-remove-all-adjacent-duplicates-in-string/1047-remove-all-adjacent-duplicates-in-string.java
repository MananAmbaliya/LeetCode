class Solution {
    public String removeDuplicates(String s) {
        ArrayList<Character> charr = new ArrayList<>();

        for (char ch : s.toCharArray()) {
            if (charr.isEmpty() || charr.get(charr.size() - 1) != ch) {
                charr.add(ch);
            } else {
                charr.remove(charr.size() - 1);
            }
        }

        StringBuilder ans = new StringBuilder();

        for (char ch : charr) {
            ans.append(ch);
        }
        return ans.toString();

    }
}