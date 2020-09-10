package easy;

  class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }

      @Override
      public String toString() {
          return "ListNode{" +
                  "value=" + val +
                  ", next=" + next +
                  '}';
      }
  }

public class MergeTwoSortedLists {
    public ListNode mergeTwoSortedLists(ListNode l1, ListNode l2) {
        ListNode node = new ListNode();
        ListNode curr = node;
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                curr.next = l1;
                l1 = l1.next;
            } else {
                curr.next = l2;
                l2 = l2.next;
            }
            curr = curr.next;
        }
        if (l1 != null) {
            curr.next = l1;
        }
        if (l2 != null) {
            curr.next = l2;
        }
        return node.next;
    }
    public ListNode getObj(int i, ListNode l) {
        return new ListNode(i, l);
    }
}
