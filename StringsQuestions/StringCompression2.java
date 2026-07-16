package Strings;
//Compress Only Repeated Characters
//aaabbccccad
//Output - a3b2c4ad
//Explanation
//aaa → a3
//bb  → b2
//cccc → c4
//d → d

public class StringCompression2 {

    static void main() {
        String s = "aaabbccccd";
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

            if (count > 1) {
                ans.append(count);
            }
        }

        System.out.println(ans.toString());
    }
}
