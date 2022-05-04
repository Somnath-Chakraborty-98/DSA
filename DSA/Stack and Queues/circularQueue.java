public class circularQueue {

    int[] arr;
    int front;
    int rear;

    public circularQueue(int size){
        this.arr = new int[size];
        this.front=-1;
        this.rear=-1;
        System.out.println("The Circular Queue is created with size of : "+size);
    }


    boolean isEmpty(){
        if(front == arr.length-1 || rear == -1) return true;
        else return false;
    }

    boolean isFull(){
        if(rear+1 == front) return true;
        else if(front == 0 && rear==arr.length-1) return true;
        else return false;
    }

    void enQueue(int data){
        if(isFull()) System.out.println("Queue is Full");
        else{
            if(front == -1) {
                front++;
                rear++;
            }
            else{
                if(rear == arr.length-1) rear=0;
                else rear++;
            }

            arr[rear] = data;
            System.out.println("Value "+data+" added to Queue");    
        }
    }

    int deQueue(){
        if(isEmpty()){
            System.out.println("Queue is Empty");
            return -1;
        } else {
            int temp = arr[front];
            arr[front]=0;
            if(front == rear) front=rear=-1;
            else if(front == arr.length-1) front=0;
            else front++;
            System.out.println("Value "+temp+" removed from Queue");
            return temp;
        }
    }

    int peek(){
        if(isEmpty()){
            System.out.println("Queue is Empty");
            return -1;
        } else {
            System.out.println("Top at the Queue = "+arr[front]);
            return arr[front];
        }
    }







    public static void main(String[] args) {
        circularQueue queue = new circularQueue(5);

        queue.enQueue(1);
        queue.enQueue(2);
        queue.enQueue(3);
        queue.enQueue(4);
        queue.enQueue(5);
        System.out.println(queue.isFull());
        queue.enQueue(6);
        queue.deQueue();
        queue.deQueue();
        queue.enQueue(6);
        System.out.println(queue.isFull());
        queue.enQueue(7);
        System.out.println(queue.isFull());
    }
}
