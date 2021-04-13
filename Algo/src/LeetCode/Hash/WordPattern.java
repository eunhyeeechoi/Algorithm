package LeetCode.Hash;

import java.util.HashMap;

// char 과 String 문자열 짝이 맞는지 패턴을 확인 하는 문제
public class WordPattern {
    public static void main(String[] args) {
        WordPattern aa = new WordPattern();
        String pattern = "abba";
        //String s = "dog cat cat dog";
        String s = "dog dog dog dog";
        System.out.println(aa.wordPattern(pattern, s));

    }

    public boolean wordPattern(String pattern, String s) {
        HashMap<Character, String> hash = new HashMap<>();
        String[] sword = s.split(" ");
        int i = 0;
        while (i < Math.min(pattern.length(), sword.length)) {
            if (hash.containsKey(pattern.charAt(i))) {
                if (!hash.get(pattern.charAt(i)).equals(sword[i])) {
                    return false;
                }
            } else {
                if (hash.containsValue(sword[i]))
                    return false;
                hash.put(pattern.charAt(i), sword[i]);
            }
            i++;
        }
        return i == pattern.length() && i == sword.length;
    }
}
