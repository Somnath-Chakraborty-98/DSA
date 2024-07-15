import java.util.HashSet;
import java.util.Set;

public class detectCycleInLL {

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

    public class Solution1Hashing {
        public boolean hasCycle(ListNode head) {

            ListNode temp = head;

            Set<ListNode> set = new HashSet<ListNode>();

            while (temp != null) {

                if (set.contains(temp))
                    return true;

                else {
                    set.add(temp);
                    temp = temp.next;
                }
            }

            return false;

        }
    }

    public class Solution2FastAndSlowPointer {
        public boolean hasCycle(ListNode head) {

            ListNode slow = head;
            ListNode fast = head;

            while (fast != null && fast.next != null && fast.next.next != null) {
                slow = slow.next;
                fast = fast.next.next;

                if (slow == fast)
                    return true;
            }

            return false;

        }
    }

}
