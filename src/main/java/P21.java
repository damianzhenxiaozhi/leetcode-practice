/**
 * @author fanzhen
 * @version v1
 * @date 2020/6/24
 */
public class P21 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dummyNode = new ListNode(0);

        ListNode curNode = dummyNode;
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                curNode.next = l1;
                l1 = l1.next;
            } else {
                curNode.next = l2;
                l2 = l2.next;
            }
            curNode = curNode.next;
        }

        if (l1 != null) {
            curNode.next = l1;
        }

        if (l2 != null) {
            curNode.next = l2;
        }

        return dummyNode.next;
    }
}
