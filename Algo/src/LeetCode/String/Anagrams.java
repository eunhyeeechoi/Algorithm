package LeetCode.String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;

//https://leetcode.com/problems/group-anagrams/
// 리트코드 49
// 참고 : https://mytodays.tistory.com/m/28?category=856422
public class Anagrams {
    public static void main(String[] args) {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        Anagrams aa = new Anagrams();
        System.out.println(aa.groupAnagrams(strs));
    }

    public List<List<String>> groupAnagrams(String[] strs) {

        LinkedHashMap<String, List<String>> map = new LinkedHashMap<String, List<String>>();
        List<List<String>> answer = new ArrayList<List<String>>();

        for (String nowString : strs) {
            char[] chr = nowString.toCharArray();
            Arrays.sort(chr);
            // 문자열 -> 문자로 정렬해서 넣기
            String sortedString = String.valueOf(chr);

            if (!map.containsKey(sortedString)) { // 정렬된 문자열을 key 로 삼아서 같은 구성인것을 value 로 더함
                // sortedString이 있는지 확인하고 없을때
                List<String> set = new ArrayList<String>();
                set.add(nowString);
                map.put(sortedString, set);
//				새로운 키 넣기 

            } else {
                // 이미 존재하는 키라면 같은것으로 구성된 key 에 현재 문자열 삽입
                map.get(sortedString).add(nowString);
            }
        }
        map.forEach((key, value) -> {
            answer.add(value);
            // 답은 map 에 저장되어있는것중 value 값만 꺼내면 돼서 이렇게 꺼내옴
        });
        return answer;
    }

}