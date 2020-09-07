package leetcode;

import java.util.LinkedList;
import java.util.Queue;

public final class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(int x) {
        val = x;
        left = null;
        right = null;
    }

    public static TreeNode toTree(Integer[] array) {
        if (array.length == 0) {
            return null;
        }

        TreeNode root = new TreeNode(array[0]);
        Queue<TreeNode> nodeQueue = new LinkedList<>();
        nodeQueue.offer(root);

        int curr = 1;
        while (!nodeQueue.isEmpty()) {
            TreeNode e = nodeQueue.poll();

            // 处理左节点
            if (curr == array.length) {
                break;
            }

            Integer item = array[curr++];

            if (item != null) {
                e.left = new TreeNode(item);
                nodeQueue.offer(e.left);
            }

            // 处理右节点
            if (curr == array.length) {
                break;
            }

            item = array[curr++];

            if (item != null) {
                e.right = new TreeNode(item);
                nodeQueue.offer(e.right);
            }
        }

        return root;
    }

    public static TreeNode toTree(String input) {
        input = input.trim();
        input = input.substring(1, input.length() - 1);
        String[] parts = input.split(",");
        Integer[] nums = new Integer[parts.length];
        for (int i = 0; i < parts.length; i++) {
            String item = parts[i].trim();
            if (item.equals("null")) {
                nums[i] = null;
            } else {
                nums[i] = Integer.parseInt(item);
            }
        }
        return toTree(nums);
    }

    public static void prettyPrintTree(TreeNode node) {
        prettyPrintTree(node,  "", true);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        } else if (obj instanceof TreeNode) {
            String a = this.toString();
            String b = obj.toString();
            return a.equals(b);
        }
        return false;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("(Tree)[");
        Queue<TreeNode> nodeQueue = new LinkedList<>();
        nodeQueue.offer(this);
        while (!nodeQueue.isEmpty()) {
            TreeNode e = nodeQueue.poll();
            if (e == null) {
                sb.append("null, ");
            } else {
                sb.append(e.val).append(", ");
                nodeQueue.offer(e.left);
                nodeQueue.offer(e.right);
            }
        }
        sb.delete(sb.length() - 2, sb.length());
        sb.append("]");
        return sb.toString();
    }

    private static void prettyPrintTree(TreeNode node, String prefix, boolean isLeft) {
        if (node == null) {
            System.out.println("Empty tree");
            return;
        }

        if (node.right != null) {
            prettyPrintTree(node.right, prefix + (isLeft ? "│   " : "    "), false);
        }

        System.out.println(prefix + (isLeft ? "└── " : "┌── ") + node.val);

        if (node.left != null) {
            prettyPrintTree(node.left, prefix + (isLeft ? "    " : "│   "), true);
        }
    }
}
