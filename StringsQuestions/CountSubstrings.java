package Strings;
//Count Total Number of Substrings
//Problem
//Given a string s, find the total number of possible substrings.
//Example 1
//Input
//s = "abc"
//Output
//6









public class CountSubstrings {

    public static void main(String[] args) {

        String s = "abc";

        int n = s.length();

        int total = (n*(n + 1)) / 2;

        System.out.println(total);
    }
}
