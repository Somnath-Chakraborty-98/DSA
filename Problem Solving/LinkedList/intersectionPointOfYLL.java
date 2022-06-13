public class intersectionPointOfYLL {
    
    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }







    public class Solution {
        public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
            
            if(headA == null || headB == null) return null;
            
            ListNode a = headA;
            ListNode b = headB;
            
            while(a != b){
                
                //for the end oof first iteration we just reset the pointer to head of the other LL
                
                a = a == null? headB : a.next;           //if a==null ; a=headB; else a=a.next;
                b = b == null? headA : b.next;
            }
            
            return a;
            
            
        }
    }
}
