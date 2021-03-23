package leetcode;

import leetcode.tool.*;

class Solution {
    private int ptr = 0;

    public ListNode[] solve (TreeNode root, int[] b) {
        ListNode[] ans = new ListNode[b.length];
        for (int i = 0; i < b.length; i++) {
            ptr = 0;
            ListNode head = new ListNode(0);
            find(head, root, b[i]);
            ans[i] = head.next;
        }
        return ans;
    }

    private void find(ListNode node, TreeNode root, int b) {
        if (root == null) {
            return;
        }
        node.next = new ListNode(root.val);
        if (root.val == b) {
            ptr = b;
            return;
        }
        find(node.next, root.left, b);
        if (ptr != b) {
            find(node.next, root.right, b);
        }
        if (ptr != b) {
            node.next = null;
        }
    }


    private final Solution s = new Solution();

    public static void main(String... args) {

    }
}
