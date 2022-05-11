public class stackMin {
    Node top; //head
    Node min;

    static class Node{
        int data;
        Node next;

        Node(int data, Node next){
            this.data=data;
            this.next=next;
        }
    }

    boolean isEmpty(){
        if(top == null) return true;
        else return false;
    }

    int min(){ 
        return min.data;
    }

    void push(int data){
        if (min == null) {
            min = new Node(data, min);
        } else if (min.data < data) {
            min = new Node(min.data, min);
        } else {
            min = new Node(data, min);
        }
        top = new Node(data, top);
        
    }

    int pop(){
        min = min.next;
        int result = top.data;
        top = top.next;
        return result;
    }






    public static void main(String[] args) {
        stackMin stack = new stackMin();

        //stack.min();
        stack.push(10);
        stack.push(3);
        stack.push(5);
        stack.push(7);
        stack.push(9);
        System.out.println("Top =" + stack.top.data);
        System.out.println("Min = "+ stack.min());
        stack.pop();
        stack.pop();
        System.out.println("Top =" + stack.top.data);
        System.out.println("Min = "+ stack.min());
        stack.push(1);
        System.out.println("Min = "+ stack.min());
    }
}
