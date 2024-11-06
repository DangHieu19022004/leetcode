import java.util.*;
class LongestPalindromicSubstirng{
 // Function to check if a substring s[low..high] is a palindrome
 static String longestPalSubstr(String s) {
    int n = s.length();
    boolean[][] dp = new boolean[n][n];

    // All substrings of length 1 are palindromes
    int maxLen = 1;
    int start = 0;

    for (int i = 0; i < n; ++i)
        dp[i][i] = true;

    // Check for sub-string of length 2
    for (int i = 0; i < n - 1; ++i) {
        if (s.charAt(i) == s.charAt(i + 1)) {
            dp[i][i + 1] = true;
            start = i;
            maxLen = 2;
        }
    }

    // Check for lengths greater than 2
    for (int k = 3; k <= n; ++k) {
        for (int i = 0; i < n - k + 1; ++i) {
            int j = i + k - 1;

            if (dp[i + 1][j - 1] && s.charAt(i) == s.charAt(j)) {
                dp[i][j] = true;

                if (k > maxLen) {
                    start = i;
                    maxLen = k;
                }
            }
        }
    }

    return s.substring(start, start + maxLen);
}

// Driver Code
public static void main(String[] args) {
    String s = "forgeeksskeegfor";
    System.out.println(longestPalSubstr(s));
}
}