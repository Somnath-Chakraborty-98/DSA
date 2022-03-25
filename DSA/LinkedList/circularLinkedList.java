public class circularLinkedList {
    
    Node head;
    Node tail;

    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
        }
    }

    boolean isEmpty(){
        return (head==null && tail==null);
    }

    void display(){
        if(isEmpty()) return;

        Node temp=head;

        while(temp!=tail){
            System.out.print(temp.data+" -> ");
            temp=temp.next;
        }
        System.out.println("HEAD");
    }

    void addAtStart(int data){
        Node node= new Node(data);
        if(isEmpty()){
            head=node;
            tail=node;
            node.next=node;
            return;
        }
        node.next=head;
        tail.next=node;
        head=node;
    }

    void addToEnd(int data){
        Node node=new Node(data);

        if(isEmpty()){
            addAtStart(data);
            return;
        }
        node.next=head;
        tail.next=node;
        tail=node;
    }

    void addAt(int position,int data){
        Node node=new Node(data);
        Node temp=head;

        if(isEmpty() || position==0){
            addAtStart(data);
            return;
        }
        for(int i=0;i<position-1;i++){
            if(temp.next==tail){
                addToEnd(data);
                return;
            }
            temp=temp.next;
        }
        node.next=temp.next;
        temp.next=node;
    }

    void deleteFirst(){
        if(isEmpty()){
            return;
        }

        Node temp=head;
        tail.next=temp.next;
        temp.next=null;
        head=tail.next;
        System.out.println("deleted = " + temp.data);
    }

    void deleteLast(){
        if(isEmpty()){
            return;
        }

        Node temp=head;

        while(temp.next!=tail){
            temp=temp.next;
        }
        temp.next=head;
        tail.next=null;
        System.out.println("deleted = " + tail.data);
        tail=temp;
    }

    void deleteAt(int position){
        if(isEmpty()){
            return;
        }
        Node temp=head;

        if(position==0){
            deleteFirst();
            return;
        }
        for(int i=0;i<position-1;i++){
            if(temp.next==tail){
                deleteLast();
                return;
            }
            temp=temp.next;
        }
        System.out.println("deleted = " + temp.next.data);
        temp.next=temp.next.next;

    }







    public static void main(String[] args) {
        circularLinkedList ll = new circularLinkedList();

        ll.addAtStart(5);
        ll.addAtStart(6);
        ll.addToEnd(10);
        ll.addAtStart(1);
        ll.addToEnd(11);
        ll.addAt(3, 7);
        ll.deleteFirst();
        ll.addAtStart(15);
        ll.addAtStart(4);
        ll.deleteLast();
        ll.deleteAt(5);


        ll.display();
    }
}
