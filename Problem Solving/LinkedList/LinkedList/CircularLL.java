public class CircularLL {
    static Node head;
    static Node tail;

    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    public void display() {
        Node temp = head;
        if (head != null) {
            do {
                System.out.print(temp.value + "->");
                temp = temp.next;
            } while (temp != head);
        }

        System.out.println("END");
    }

    public void insertFirst(int val) {
        Node node = new Node(val);
        if (head == null) {
            head = node;
            tail = node;
            node.next = node;
            return;
        }

        node.next = head;
        head = node;
        tail.next = head;
    }

    public void insertEnd(int val) {
        Node node = new Node(val);
        if (head == null) {
            head = node;
            tail = node;
            node.next = node;
            return;
        }

        tail.next = node;
        node.next = head;
        tail = node;
    }

    public void insertAtIndex(int index, int val) {
        Node node = new Node(val);
        if (head == null) {
            head = node;
            tail = node;
            node.next = node;
            return;
        }

        if (index == 0)
            insertFirst(val);

        Node temp = head;
        int i = 0;
        do {
            temp = temp.next;
            i++;
        } while (i < index - 2 && temp != head);

        if (temp == tail)
            insertEnd(val);

        node.next = temp.next;
        temp.next = node;
    }

    public int deleteFirst(){
        Node temp = head;
        int val = head.value;
        head = temp.next;
        tail.next = head;

        return val;
    }

    public int deleteEnd(){
        Node temp = head;
        int val = tail.value;
        if(head == tail)
            deleteLL();
        do{
            temp = temp.next;
        }while(temp.next != tail);

        temp.next = head;
        temp = tail;

        return val;
    }

    public void deleteLL(){
        head = null;
        tail = null;
    }

    public static void main(String[] args) {
        CircularLL cll = new CircularLL();
        cll.insertEnd(2);
        cll.display();
        cll.insertEnd(3);
        cll.insertEnd(4);
        cll.display();
        cll.insertFirst(1);
        cll.display();
        cll.insertAtIndex(3, 9);
        cll.display();
        System.out.println("Deleted Value :- " + cll.deleteFirst());
        cll.display();
        System.out.println("Deleted Value :- " + cll.deleteEnd());
        cll.display();
        cll.insertAtIndex(7, 11);
        cll.display();
    }
}
