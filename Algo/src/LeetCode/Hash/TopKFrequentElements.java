package LeetCode.Hash;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

// https://leetcode.com/problems/top-k-frequent-elements/
// 여러 요소중 가장 많이 반복되는것 k개를 리턴
// Hashmap 과 Array 를 사용한 문제
public class TopKFrequentElements {
    public static void main(String[] args) {
        TopKFrequentElements aa = new TopKFrequentElements();
        int[] nums = {1, 1, 1, 2, 2, 3};
        int k = 2;
        aa.topKFrequent(nums, k);
    }

    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> hash = new HashMap<>();
        List<Integer> inList = new ArrayList<>();
        for (int num : nums) {
            if (!hash.containsKey(num)) {
                hash.put(num, 1);
                inList.add(num);
            } else {
                hash.put(num, hash.get(num) + 1);
            }
        }
        Collections.sort(inList, (a, b) -> hash.get(b) - hash.get(a));
        int[] retArray = new int[k];
        for (int i = 0; i < k; i++) {
            retArray[i] = inList.get(i);
        }
        return retArray;
    }
}
