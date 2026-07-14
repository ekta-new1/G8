package Strings;
//Longest Substring Without Repeating Characters
//Problem
//Given a string s, return the length of the longest substring that contains no repeating characters.
//Example 1
//Input
//s = "abcabcbb"
//Output
//3
//Explanation
//"abc"
//
//Example 2
//Input
//s = "bbbbb"
//Output
//1





import java.util.HashSet;

public class LongestSubString {

    public static void main(String[] args) {

        String s = "abcabcbb";

        HashSet<Character> set = new HashSet<>();

        int left = 0;
        int maxLength = 0;

        for (int right = 0; right < s.length(); right++) {

            while (set.contains(s.charAt(right))) {

                set.remove(s.charAt(left));
                left++;
            }

            set.add(s.charAt(right));

            maxLength = Math.max(maxLength, right - left + 1);
        }

        System.out.println(maxLength);
    }
}
