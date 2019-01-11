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
        ListNode dummyHead = new ListNode(0);
        ListNode p = l1, q = l2, cur = dummyHead;
        int carry = 0;
        while (p != null || q != null) {
            int x = (p != null) ? p.val : 0;
            int y = (q != null) ? q.val : 0;
            int sum = carry + x + y;
            carry = sum / 10;
            cur.next = new ListNode(sum % 10);
            cur = cur.next;
            if (p != null) p = p.next;
            if (q != null) q = q.next;
        }
        if (carry > 0) {
            cur.next = new ListNode(carry);
        }
        return dummyHead.next;
    }

    public int lengthOfLongestSubstring(String s) {


        /*int maxSize = 0;
        char[] c = s.toCharArray();
        int[] rember = new int[128];
        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c.length; j++) {
                if (rember[c[j]] == 0) {
                    rember[c[j]] = 1;
                    continue;
                }
                break;
            }
            int tempMax = 0;
            for (int j = 0; j < rember.length; j++) {
                if (rember[j] == 1) {
                    tempMax += 1;
                    rember[j] = 0;
                }
                maxSize = (maxSize > tempMax ? maxSize : tempMax);
            }
        }
        return c.length ==0?1 :maxSize;*/
        int n = s.length(), ans = 0;
        int[] index = new int[128];
        for (int i = 0, j = 0; i < n; j++) {
            i = Math.max(index[s.charAt(j)], i);
            ans = Math.max(ans, j - i + 1);
            index[s.charAt(j)] = j + 1;
        }
        return ans;
    }

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i = 0, j = 0, p = 0;
        if (nums1.length == 0) {
            switch (nums2.length % 2) {
                case 1:
                    return nums2[nums2.length / 2];
                default:
                    return (nums2[nums2.length / 2] + nums2[nums2.length / 2 - 1]) / 2.0;
            }
        } else if (nums2.length == 0) {
            switch (nums1.length % 2) {
                case 1:
                    return nums1[nums1.length / 2];
                default:
                    return (nums1[nums1.length / 2] + nums1[nums1.length / 2 - 1]) / 2.0;
            }
        } else {
            int[] index = new int[nums1.length + nums2.length];
            while (i < nums1.length || j < nums2.length) {
                if (i < nums1.length && j < nums2.length) {
                    if (nums1[i] < nums2[j]) {
                        index[p++] = nums1[i++];
                    } else if (nums1[i] > nums2[j]) {
                        index[p++] = nums2[j++];
                    } else {
                        index[p++] = nums1[i++];
                        index[p++] = nums2[j++];
                    }
                }
                if (i < nums1.length && j >= nums2.length) {
                    index[p++] = nums1[i++];
                }
                if (i >= nums1.length && j < nums2.length) {
                    index[p++] = nums2[j++];
                }
            }
            if (p % 2 == 1) {
                return index[p / 2];
            } else {
                return (index[p / 2] + index[p / 2 - 1]) / 2.0;
            }
        }

        /*
        //去重版
        int i = 0, j = 0, temp = 0, k = 0;
        if (nums1.length == 0) {
            temp = nums2[0];
        } else if (nums2.length == 0) {
            temp = nums1[0];
        } else {
            temp = nums1[0] > nums2[0] ? nums2[0] : nums1[0];
        }


        int[] index = new int[nums1.length + nums2.length];

        while (i < nums1.length || j < nums2.length) {
            if (i < nums1.length && j < nums2.length) {
                if (nums1[i] == temp) {
                    i++;
                    continue;
                }
                if (nums2[j] == temp) {
                    j++;
                    continue;
                }
                index[k++] = temp;
                if (nums1[i] == nums2[j]) {
                    temp = nums1[i];
                    i++;
                    j++;
                    continue;
                }
                if (nums1[i] > nums2[j]) {
                    temp = nums2[j];
                    j++;
                    continue;
                }

                if (nums1[i] < nums2[j]) {
                    temp = nums1[i];
                    i++;
                    continue;
                }
            }
            if (i < nums1.length && j >= nums2.length) {
                if (nums1[i] != temp) {
                    index[k++] = temp;
                    temp = nums1[i];
                }
                i++;
                continue;
            }
            if (i >= nums1.length && j < nums2.length) {
                if (nums2[j] != temp) {
                    index[k++] = temp;
                    temp = nums2[j];
                }
                j++;
                continue;
            }

        }
        index[k++] = temp;

        if (k % 2 == 1) {
            return index[k / 2];
        }
        int x = k / 2;
        return (index[x - 1] + index[x]) / 2.0;



         */
    }

    public int numJewelsInStones(String J, String S) {
        int[] iS = new int[256];
        int gems = 0;
        for (int i = 0; i < J.length(); i++) {
            iS[J.charAt(i)] = 1;
        }
        for (int i = 0; i < S.length(); i++) {
            if (iS[S.charAt(i)] == 1) {
                gems++;
            }
        }
        return gems;
    }

}
