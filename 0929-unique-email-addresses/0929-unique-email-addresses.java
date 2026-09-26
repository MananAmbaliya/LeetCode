class Solution {
    public int numUniqueEmails(String[] emails) {

        HashSet<String> set = new HashSet<>();

        for (int i = 0; i < emails.length; i++) {

            String email = emails[i];

            String[] parts = email.split("@");

            String local = parts[0];
            String domain = parts[1];

            int plusIndex = local.indexOf('+');

            if (plusIndex != -1) {
                local = local.substring(0, plusIndex);
            }

            local = local.replace(".", "");

            String finalEmail = local + "@" + domain;

            set.add(finalEmail);
        }

        return set.size();
    }
}