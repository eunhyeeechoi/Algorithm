package LeetCode.Hash;

import java.util.HashMap;

// https://leetcode.com/problems/valid-anagram/
// hash map 이용한 풀이
public class ValidAnagram {
    public static void main(String[] args) {
        ValidAnagram aa = new ValidAnagram();
        String s = "nocodeprogram";
        String t = "promodernacog";
        System.out.println(aa.isAnagram(s, t));

    }

    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> hash = new HashMap<>();
        for (char schar : s.toCharArray()) {
            if (!hash.containsKey(schar)) {
                // 없을때 1개추가
                hash.put(schar, 1);
            } else {
                // 여러개일때 갯수 증가
                hash.put(schar, hash.get(schar) + 1);
            }
        }
        for (char tchar : t.toCharArray()) {
            if (hash.containsKey(tchar)) {
                // 있으면 갯수 감소
                hash.put(tchar, hash.get(tchar) - 1); // 갯수 하나 빼기
            } else {
                // 없으면 추가
                hash.put(tchar, 1);
            }
        }
        for (char schar : s.toCharArray()) {
            if (hash.get(schar) != 0) {
                return false;
            }
        }
        for (char tchar : t.toCharArray()) {
            if (hash.get(tchar) != 0) {
                return false;
            }
        }
        return true;
    }
}
