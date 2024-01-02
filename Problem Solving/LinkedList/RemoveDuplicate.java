public class RemoveDuplicate {
    
    Node head;

    static class Node{
        int value;
        Node next;

        Node(int value){
            this.value=value;
            next=null;
        }
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public void removeDup(){
        Node temp = head;
        while(temp != null){
            if(temp.value == temp.next.value){
                Node dupNode = temp.next;
                temp.next = temp.next.next;
                dupNode.next = null;
            }

            temp = temp.next;
        }
    }

    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;
    }


    public static void main(String[] args) {
        RemoveDuplicate list = new RemoveDuplicate();
        list.insertFirst(3);
        list.insertFirst(3);
        list.insertFirst(2);
        list.insertFirst(1);
        list.insertFirst(1);
        list.display();

        list.removeDup();
        list.display();
    }
}
