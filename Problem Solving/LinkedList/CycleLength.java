public class CycleLength {

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

    public int length(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        int len = 0;

        while (fast != null && fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                ListNode temp = slow;
                do {
                    temp = temp.next;
                    len++;
                } while (temp != slow);

                return len;
            }
        }

        return 0;

    }
}
