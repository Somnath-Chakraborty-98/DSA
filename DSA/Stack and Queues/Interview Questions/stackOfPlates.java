public class stackOfPlates {
    Node top;
    Node bottom;
    int size=0;
    int capacity;
    
    static class Node{
        int data;
        Node above;
        Node below;

        Node(int data, Node next){
            this.data=data;
        }
    }

    public stackOfPlates(int capacity){
        this.capacity=capacity;
    }

    boolean isFull(){
        if(capacity == size) return true;
        else return false;
    }

    void join(Node above, Node below){
        
    }






    

    public static void main(String[] args) {
        
    }
}
