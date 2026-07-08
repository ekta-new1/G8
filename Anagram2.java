package DSAquestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

//Group Anagrams
//Problem
//Given an array of strings, group all anagrams together.
//Input
//["eat","tea","tan","ate","nat","bat"]
//Output
//[[eat, tea, ate],
// [tan, nat],
// [bat]]



public class Anagram2 {
    static void main() {

                String[] strs = {"eat","tea","tan","ate","nat","bat"};

                HashMap<String, ArrayList<String>> map = new HashMap<>();

                for (String word : strs) {

                    char[] arr = word.toCharArray();

                    Arrays.sort(arr);

                    String key = new String(arr);

                    map.putIfAbsent(key, new ArrayList<>());

                    map.get(key).add(word);
                }

                System.out.println(map.values());
            }
        }

