import java.util.*;
public class InterviewQuestions {
    Node head;
    Node tail;

    static class Node{
        int data;
        Node prev;
        Node next;

        Node(int data){
            this.data=data;
            next=null;
            prev=null;
        }
    }





    boolean isEmpty(){
        return head == null;
    }

    void display (){
        Node temp = head;

        System.out.print(" START");
        while(temp!=null){
            System.out.print(" <- "+temp.data+" -> ");
            temp=temp.next;
        }
        System.out.println("END");
    }

    void displayNodes (Node head){
        Node temp = head;

        System.out.print(" START");
        while(temp!=null){
            System.out.print(" <- "+temp.data+" -> ");
            temp=temp.next;
        }
        System.out.println("END");
    }

    void diplayReverse(){
        Node temp = head;
        Node last= null;

        System.out.print(" START");
        while(temp!=null){
            last=temp;
            temp=temp.next;
        }
        while(last!=null){
            System.out.print(" <- "+last.data+" -> ");
            last=last.prev;
        }
        
        System.out.println("END");
    }

    void addAtStart(int data){
        Node node= new Node(data);
        node.next=head;
        node.prev=null;
        if(head!=null) head.prev=node;
        head=node;
    }

    void addToEnd(int data){
        Node node = new Node(data);
        Node temp = head;

        if(isEmpty()){
            addAtStart(data);
            return;
        }

        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=node;
        node.prev=temp;
        node.next=null;
    }

    void addAt(int index, int data){
        Node node = new Node(data);
        Node temp = head;

        if(isEmpty() || index==0){
            addAtStart(data);
            return;
        }

        for(int i=0;i<index-1;i++){

            

            if(temp.next==null){
                addToEnd(data);
                return;
            }
            temp=temp.next;
        }

        node.next=temp.next;
        temp.next.prev=node;
        temp.next=node;
        node.prev=temp;

    }

    void deleteFirst(){
        if(isEmpty()) return;
        Node temp = head;
        System.out.println("deleted = " + temp.data);

        head=temp.next;
        head.prev=null;
        temp.next=null;
    }

    void deleteLast(){
        if(isEmpty()) return;
        Node temp = head;

        while(temp.next.next!=null){
            temp=temp.next;
        }
        System.out.println("deleted = " + temp.next.data);
        temp.next.prev=null;
        temp.next=null;
    }

    void deleteAt(int index){
        if(isEmpty()) return;
        Node temp = head;
        if(index == 0){
            deleteFirst();
            return;
        }

        for(int i=0;i<index-1;i++){
            

            if(temp.next.next==null){
                deleteLast();
                return;
            }

            temp=temp.next;
        }
        System.out.println("deleted = " + temp.next.data);
        temp.next.next.prev=temp;
        temp.next=temp.next.next;
    }




    public static void main(String[] args) {
        InterviewQuestions ll = new InterviewQuestions();

        ll.addAtStart(5);
        ll.addAtStart(6);
        ll.addToEnd(10);
        ll.addAtStart(1);
        ll.addToEnd(11);
        ll.addAt(3, 7);
        ll.addAtStart(15);
        ll.addAtStart(6);
        ll.addToEnd(3);
        ll.addToEnd(7);
        ll.addToEnd(5);


        ll.display();
        ll.deleteDuplicate();
        ll.display();
        ll.nThLastElement(2);
        

        
        InterviewQuestions l1=new InterviewQuestions();
        InterviewQuestions l2=new InterviewQuestions();

        l1.addAtStart(7);
        l1.addToEnd(1);
        l1.addToEnd(6);

        l2.addAtStart(5);
        l2.addToEnd(9);
        l2.addToEnd(2);

        ll.sumList(l1, l2);

        ll.partition(ll,7);



        InterviewQuestions list1=new InterviewQuestions();
        InterviewQuestions list2=new InterviewQuestions();

        list1.addAtStart(1);
        list1.addToEnd(3);
        list1.addToEnd(5);

        list2.addAtStart(1);
        list2.addToEnd(2);
        list2.addToEnd(9);
        list2.addToEnd(14);
        list2.addToEnd(17);
        
        ll.mergeSortedLL(list1, list2);

        InterviewQuestions l3= new InterviewQuestions();

        l3.addAtStart(3);
        l3.addAtStart(5);
        l3.addAtStart(6);
        l3.addAtStart(1);
        l3.addAtStart(9);

        ll.linkedListCycle(l3);
        ll.isHappyNumber(19);
        ll.middleOfLinkedList(l3);
        //ll.intersection(list1, list2);
        ll.mergeSortLL(l3.head);
        //ll.recursiveReverseLL(list2.head);

        
        
    }








