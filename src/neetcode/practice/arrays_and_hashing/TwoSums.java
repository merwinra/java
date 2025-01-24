package neetcode.practice.arrays_and_hashing;

import java.util.HashMap;
import java.util.Map;

/**
 * Two Sums<br>
 * <a href="https://leetcode.com/problems/two-sum/description/">leetcode question link</a>
 */
public class TwoSums {
    public static int[] twoSums(int[] nums, int target) {
        Map<Integer, Integer> indexMap = new HashMap<Integer, Integer>();

        for (int i = 0; i < nums.length; i++) {
            indexMap.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if (indexMap.containsKey(diff) && indexMap.get(diff) != i) {
                return new int[]{i, indexMap.get(diff)};
            }
        }

        return new int[0];
    }

    public static int[] twoSumsV2(int[] nums, int target) {
        Map<Integer, Integer> diffIndexMap = new HashMap<Integer, Integer>();

        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int diff = target - num;

            if (diffIndexMap.containsKey(diff)) {
                return new int[] { diffIndexMap.get(diff), i };
            }

            diffIndexMap.put(num, i);
        }

        return new int[] {};
    }
}
