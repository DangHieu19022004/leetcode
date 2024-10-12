import java.util.HashSet;

class longestSubstring {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int maxLength = 0;
        int left = 0;  // Left pointer of the sliding window
        HashSet<Character> set = new HashSet<>();

        for (int right = 0; right < n; right++) {
            // If we encounter a repeating character, shrink the window from the left
            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }
            // Add the new character and update the maximum length
            set.add(s.charAt(right));
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }

    // Hàm main để chạy chương trình
    public static void main(String[] args) {
        longestSubstring solution = new longestSubstring();

        // Test case 1
        String s1 = "abcabcbb";
        System.out.println("Length of longest substring without repeating characters in '" + s1 + "': " + solution.lengthOfLongestSubstring(s1));

        // Test case 2
        String s2 = "bbbbb";
        System.out.println("Length of longest substring without repeating characters in '" + s2 + "': " + solution.lengthOfLongestSubstring(s2));

        // Test case 3
        String s3 = "pwwkew";
        System.out.println("Length of longest substring without repeating characters in '" + s3 + "': " + solution.lengthOfLongestSubstring(s3));
    }

}