    //INTERVIEW QUESTIONS SOLVING



    void deleteDuplicate(){
        Node node = head;
        HashSet<Integer> hs=new HashSet<>();

        while(node.next!=null){
            int curVal = node.data;
            if(hs.contains(curVal)){
                node.next.prev=node.prev;
                node.prev.next=node.next;
            } else {
                hs.add(curVal);
            }
            node=node.next;
        }
    }


    void nThLastElement(int n){
        Node node = head;
        while(node.next!=null){
            node=node.next;
        }
        for(int i=0;i<n-1;i++){
            node=node.prev;
        }
        System.out.println("Nth Last Element is = "+ node.data);
    }






    void sumList(InterviewQuestions l1, InterviewQuestions l2) {
        InterviewQuestions sum = new InterviewQuestions();

        InterviewQuestions.Node node1=l1.head;
        InterviewQuestions.Node node2=l2.head;
        int size=1;
        int sum1=0;
        int sum2=0;
        int totalSum=0;

        while(node1.next!=null && node2.next!=null){
            node1=node1.next;
            node2=node2.next;
            size++;
        }
        for(int i=0;i<size;i++){
            sum1=(sum1*10)+node1.data;
            sum2=(sum2*10)+node2.data;

            node1=node1.prev;
            node2=node2.prev;
        }
        totalSum=sum1+sum2;
        while(totalSum>0){
            sum.addAtStart(totalSum%10);
            totalSum=totalSum/10;
        }

        //Display

        sum.display();
    }






    void partition(InterviewQuestions ll, int n){
        InterviewQuestions patition = new InterviewQuestions();
        InterviewQuestions.Node node=ll.head;

        while(node!=null){

            if(patition.head == null || node.data<n){
                patition.addAtStart(node.data);
            }
            else{
                patition.addToEnd(node.data);
            }

            node=node.next;
            
        }

        patition.display();

    }



    void mergeSortedLL(InterviewQuestions list1, InterviewQuestions list2){

        InterviewQuestions merge = new InterviewQuestions();
        InterviewQuestions.Node node1 = list1.head;
        InterviewQuestions.Node node2 = list2.head;

        while(node1!=null && node2!=null){
            if(node1.data<=node2.data){
                merge.addToEnd(node1.data);
                node1=node1.next;
            } 
            else {
                merge.addToEnd(node2.data);
                node2=node2.next;
            } 
        }

        while(node1!=null){
            merge.addToEnd(node1.data);
            node1=node1.next;
        }
        while(node2!=null){
            merge.addToEnd(node2.data);
            node2=node2.next;
        }

        merge.display();

    }




