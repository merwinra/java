package neetcode.practice.arrays_and_hashing;

import java.util.Arrays;

/**
 * Concatenation of Array
 * <a href="https://leetcode.com/problems/concatenation-of-array/description/">leetcode question link</a>
 */
public class ConcatenationOfArray {
    public static int[] concatenateArrays(int[] nums) {
        int length = nums.length;
        int[] ans = new int[2 * length];

        for (int i = 0; i < length; i++) {
            ans[i] = ans[i + length] = nums[i];
        }

        return ans;
    }

    public static int[] concatenateArraysV2(int[] nums) {
        int[] ans = new int[2 * nums.length];
        int index = 0;

        for (int i = 0; i < 2; i++) {
            for (int num : nums) {
                ans[index++] = num;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 1, 3, 5};
        System.out.println(Arrays.toString(concatenateArrays(nums)));
        System.out.println(Arrays.toString(concatenateArraysV2(nums)));
    }
}
