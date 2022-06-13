public class addTwoNumbersAsLL {

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }


    class Solution {
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            
            
        int carry = 0;
        ListNode temp, dummy = new ListNode(0);
        temp = dummy;
        while (l1 != null || l2 != null || carry != 0) {
            
                if (l1 != null) {
                    carry += l1.val;                //Taken as Sum
                    l1 = l1.next;
                }
    
                if (l2 != null) {
                    carry += l2.val;                //Taken as Sum
                    l2 = l2.next;
                }
    
                temp.next = new ListNode(carry%10);     //Taken as Sum
                carry /= 10;                            // getting the carry
                temp = temp.next;
        }
            
        return dummy.next;
            
            
            
        }
    }


    
}
