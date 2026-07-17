package Strings;
//Expand the compressed string.(Decompression)
//Input - a3b2c4
//Output - aaabbcccc

public class StringCompression3 {
    public static void main(String[] args) {
        String str = "a3b2c4";
        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            int count = 1;
//checks if there is next char and if that char is digit
            if (i + 1 < str.length()
                    && Character.isDigit(str.charAt(i + 1))) {

                count = str.charAt(i + 1) - '0';  //ascii values
                i++;
            }

            while (count-- > 0)
                ans.append(ch);
        }

        System.out.println(ans.toString());
    }
}
