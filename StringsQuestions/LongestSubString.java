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
----------------------------------------------------------------------------------------------------------------------------
//Explanation -
//Input
s = "babad"

Initial values:

start = 0
maxLength = 1
i = 0 (Center = 'b')
Odd Palindrome
left = 0, right = 0
Palindrome = "b"
Length = 1

No update.

Even Palindrome
left = 0, right = 1
b != a

Stop.

Current values

start = 0
maxLength = 1
---------------------------
i = 1 (Center = 'a')
Odd Palindrome
left = 1, right = 1
Palindrome = "a"
Length = 1

Expand

left = 0, right = 2
Palindrome = "bab"
Length = 3

Update

start = 0
maxLength = 3

Expand again

left = -1
Stop
Even Palindrome
a != b

Stop.
----------------------------
i = 2 (Center = 'b')
Odd Palindrome
left = 2, right = 2
Palindrome = "b"

Expand

left = 1, right = 3
Palindrome = "aba"
Length = 3

Length is equal to maxLength (3).

No update because

currentLength > maxLength

is false.

Expand

left = 0, right = 4

b != d

Stop.

Even Palindrome
b != a

Stop.
----------------------
i = 3 (Center = 'a')
Odd
Palindrome = "a"
Length = 1

Expand

b != d

Stop.

Even
a != d

Stop.
-----------------------
i = 4 (Center = 'd')
Odd
Palindrome = "d"
Length = 1

Expand

right becomes 5
Stop
Even

Loop doesn't start.

Final Values
start = 0
maxLength = 3

Return

s.substring(start, start + maxLength)
s.substring(0, 3)

Output

"bab"
