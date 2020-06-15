package easy;

public class LongestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        String pre = "";
        String str = strs[0];
        for (int i = 1; i <= str.length(); i++) {
            pre = str.substring(0, i);
            for (int j = 1; j < strs.length; j++) {
                if (i > strs[j].length() || !pre.equals(strs[j].substring(0, i))) {
                    return str.substring(0, i - 1);
                }
            }
        }
        return pre;
    }
}
