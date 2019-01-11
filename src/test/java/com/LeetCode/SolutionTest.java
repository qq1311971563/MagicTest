package com.LeetCode;

import org.junit.Test;

public class SolutionTest {

    Solution solution = new Solution();
    @Test
    public void twoSum() {
        int[] nums = {2, 7, 11, 15};
        System.out.println(solution.twoSum(nums, 9)[0]);
    }

    @Test
    public void addTwoNumbers() {
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);
        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);
        ListNode ret = solution.addTwoNumbers(l1,l2);
        while(ret.next != null){
            System.out.println(ret.val);
            ret = ret.next;
        }
        System.out.println(ret.val);
    }

    @Test
    public void lengthOfLongestSubstring() {
        System.out.println(solution.lengthOfLongestSubstring(" "));
        System.out.println(solution.lengthOfLongestSubstring("abcabcbb"));
        System.out.println(solution.lengthOfLongestSubstring("bbbbb"));
        System.out.println(solution.lengthOfLongestSubstring("pwwkew"));
        System.out.println(solution.lengthOfLongestSubstring(""));
    }

    @Test
    public void findMedianSortedArrays() {
        int[] nums1={};
        int[] nums2={2,3};
        System.out.println(solution.findMedianSortedArrays(nums1,nums2));
    }

    @Test
    public void numJewelsInStones() {
        System.out.println(solution.numJewelsInStones("aA","aAAbbbb"));
        System.out.println(solution.numJewelsInStones("z","ZZZ"));
        System.out.println(solution.numJewelsInStones("ZZZ",""));
    }
}