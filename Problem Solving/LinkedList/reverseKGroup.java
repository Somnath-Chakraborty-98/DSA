public class reverseKGroup {

    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    class Solution1 {
        public ListNode reverseKGroup(ListNode head, int k) {

            if (head == null || head.next == null)
                return head;

            int length = lengthOfLinkedList(head);

            ListNode dummyHead = new ListNode();
            dummyHead.next = head;

            ListNode pre = dummyHead;
            ListNode cur;
            ListNode nex;

            while (length >= k) {
                cur = pre.next;
                nex = cur.next;

                for (int i = 1; i < k; i++) {
                    cur.next = nex.next;
                    nex.next = pre.next;
                    pre.next = nex;
                    nex = cur.next;
                }
                pre = cur;
                length -= k;
            }

            return dummyHead.next;

        }

        int lengthOfLinkedList(ListNode head) {
            int length = 0;
            while (head != null) {
                ++length;
                head = head.next;
            }
            return length;
        }
    }

    void solution2(ListNode head, int k) {
        ListNode prev = null;
        ListNode curr = head;
        ListNode next = head.next;
        ListNode last = prev;
        ListNode newLast = curr;

        while (curr != null) {

            for (int i = 0; i < k; i++) {
                curr.next = prev;
                prev = curr;
                curr = next;

                if (next != null)
                    next = next.next;
            }
            if (last != null)
                last.next = prev;
            else
                head = prev;
            newLast.next = curr;
        }
    }

}
