public class rotateALinkedList{

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }


    class Solution {
        public ListNode rotateRight(ListNode head, int k) {
            
            if (head == null || head.next == null || k == 0) return head;
            
            ListNode last = head;               //Last Node of LL
            ListNode newLast = head;            //Last Node after rotation should be
            int length = 1;
            
            while(last.next != null){           //finding the length and last node
                last = last.next;
                length++;
            }
            
            last.next = head;                   //Connecting last node to head
            
            int rotations = k % length;         //How nodes to be rotated from end
            
            int skip = length - rotations;      //How many nodes we have to skip
            
            for(int i = 0; i < skip-1; i++){    //1 Before skip is the new LAst
                newLast = newLast.next;
            }
            
            head = newLast.next;                //storing new last next to head -> new head
            newLast.next = null;                //destroying connection to new head
            
            
            return head;                        //new head
            
        }   
    }
}