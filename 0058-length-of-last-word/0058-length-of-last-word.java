class Solution {
    public int lengthOfLastWord(String s) {
        String[] words = s.split(" ");

        int count = 0;
        String lastWord = words[words.length - 1];

        for (int i = 0; i < lastWord.length(); i++) {
            count++;
        }

        return count;
    }
}