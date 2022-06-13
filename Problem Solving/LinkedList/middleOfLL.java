public class middleOfLL {

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

        
    class Solution1 {
        public ListNode middleNode(ListNode head) {
            
            ListNode temp = head;
            int length=0;
            
            while(temp != null){
                temp = temp.next;
                length++;
            }
            
            int mid = length/2;
            temp = head;
            
            for(int i=0;i<mid;i++){
                temp = temp.next;
            }
            
            return temp;
        }
    }




    class Solution2 {
        public ListNode middleNode(ListNode head) {
            
            ListNode slow = head;
            ListNode fast = head;
            
            
            while(fast != null && fast.next != null){
                slow = slow.next;
                fast=fast.next.next;
            }
            
            return slow;
        }
    }

}
