package neetcode.practice.two_pointers;

import java.util.Arrays;

/**
 * Remove Duplicates from Sorted Array
 * <a href="https://leetcode.com/problems/remove-duplicates-from-sorted-array/description/">leetcode question link</a>
 */
public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 3, 4};
        System.out.println(removeDuplicates(nums));
        System.out.println(Arrays.toString(nums));
    }

    public static int removeDuplicates(int[] nums) {
        int distinct = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                nums[distinct++] = nums[i];
            }
        }
        return distinct;
    }
}
