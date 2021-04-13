package LeetCode.Hash;

import java.util.Arrays;
import java.util.HashMap;

// https://leetcode.com/problems/valid-anagram/
// sort 를 이용한 풀이
public class ValidAnagram_2 {
    public static void main(String[] args) {
        ValidAnagram_2 aa = new ValidAnagram_2();
        String s = "nocodeprogram";
        String t = "promodernacog";
        System.out.println(aa.isAnagram(s, t));

    }

    public boolean isAnagram(String s, String t) {
        char[] schar = s.toCharArray();
        char[] tchar = t.toCharArray();
        Arrays.sort(schar);
        Arrays.sort(tchar);

        if (s.length() != t.length()) {
            return false;
        } else {
            for (int i = 0; i < s.length(); i++) {
                if (schar[i] != tchar[i]) {
                    return false;
                }
            }
        }

        return true;
    }
}
