class Solution {
    public boolean isPrefixString(String s, String[] words) {
        int ptr1 = 0;
        boolean flag = true;
        int k = 0;
        for (String w : words) {
            int ptr2 = 0;
            while (ptr2 < w.length()) {
                if (ptr1 >= s.length() || w.charAt(ptr2) != s.charAt(ptr1)) {
                    flag = false;
                    break;
                }
                ptr1++;
                ptr2++;
                if (ptr1 == s.length()) break;
            }
            if (ptr2 == w.length()) k++;
            if (ptr1 == s.length() && ptr2 != w.length()) flag = false;
            if (ptr1 == s.length() || !flag) break;
        }
        if (ptr1 != s.length() || k == 0) flag = false;
        return flag;
    }
}