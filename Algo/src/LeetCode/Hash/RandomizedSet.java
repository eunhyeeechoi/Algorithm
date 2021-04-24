package LeetCode.Hash;
// Hash, Array 를 이용해서 Random, insert, remove 구현
// https://leetcode.com/problems/insert-delete-getrandom-o1/ - Insert Delete Get Random

import java.util.*;

public class RandomizedSet {
    public static void main(String[] args) {
        RandomizedSet random = new RandomizedSet();
        random.insert(1);
        random.remove(2);
        random.insert(2);
        random.remove(1);
        random.insert(2);
        random.getRandom();
    }

    private Map<Integer, Integer> map;
    private List<Integer> list;

    /**
     * Initialize your data structure here.
     */
    public RandomizedSet() {
        map = new HashMap<>();
        list = new ArrayList<>(); // Dynamic Array

    }

    /**
     * Inserts a value to the set. Returns true if the set did not already contain the specified element.
     */
    public boolean insert(int val) {
        if (map.containsKey(val)) return false;
        else {
            list.add(val);
            map.put(val, list.size() - 1); // 수, index 저장
            return true;
        }
    }

    /**
     * Removes a value from the set. Returns true if the set contained the specified element.
     */
    public boolean remove(int val) {
        if (!map.containsKey(val)) return false;
        else {
            int len = list.size() - 1;
            int lastNum = list.get(len);
            int idx = map.get(val); // map 에서 위치를 꺼내옴
            if (idx != len) { // 꺼내온것이 맨 뒤에 위치하지 않는다면
                list.set(idx, lastNum); // Array 에 삭제시킬것 위치에 맨 뒤에것의 값 을 넣어주고
                map.put(lastNum, idx); // map 에 맨끝값의 위치가 변경된 index 삽입
            }

            list.remove(len);
            map.remove(val);
            //맨뒤의 것들을 각각 삭제하면 성공적으로 삭제가 됌
            return true;
        }
    }

    /**
     * Get a random element from the set.
     */
    public int getRandom() {
        int max = map.size();
        int idx = (int) (Math.random() * max);

        return list.get(idx);

    }

}