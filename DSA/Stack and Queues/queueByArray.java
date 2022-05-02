public class queueByArray {

    int[] arr;
    int front;
    int rear;

    public queueByArray(int size){
        this.arr = new int[size];
        this.front=-1;
        this.rear=-1;
        System.out.println("The Queue is created with size of : "+size);
    }
    
    boolean isEmpty(){
        if(front == arr.length-1 || rear == -1) return true;
        else return false;
    }

    boolean isFull(){
        if(rear == arr.length-1) return true;
        else return false;
    }

    void enQueue(int data){
        if(isFull()) System.out.println("Queue is Full");
        else{
            rear++;
            arr[rear] = data;

            System.out.println("Value "+data+" added to Queue");

            if(front == -1) front++;
        }
    }

    int deQueue(){
        if(isEmpty()){
            System.out.println("Queue is Empty");
            return -1;
        } else {
            int temp = arr[front];
            front++;
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
        queueByArray queue = new queueByArray(4);
        queue.enQueue(1);
        queue.enQueue(2);
        queue.enQueue(3);
        queue.enQueue(4);
        queue.enQueue(5);
        queue.peek();
        queue.deQueue();
        queue.deQueue();
        queue.peek();
        queue.deQueue();
        queue.deQueue();
        queue.deQueue();
    }
}
