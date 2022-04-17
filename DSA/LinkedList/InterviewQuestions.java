import java.util.*;
public class InterviewQuestions {
    Node head;

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

        InterviewQuestions.Node temp = sum.head;

        System.out.print(" START");
        while(temp!=null){
            System.out.print(" <- "+temp.data+" -> ");
            temp=temp.next;
        }
        System.out.println("END");
        
        
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

        InterviewQuestions.Node temp = patition.head;

        System.out.print(" START");
        while(temp!=null){
            System.out.print(" <- "+temp.data+" -> ");
            temp=temp.next;
        }
        System.out.println("END");

    }


    void intersection(){}


}
