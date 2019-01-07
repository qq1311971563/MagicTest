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
}