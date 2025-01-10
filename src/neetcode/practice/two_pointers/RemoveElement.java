package neetcode.practice.two_pointers;

import java.util.Arrays;

/**
 * Remove Element
 * leetcode question <a href="https://leetcode.com/problems/remove-element/description/">link</a>
 */
public class RemoveElement {
    public static void main(String[] args) {
        int[] nums = {1, 2, 0, 1, 1};
        int val = 1;
        System.out.println(removeElement(nums, val));
        System.out.println(Arrays.toString(nums));
    }

    public static int removeElement(int[] nums, int val) {
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k++] = nums[i];
            }
        }
        return k;
    }
}
