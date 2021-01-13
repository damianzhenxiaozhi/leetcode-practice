/**
 * @author fanzhen
 * @version v1
 * @date 2020/6/18
 */
public class P2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int n = 0;
        ListNode t = new ListNode(0);
        ListNode head = t;
        while (l1 != null || l2 != null) {
            int val = (l1 != null ? l1.val : 0) + (l2 != null ? l2.val : 0) + n;
            n = val / 10;
            int p = val % 10;
            t.next = new ListNode(p);
            t = t.next;
            l1 = l1 != null ? l1.next : null;
            l2 = l2 != null ? l2.next : null;
        }

        if (n > 0) {
            t.next = new ListNode(n);
        }

        return head.next;
    }
}
