public class LinkedList {

    private Node head;
    private Node tail;
    private int size;

    public LinkedList() {
        this.size = 0;
    }

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
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;

        if (tail == null)
            tail = head;

        size += 1;
    }

    public void inserEnd(int val) {

        if (tail == null)
            insertFirst(val);

        Node node = new Node(val);
        tail.next = node;
        tail = node;

        size += 1;
    }

    public void insetAt(int val, int index) {
        if (index == 0) {
            insertFirst(val);
            return;
        }

        if (index == size) {
            inserEnd(val);
            return;
        }

        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }

        Node node = new Node(val, temp.next);
        temp.next = node;

        size++;
    }

    public int deleteFirst() {
        if (size == 0)
            return -1;

        int val = head.value;
        head = head.next;
        if (head == null)
            tail = null;

        size--;
        return val;
    }

    public int deleteEnd(){
        if(size == 0)
        return -1;

        int val = tail.value;
        


        size--;
        return val;
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertFirst(4);
        list.insertFirst(2);
        list.insertFirst(3);
        list.insertFirst(6);
        list.display();
        System.out.println(list.deleteFirst());
        list.display();
        list.inserEnd(8);
        list.display();
    }
}