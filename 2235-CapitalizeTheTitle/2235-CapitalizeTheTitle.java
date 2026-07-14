// Last updated: 7/14/2026, 2:11:16 PM
class Solution {
    public String capitalizeTitle(String title) {
        String[] words = title.split(" ");
        String result = "";

        for (int i = 0; i < words.length; i++) {
            String word = words[i].toLowerCase();

            if (word.length() <= 2) {
                result += word;
            } else {
                result += Character.toUpperCase(word.charAt(0)) + word.substring(1);
            }

            if (i != words.length - 1) {
                result += " ";
            }
        }

        return result;
    }
}