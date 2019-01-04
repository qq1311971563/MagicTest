package com.LeetCode;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        int i, j, ret[] = new int[]{0, 0};
        for (i = 0; i < nums.length; i++) {
            for (j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return ret;
    }


    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        return null;
    }

}
