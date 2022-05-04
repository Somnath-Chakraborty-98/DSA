public class queueByLL {
    Node front; //head
    Node rear; //tail

    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            next=null;
        }
    }


    boolean isEmpty(){
        if(front == null) return true;
        else return false;
    }

    void enQueue(int data){
        Node node = new Node(data);

        if(isEmpty()){
            front = node;
            rear = node;
        } else{
            rear.next=node;
            rear = node;
        }
        System.out.println("Value "+data +" added to Queue");
    }

    int deQueue(){

        if(isEmpty()){
            System.out.println("Queue is Empty");
            return -1;
        } else {
            Node temp = front;
            front = front.next;
            temp.next = null;
            System.out.println("Value "+ temp.data +" removed from Queue");
            return temp.data;
        }
    }

    int peek(){
        if(isEmpty()){
            System.out.println("Queue is Empty");
            return -1;
        } else {
            System.out.println("Top at the Queue = "+front.data);
            return front.data;
        }
    }




    public static void main(String[] args) {
        queueByLL queue = new queueByLL();

        queue.enQueue(11);
        queue.enQueue(12);
        queue.enQueue(13);
        queue.enQueue(14);
        System.out.println(queue.isEmpty());
        queue.peek();
        queue.deQueue();
        queue.deQueue();
        queue.deQueue();
        queue.peek();
        queue.deQueue();
        System.out.println(queue.isEmpty());
    }
}
