package leetcode.problem1;

import java.util.HashMap;
import java.util.Map;

/**
 * Two Sums
 * <a href="https://leetcode.com/problems/two-sum/">leetcode question link</a>
 */
public class Problem1 {
    public int[] twoSum(final int[] nums, final int target) {
        final Map<Integer, Integer> diffIndexMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            final int diff = target - nums[i];
            if (diffIndexMap.containsKey(diff)) {
                return new int[] {i, diffIndexMap.get(diff)};
            }
            diffIndexMap.put(nums[i], i);
        }
        return new int[] {};
    }
}
