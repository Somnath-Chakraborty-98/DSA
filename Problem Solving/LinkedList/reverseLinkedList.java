public class reverseLinkedList{


    public class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    class Solution1iterative {
        public ListNode reverseList(ListNode head) {
            
            ListNode prev = null;
            ListNode present = head;
            ListNode next = head.next;

            while(present != null){
                present.next = prev;
                prev = present;
                present = next;

                if(next!=null) next = next.next;
            }

            head = prev; // head = prev

            return head;
            
        }
    }


    class Solution2Recursive {
        public ListNode reverseList(ListNode head) {
            
            if(head == null || head.next == null) return head;
            
            ListNode newHead = reverseList(head.next);
            
            ListNode nxt = head.next;
            nxt.next = head;
            head.next = null;
            
            return newHead;
            
        }
    }
}