class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l = s.length();
        String str = "";
        int longest = 0;

        for (int i = 0; i < l; i++) {
            char ch = s.charAt(i);

            if (str.indexOf(ch) != -1) {
                int index = str.indexOf(ch);
                str = str.substring(index + 1);
            }

            str = str + ch;
            longest = Math.max(longest, str.length());
        }

        return longest;
    }
}
