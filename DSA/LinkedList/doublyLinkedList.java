public class doublyLinkedList {
    
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

    void addAtStart(int data){
        Node node= new Node(data);
        node.next=head;
        node.prev=null;
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
        doublyLinkedList ll = new doublyLinkedList();

        
        ll.addAtStart(1);
        ll.addToEnd(10);
        ll.addAt(1, 3);
        ll.addAt(2, 4);
        ll.addAt(1, 2);
        ll.addAt(1, 11);
        ll.addAt(0, 0);
        ll.deleteFirst();
        ll.deleteLast();
        ll.deleteAt(1);
        System.out.println(ll.head.data);
        
        


        ll.display();
    }
}
