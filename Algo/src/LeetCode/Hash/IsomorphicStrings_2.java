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
                // 맵에 이미 key 가 들어있다면 입력되는것과 같은지 비교
                if (hash.get(schar).equals(tchar))
                    // 같으면 계속 진행
                    continue;
                else
                    // 다르다면 false 리턴 짝이 다른것
                    return false;
            } else {
                // 새로 입력되는 value 값이 존재 하지 않으면 삽입
                if (!hash.containsValue(tchar))
                    hash.put(schar, tchar);
                else
                    return false;
            }
        }
        return true;
    }
}
