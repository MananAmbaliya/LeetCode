import java.util.HashMap;

class Solution {
    public String largestWordCount(String[] messages, String[] senders) {

        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < messages.length; i++) {
            String sender = senders[i];
            int words = messages[i].split(" ").length;

            map.put(sender, map.getOrDefault(sender, 0) + words);
        }

        String answer = "";
        int maxWords = 0;

        for (String sender : map.keySet()) {
            int count = map.get(sender);

            if (count > maxWords) {
                maxWords = count;
                answer = sender;
            } else if (count == maxWords && sender.compareTo(answer) > 0) {
                answer = sender;
            }
        }

        return answer;
    }
}