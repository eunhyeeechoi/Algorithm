package LeetCode.Hash;
// Hash, Array 를 이용해서 Random, insert, semove 구현

import com.sun.org.apache.xerces.internal.impl.dtd.models.CMAny;

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
        list = new ArrayList<>();

    }

    /**
     * Inserts a value to the set. Returns true if the set did not already contain the specified element.
     */
    public boolean insert(int val) {
        if (map.containsKey(val)) return false;
        else {
            list.add(val);
            map.put(val, list.size() - 1);
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
            int idx = map.get(val);
            if (idx != len) {
                list.set(idx, lastNum);
                map.put(lastNum, idx);
            }

            list.remove(len);
            map.remove(val);

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