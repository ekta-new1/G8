package Strings;
//Given a string s, compress it by replacing consecutive repeated characters with the character followed by its count.

//Input:
//aaabbaaccccd
//Output:
//a3b2a2c4d1



public class StringCompression1 {

    static void main() {
        String s = "aabbc";
        StringBuilder ans = new StringBuilder();

        int i = 0;

        while (i < s.length()) {

            char current = s.charAt(i);
            int count = 0;

            while (i < s.length() && s.charAt(i) == current) {
                count++;
                i++;
            }

            ans.append(current);
            ans.append(count);
        }

        System.out.println(ans.toString());
    }
}
