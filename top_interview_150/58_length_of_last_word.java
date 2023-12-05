// 58. Length of Last Word
// https://leetcode.com/problems/length-of-last-word/

class Solution {
    public int lengthOfLastWord(String s) {
        int count = 0;

        for (int i = s.length() - 1; i > -1; i--) {
            if (s.charAt(i) == ' ') {
                if (count > 0) break; // found last word

                count = 0;
            } else {
                count += 1;
            }
        }

        return count;
    }
}