package Strings;
//Compress Words Instead of Characters
//Input
//hello hello hello java java python
//Output
//hello3 java2 python













public class StringCompression5 {
    static void main() {
        String sentence = "hello hello hello java java python";
        String[] words = sentence.split(" ");

        StringBuilder ans = new StringBuilder();

        int count = 1;

        for (int i = 1; i <= words.length; i++) {

            if (i < words.length &&
                    words[i].equals(words[i - 1])) {

                count++;

            } else {

                ans.append(words[i - 1]);

                if (count > 1)
                    ans.append(count);

                ans.append(" ");

                count = 1;
            }
        }

        System.out.println(ans.toString().trim());
    }
}
