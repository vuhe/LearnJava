package test;

import jdkpreview.Jdk17;
import leetcode.TreeNode;

import java.util.*;

class Solution {

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
        System.out.println('\\' + 5);
        Jdk17.recordTest();

        String a="Java";
        String b="Java";
        String x="Ja";
        String y="va";
        String c=x+y;
        System.out.println(a == b);
        System.out.println(a == c);
        System.out.println(b == c);
    }
}
