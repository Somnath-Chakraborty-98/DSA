public class LinkedList {
    Node head;

    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            next=null;
        }
    }
//Node Creation Complete

    boolean isEmpty(){
        return head == null;
    }

    void display (){
        Node temp = head;

        while(temp!=null){
            System.out.print(temp.data+" -> ");
            temp=temp.next;
        }
        System.out.println("END");
    }

    void addAtStart(int data){

        Node node = new Node(data);
        node.next=head;
        head = node; 
    }

    void addToEnd(int data){
        Node node = new Node(data);
        Node temp = head;

        if(isEmpty()) {
            addAtStart(data);
            return;
        } 

        while(temp.next!=null){
            temp=temp.next;
        }

        temp.next=node;
        node.next=null;
    }

    void addAt(int index, int data){
        Node temp = head;
        Node node= new Node(data);

        for(int i=0;i< index-1;i++){

            if(index == 0){
                addAtStart(data);
                return;
            }

            if(temp.next==null){
                addToEnd(data);
                return;
            }

            temp=temp.next;
        }
        node.next=temp.next;
        temp.next=node;
    }
    
    void deleteFirst(){
        if(isEmpty()) return;
        Node temp = head;
        head=temp.next;
        temp.next=null;
        System.out.println("deleted = " + temp.data);
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();

        ll.addAtStart(5);
        ll.addAtStart(6);
        ll.addToEnd(10);
        ll.addAtStart(1);
        ll.addToEnd(11);
        ll.addAt(3, 7);
        ll.deleteFirst();

        ll.display();
    }
}
