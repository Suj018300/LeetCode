class Solution {
    public boolean isPalindrome(String s) {
        int i =0;
        int j = s.length() -1;
        s = s.toLowerCase();
        while (i < j) {
            char c = s.charAt(i);
            char d = s.charAt(j);
            if (!isAlpha(c)) {
                i++;
                continue;
            }
            if(!isAlpha(d)) {
                j--;
                continue;
            }
            if (c != d) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public boolean isAlpha(char c) {
        return Character.isLetter(c) || Character.isDigit(c);
    }
}