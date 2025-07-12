package leetcode.problem3;

import java.util.HashSet;
import java.util.Set;

/**
 * Longest Substring Without Repeating Characters
 * <a href="https://leetcode.com/problems/longest-substring-without-repeating-characters/">leetcode question link</a>
 */
public class Problem3 {
    public int lengthOfLongestSubstring(final String s) {
        int maxDistinct = 0;
        int l = 0;
        final Set<Character> characterSet = new HashSet<>();
        for (int r = 0; r < s.length(); r++) {
            if (!characterSet.contains(s.charAt(r))) {
                characterSet.add(s.charAt(r));
                maxDistinct = Math.max(maxDistinct, r - l + 1);
            } else {
                while(characterSet.contains(s.charAt(r))) {
                    characterSet.remove(s.charAt(l));
                    l++;
                }
                characterSet.add(s.charAt(r));
            }
        }
        return maxDistinct;
    }
}
