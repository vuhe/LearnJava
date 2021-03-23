package leetcode.tool;

import java.util.Iterator;

/**
 * @author zhuhe
 */
public final class ListNode implements Iterable<ListNode>, Cloneable {
    public int val;
    public ListNode next;

    public ListNode(int x) {
        val = x;
        next = null;
    }

    public ListNode(int x, ListNode next) {
        val = x;
        this.next = next;
    }

    public static ListNode toList(int[] array) {
        if (array.length == 0) {
            return null;
        }
        ListNode head = new ListNode(0);
        head.val = array[0];
        ListNode ptr = head;
        for (int i = 1; i < array.length; i++) {
            ptr.next = new ListNode(array[i]);
            ptr = ptr.next;
        }
        return head;
    }

    public static ListNode toList(String input) {
        input = input.trim();
        input = input.substring(1, input.length() - 1);
        String[] parts = input.split(",");
        int[] nums = new int[parts.length];
        for (int i = 0; i < parts.length; i++) {
            String item = parts[i].trim();
            nums[i] = Integer.parseInt(item);
        }
        return toList(nums);
    }

    @Override
    public Iterator<ListNode> iterator() {
        return new ListItr(this);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        } else if (obj instanceof ListNode) {
            String a = this.toString();
            String b = obj.toString();
            return a.equals(b);
        }
        return false;
    }

    @Override
    public ListNode clone() {
        try {
            ListNode head = (ListNode) super.clone();
            Iterator<ListNode> it = this.iterator();
            ListNode ptrB = head;
            while (it.hasNext()) {
                ptrB.next = new ListNode(it.next().val);
                ptrB = ptrB.next;
            }
            return head;
        } catch (CloneNotSupportedException e) {
            // 由于我们实现了 Cloneable，通常情况下这不会发生
            throw new InternalError(e);
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("(List)[");
        Iterator<ListNode> it = this.iterator();
        while (it.hasNext()) {
            sb.append(it.next().val);
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    private static class ListItr implements Iterator<ListNode> {
        private ListNode next;

        ListItr(ListNode head) {
            next = head;
        }

        @Override
        public boolean hasNext() {
            return next != null;
        }

        @Override
        public ListNode next() {
            ListNode pre = next;
            next = pre.next;
            return pre;
        }
    }
}
