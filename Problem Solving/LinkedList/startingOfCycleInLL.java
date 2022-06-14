public class startingOfCycleInLL {

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }



    public class Solution {
        public ListNode detectCycle(ListNode head) {
            ListNode first = head;
            ListNode second = head;
            boolean pre = false;
            
             while(first!=null && first.next!=null){
                first=first.next.next;
                second=second.next;
    
                if(first == second) {
                    first = head;
                    
                    while(first != second){
                        first=first.next;
                        second=second.next;
                        pre = true;
                    }
                    
                    if(pre = true) return first;
                }
            }
            return null;
        }
    }



    
}
