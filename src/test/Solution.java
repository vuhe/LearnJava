package test;

import jdkpreview.Jdk17;
import leetcode.ListNode;

import java.util.*;


class Solution {

    public ListNode insertionSortList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode newList = new ListNode(0);
        newList.next = head;
        ListNode oldList = new ListNode(0);
        oldList.next = head.next;
        head.next = null;
        while (oldList.next != null) {
            ListNode ptr = oldList.next;
            oldList.next = ptr.next;
            ListNode p = newList;
            while (p.next != null && p.next.val < ptr.val) {
                p = p.next;
            }
            ptr.next = p.next;
            p.next = ptr;
        }
        return newList.next;
    }

    /**
     * 给你一个数组 nums和一个值 val，你需要 原地 移除所有数值等于val的元素，并返回移除后数组的新长度。
     * 不要使用额外的数组空间，你必须仅使用 O(1) 额外空间并 原地 修改输入数组。
     * 元素的顺序可以改变。你不需要考虑数组中超出新长度后面的元素。
     */
    public int removeElement(int[] nums, long val) {
        if (val < Integer.MIN_VALUE || Integer.MAX_VALUE < val) {
            throw new RuntimeException("val 输入错误！");
        }
        if (nums == null) {
            throw new RuntimeException("nums 不能为 null！");
        }
        int size = nums.length;
        for (int i = 0; i < size; i++) {
            while (i < size && nums[i] == val) {
                int t = nums[size -1];
                nums[size -1] = nums[i];
                nums[i] = t;
                size--;
            }
        }
        return size;
    }
    
    public static void main(String... args) {
        Solution s0 = new Solution();
//        System.out.println(Arrays.toString(new int[]{}));
        s0.removeElement(null, 1);
//        double key = s0.maxProbability(3, new int[][]{{0,1},{1,2},{0,2}}, new double[]{0.5,0.5,0.2}, 0, 2);
//        System.out.println(key);
//        Map<Integer, Integer> a = new HashMap<>();
//        Character a0;
    }
}
