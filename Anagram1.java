package DSAquestions;

public class Anagram1 {

    public static void main(String[] args) {

        String s = "anagram";
        String t = "nagaram";

        if (s.length() != t.length()) {
            System.out.println(false);
            return;
        }

        int[] freq = new int[26];  //[0,0,0,0,....0]

        for (int i = 0; i < s.length(); i++) {

            freq[s.charAt(i) - 'a']++;  //[1,0,0,0....]
            freq[t.charAt(i) - 'a']--;   //[1,0,0,....n=-1,....0,0,0]
        }

        for (int x : freq) {

            if (x != 0) {
                System.out.println(false);
                return;
            }
        }

        System.out.println(true);
    }
}
//String s = "anagram";   ++add
// String t = "nagaram";   --
// i=0 -> a=1, n=-1
// i=1 -> n=0, a=0
// i=2 -> a=1, g=-1
// i=3 -> g=0, a=0
// i=4 -> r=1, r=0
// i=5 -> a=1, a=0
// i=6 -> m=1, m=0




//        HashMap<Character, Integer> map = new HashMap<>();
//        for (int i = 0; i < s.length(); i++) {
//
//            char ch = s.charAt(i);
//
//            map.put(ch, map.getOrDefault(ch, 0) + 1);
//        }

//        for (int i = 0; i < t.length(); i++) {
//            char ch = t.charAt(i);
//            if (!map.containsKey(ch)) {
//                System.out.println(false);
//                return;
//            }
//            map.put(ch, map.get(ch) - 1);

//            if (map.get(ch) == 0) {
//                map.remove(ch);
//            }
//        }
//
//        System.out.println(map.isEmpty());
//    }
//}
