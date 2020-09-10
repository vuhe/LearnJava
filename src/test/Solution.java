package test;

import leetcode.TreeNode;

import java.util.*;

class Solution {

    final
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        if (root != null) {
            queue.offer(root);
        }
        queue.offer(null);

        LinkedList<List<Integer>> ans = new LinkedList<>();
        while (queue.size() > 1) {
            List<Integer> list = new LinkedList<>();
            while (queue.peek() != null) {
                TreeNode ptr = queue.poll();
                list.add(ptr.val);
                if (ptr.left != null) {
                    queue.offer(ptr.left);
                }
                if (ptr.right != null) {
                    queue.offer(ptr.right);
                }
            }
            queue.offer(queue.poll());
            ans.addFirst(list);
        }
        return ans;
    }

    public static void main(String[] args) {
        Solution s0 = new Solution();

//        double key = s0.maxProbability(3, new int[][]{{0,1},{1,2},{0,2}}, new double[]{0.5,0.5,0.2}, 0, 2);
//        System.out.println(key);
//        Map<Integer, Integer> a = new HashMap<>();
//        Character a0;
        int a = 12, b = 24;
        boolean x = (a > b);
        boolean y = (a != b);
        boolean z = (a + b == 36);
        System.out.println("x=" + x);
        System.out.println("y=" + y);
        System.out.println("z=" + z);
    }
}
