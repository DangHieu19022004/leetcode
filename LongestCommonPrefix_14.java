public class LongestCommonPrefix_14 {
   public String longestCommonPrefix(String[] strs) {
    if (strs == null || strs.length == 0) {
        return "";
    }
    String commonStr = strs[0];
    for (int i = 1; i < strs.length; i++) {
        while (!strs[i].startsWith(commonStr)) {
            commonStr = commonStr.substring(0, commonStr.length() - 1);
            if (commonStr.isEmpty()) {
                return "";
            }
        }
    }
    return commonStr;
}

    public static void main(String[] arr) {
    String[] strs = { "flower", "flow", "flight" };
    LongestCommonPrefix_14 solution = new LongestCommonPrefix_14();
    System.out.println(solution.longestCommonPrefix(strs));
}
}

