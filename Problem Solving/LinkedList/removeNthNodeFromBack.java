public class removeNthNodeFromBack {
    

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }


    class Solution1 {
        public ListNode removeNthFromEnd(ListNode head, int n) {
            
            if(head.next == null) return null;   //If only 1 element
            
            if(head.next.next == null){         //If 2 elements
                
                if(n == 1){
                    head.next = null;
                    return head;
                }
                else{
                    head = head.next;
                    return head;
                }
                
            }
            
            ListNode curr = head;
            
            int len = 1;
            
            while (curr.next != null){
                curr = curr.next;
                len++;
            }
            
            
            if(len-(n+1) < 0){
                head = head.next;
                return head;
            }
            else{
                ListNode temp = head;
                
                for(int i=0;i<(len-(n+1));i++)  temp = temp.next;

                temp.next = temp.next.next;
            }

            return head;
        }
    }






class Solution2 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
    ListNode start = new ListNode(0);
        
    ListNode slow = start, fast = start;
        
    slow.next = head;
    
    //Move fast in front so that the gap between slow and fast becomes n
    for(int i=1; i<=n+1; i++)   {
        fast = fast.next;
    }
        
    //Move fast to the end, maintaining the gap
    while(fast != null) {
        slow = slow.next;
        fast = fast.next;
    }
        
    //Skip the desired node
    slow.next = slow.next.next;
        
    return start.next;
        
    }
}


}
