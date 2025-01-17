package neetcode.practice.arrays_and_hashing;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Contains Duplicates
 * <a href="https://leetcode.com/problems/contains-duplicate/description/">leetcode question link</a>
 */
public class ContainsDuplicates {
    public static boolean doesContainDuplicates(int[] nums) {
        Set<Integer> seen = new HashSet<Integer>();

        for (int num: nums) {
            if (seen.contains(num)) {
                return true;
            }
            seen.add(num);
        }

        return false;
    }

    public static boolean doesContainDuplicatesV2(int[] nums) {
        return Arrays.stream(nums).distinct().count() < nums.length;
    }
}
