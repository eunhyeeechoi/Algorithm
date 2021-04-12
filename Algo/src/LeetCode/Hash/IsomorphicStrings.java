package LeetCode.Hash;

import java.util.HashMap;
// https://leetcode.com/problems/isomorphic-strings/
// s 와 t 가 동일한 구조를 가지는지 판별하는 문제
// key value string 이 반대 상황일때를 체크 못함
public class IsomorphicStrings {
    public static void main(String[] args) {
        IsomorphicStrings aa = new IsomorphicStrings();
        String s = "aaaccd";
        String t = "xxxyyz";
        //String s = "aaaffh";
        //String t = "xyzhhh";
    }

    public boolean isIsomorphic(String s, String t) {
        // s 의 값과 t 의 값을 각각 Key, value 로 넣어 다른값이 삽이 되려고 하면 false 를 리턴하면 됌
        char[] schar = s.toCharArray();
        char[] tchar = t.toCharArray();
        HashMap<Character, Character> hash = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (!hash.containsKey(schar[i])) {
                // hash 맵 안에 가지고 있지 않을때 추가
                hash.put(schar[i], tchar[i]);
            } else {
                // hash 맵 안에 가지고 있다면 확인!
                if (hash.get(schar[i]) != tchar[i]) {
                    // 현재 짝 이루어 넣으려고 하는것과 다르면 false 출력
                    return false;
                }
            }
        }
        return true;
    }
}
