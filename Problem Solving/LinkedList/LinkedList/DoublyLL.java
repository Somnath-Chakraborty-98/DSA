public class DoublyLL {

    Node head;

    private class Node {
        private int value;
        private Node next;
        private Node prev;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next, Node prev) {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
    }

    public void display() {
        Node node = head;
        while (node != null) {
            System.out.print(node.value + "->");
            node = node.next;
        }
        System.out.println("END");
    }

    public void displayReverse() {
        Node node = head;
        while (node.next != null) {
            node = node.next;
        }

        while (node != null) {
            System.out.print(node.value + "->");
            node = node.prev;
        }
        System.out.println("END");
    }

    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        if (head != null)
            head.prev = node;
        head = node;
    }

    public void insertEnd(int val) {
        Node node = new Node(val);
        Node temp = head;
        while (temp.next != null)
            temp = temp.next;
        temp.next = node;
        node.prev = temp;
        node.next = null;
    }

    public void insertAtIndex(int index, int val){
        if(index == 0){
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        Node temp = head;
        for(int i = 0; i < index - 2; i++){
            temp = temp.next;
        }

        if(temp.next == null){
            insertEnd(val);
            return;
        }
        temp.next.prev = node;
        node.next = temp.next;
        temp.next = node;
        node.prev = temp;
    }

    // ------------------------------------------------------------------------------------//
    // -------------------------------------MAIN-------------------------------------------//
    public static void main(String[] args) {
        DoublyLL ll = new DoublyLL();

        ll.insertFirst(5);
        ll.insertFirst(4);
        ll.insertFirst(3);
        ll.insertFirst(7);
        ll.insertFirst(9);
        ll.insertFirst(8);
        ll.display();
        ll.displayReverse();
        ll.insertEnd(10);
        ll.insertEnd(13);
        ll.insertEnd(12);
        ll.insertEnd(11);
        ll.display();
        ll.displayReverse();
        ll.insertAtIndex(3, 99);
        ll.display();
        ll.insertAtIndex(0, 100);
        ll.display();
        ll.insertAtIndex(1, 101);
        ll.display();
        ll.insertAtIndex(14, 102);
        ll.display();
        ll.insertAtIndex(14, 103);
        ll.display();
    }
}
