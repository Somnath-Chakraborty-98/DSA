public class isLLPalindrome {


    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }



    class Solution {
        
        public boolean isPalindrome(ListNode head) {
            ListNode mid = middileNode(head);
            
            ListNode headSecond = reverseList(mid);
            
            ListNode reReverseHead = headSecond;
            
            //Compare both the halves
            
            while(head != null && headSecond != null){
                
                if(head.val != headSecond.val) break;
                
                else{
                    head = head.next;
                    headSecond = headSecond.next;
                }
            }
            
            
            //Re Reverse LL
            reverseList(reReverseHead);
            
            
            //Checking if whole traversal took place because if true the it is palindrome
            
            if(head == null || headSecond == null) return true;
            
            else return false;
        }
        
        
        //Find Middle
        ListNode middileNode(ListNode head){
            ListNode slow = head;
            ListNode fast = head;
            
            while(fast != null && fast.next != null){
                    slow = slow.next;
                    fast=fast.next.next;
                }
                
                return slow;
        }
        
        
        //Reverse second Half
        ListNode reverseList(ListNode head) {
                
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





}
