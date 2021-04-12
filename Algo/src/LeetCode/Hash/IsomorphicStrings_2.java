package LeetCode.Hash;

import java.util.HashMap;

// https://leetcode.com/problems/isomorphic-strings/
// s 와 t 가 동일한 구조를 가지는지 판별하는 문제

public class IsomorphicStrings_2 {
    public static void main(String[] args) {
        IsomorphicStrings_2 aa = new IsomorphicStrings_2();
        String s = "aaaccd";
        String t = "xxxyyz";
        //String s = "aaaffh";
        //String t = "xyzhhh";
    }

    public boolean isIsomorphic(String s, String t) {
        // s 의 값과 t 의 값을 각각 Key, value 로 넣어 다른값이 삽이 되려고 하면 false 를 리턴하면 됌
        HashMap<Character, Character> hash = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char schar = s.charAt(i);
            char tchar = t.charAt(i);
            if (hash.containsKey(schar)) {
                if (hash.get(schar).equals(tchar))
                    continue;
                else
                    return false;
            } else {
                if (!hash.containsValue(tchar))
                    hash.put(schar, tchar);
                else
                    return false;
            }
        }
        return true;
    }
}