    void linkedListCycle(InterviewQuestions ll){
        
        InterviewQuestions.Node fast = ll.head;
        InterviewQuestions.Node slow = ll.head;

        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;

            if(fast == slow) {
                System.out.println("Cycle Present");
                return;
            }
        }
        System.out.println("Cycle not present");
    }

    void cycleLength(InterviewQuestions ll){
        InterviewQuestions.Node fast = ll.head;
        InterviewQuestions.Node slow = ll.head;
        int length =0;

        while(fast!=null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;

            if(fast == slow) {
                InterviewQuestions.Node temp = slow;
                do{
                    temp=temp.next;
                    length++;
                } while(temp != slow);

                System.out.println("Cycle Present with length = " + length);
            }
        }
        System.out.println("Cycle not present");
    }

    void cycleStartNode(InterviewQuestions ll){
        InterviewQuestions.Node first = ll.head;
        InterviewQuestions.Node second = ll.head;
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
                if(pre = true) System.out.println(first.data);
                return;
            }
        }
        System.out.println("Cycle not present");
    }

    void isHappyNumber(int n){
        int slow = n;
        int fast = n;

        do{
            slow = findSquare(slow);
            fast = findSquare(findSquare(fast));
        } while(fast !=slow);

        if(slow == 1) System.out.println("True");
        else System.out.println("False");


    }
    private int findSquare(int num){
        int ans = 0;
        while(num > 0){
            int temp = num % 10;
            num = num / 10;
            ans += temp*temp;
        }
        return ans;
    }

    void middleOfLinkedList(InterviewQuestions ll){
        InterviewQuestions.Node fast = ll.head;
        InterviewQuestions.Node slow = ll.head;

        while(fast.next!= null && fast.next.next!= null){
            fast=fast.next.next;
            slow=slow.next;
        }
        System.out.println("Middle of Linked List = "+slow.data);
    }

    /*void intersection(InterviewQuestions list1, InterviewQuestions list2){

        if (list1.head == null || list2.head == null) return ;
    if (list1.tail != list2.tail) {
      return;
    }
    InterviewQuestions.Node shorter = new InterviewQuestions.Node(0);
    InterviewQuestions.Node longer = new InterviewQuestions.Node(0);
    if (list1.size > list2.size) {
      longer = list1.head;
      shorter = list2.head;
    } else {
      longer = list2.head;
      shorter = list1.head;
    }

    longer = getKthNode(longer, Math.abs(list1.size-list2.size));
    while (shorter != longer) {
      shorter = shorter.next;
      longer = longer.next;
    }
    System.out.println(longer);


    }*/


    InterviewQuestions.Node mergeSortLL(Node head){
        
        if(head == null || head.next == null) return head;

        InterviewQuestions.Node mid = findMid(head);
        InterviewQuestions.Node left = head;
        InterviewQuestions.Node right = mid.next;
        mid.next = null;


        left = mergeSortLL(left);
        right = mergeSortLL(right);

        InterviewQuestions.Node merge = merge2Sortedll(left, right);

        return merge;
    }

    private Node findMid(Node ll){
        InterviewQuestions.Node fast = ll;
        InterviewQuestions.Node slow = ll;

        while(fast.next!= null && fast.next.next!= null){
            fast=fast.next.next;
            slow=slow.next;
        }
        return slow;
    }

    private InterviewQuestions.Node merge2Sortedll(InterviewQuestions.Node list1, InterviewQuestions.Node list2){

        InterviewQuestions merge = new InterviewQuestions();
        InterviewQuestions.Node node1 = list1;
        InterviewQuestions.Node node2 = list2;

        while(node1!=null && node2!=null){
            if(node1.data<=node2.data){
                merge.addToEnd(node1.data);
                node1=node1.next;
            } 
            else {
                merge.addToEnd(node2.data);
                node2=node2.next;
            } 
        }

        while(node1!=null){
            merge.addToEnd(node1.data);
            node1=node1.next;
        }
        while(node2!=null){
            merge.addToEnd(node2.data);
            node2=node2.next;
        }

        return merge.head;

    }

    void flatenLL(InterviewQuestions ll){}

    void recursiveReverseLL(Node node){

        if(node == tail){    // make the last node as head
            head = tail;
            return;
        }


        recursiveReverseLL(node.next);

        tail.next = node; 
        tail = node;
        tail.next = null; // making the old pointer null
    }

    Node iterativeReverseLL(Node head){
        Node prev = null;
        Node present = head;
        Node next = head.next;

        while(present != null){
            present.next = prev;
            prev = present;
            present = next;

            if(next!=null) next = next.next;
        }

        head = prev; // head = prev

        return head;
    }


    Node reverseSubList(Node head, int left, int right){
        if(left == right) return;

        Node present = head;
        Node prev = null;

        for(int i=0; present != null && i<left-1; i++){
            prev = present;
            present = present.next;
        }

        Node last = prev;
        Node newEnd = present;

        // reverse between left and right
        Node next = present.next;
        for(int i=0; present != null && i< right - left + 1; i++){
            present.next = prev;
            prev = present;
            present = next;

            if(next!=null) next = next.next;
        }

        if(last != null) last.next = prev;
        else head = prev;

        newEnd.next = present;

        //return head;
    }

    boolean palindrome(Node head){
        Node mid = findMid(head);
        Node headSecond = iterativeReverseLL(mid);
        Node rereverseHead = headSecond;

        //compare both halves

        while(head != null && headSecond != null){
            if(head.data != headSecond.data) break;
            head = head.next;
            headSecond = headSecond.next;
        }
        iterativeReverseLL(rereverseHead);


        if(head == null || headSecond == null) return true;
        else return false;

    }

    
    void reorderList(Node head){
        Node mid = findMid(head);

        Node headFirst = head;
        Node headSecond = iterativeReverseLL(mid);

        Node temp = headFirst.next;

        while(headFirst!=null || headSecond!=null){
            temp = headFirst.next;
            headFirst.next = headSecond;
            headFirst = temp;

            temp = headSecond.next;
            headSecond.next = headFirst;
            headSecond = temp;
        }

        if(headFirst!=null) headFirst.next=null;   //setting tail next to null
    }

    void reverseKGroup(Node head, int k){
        Node prev = null;
        Node curr = head;
        Node next = head.next;
        Node last = prev;
        Node newLast = curr;

        while(curr != null){
            
            for(int i=0;i<k;i++){
                curr.next = prev;
                prev = curr;
                curr = next;

                if(next!=null) next = next.next;
            }
            if(last != null) last.next = prev;
            else head = prev;
            newLast.next=curr;
        }
    }


}
