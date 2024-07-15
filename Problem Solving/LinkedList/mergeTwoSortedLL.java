public class mergeTwoSortedLL {


    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }


    class Solution1 {
        public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
            
            if (list1 == null) return list2;
            
            if (list2 == null) return list1;
            
            ListNode temp;
            
            if (list1.val <= list2.val) {
                temp = list1;
                list1 = list1.next;
            }
            else {
                temp = list2;
                list2 = list2.next;
            }
            
            ListNode node = temp;
            
            while (true) {
                
                if (list1 == null) {
                    node.next = list2;
                    break;
                }
                
                if (list2 == null) {
                    node.next = list1;
                    break;
                }
                
                if (list1.val <= list2.val) {
                    node.next = list1;
                    list1 = list1.next;
                } else {
                    node.next = list2;
                    list2 = list2.next;
                }
                node = node.next;
            }
            
            
            return temp;
            
            
        }
    }
    
    class Solution2{
        public ListNode merge(ListNode list1, ListNode list2){
            ListNode dummyHead = new ListNode();
            ListNode tail = dummyHead;

            while(list1 != null && list2 != null){

                if(list1.val < list2.val){
                    tail.next = list1;
                    list1 = list1.next;
                    tail = tail.next;
                } else {
                    tail.next = list2;
                    list2 = list2.next;
                    tail = tail.next;
                }
            }

            tail.next = (list1 != null) ? list1: list2;
            return dummyHead.next;
        }
    }
    
}
