package Strings;
//Compress every repeating character, including digits.
// Example
// Input "1112233"
// Output "132232"

public class StringCompression4 {

    static void main() {
        String str = "1112233";
        if (str == null || str.length() == 0)
            System.out.println("");

        StringBuilder result = new StringBuilder();

        int count = 1;

        for (int i = 1; i <= str.length(); i++) {

            if (i < str.length() && str.charAt(i) == str.charAt(i - 1)) {

                count++;

            } else {

                result.append(str.charAt(i - 1));
                result.append(count);

                count = 1;
            }
        }

        System.out.println(result.toString());;
    }
}
