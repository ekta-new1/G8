package Strings;
//Given a string s, return the longest palindromic substring.
//A palindrome reads the same forward and backward.
//Example 1
//Input
//s = "babad"
//Output
//"bab"
//or
//"aba"


public class LongestPalindrome {

    public static void main(String[] args) {

        String s = "babad";

        if (s.length() <= 1) {
            System.out.println(s);
            return;
        }

        int start = 0;
        int maxLength = 1;

        for (int i = 0; i < s.length(); i++) {

            //Odd Length Palindrome
            int left = i;
            int right = i;

            while (left >= 0 && right < s.length()
                    && s.charAt(left) == s.charAt(right)) {

                int currentLength = right - left + 1;

                if (currentLength > maxLength) {
                    maxLength = currentLength;
                    start = left;
                }

                left--;
                right++;
            }

            // Even Length Palindrome
            left = i;
            right = i + 1;

            while (left >= 0 && right < s.length()
                    && s.charAt(left) == s.charAt(right)) {

                int currentLength = right - left + 1;

                if (currentLength > maxLength) {
                    maxLength = currentLength;
                    start = left;
                }

                left--;
                right++;
            }
        }

        System.out.println(s.substring(start, start + maxLength));
    }
}
