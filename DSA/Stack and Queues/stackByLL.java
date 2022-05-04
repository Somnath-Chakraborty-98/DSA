public class stackByLL {
    Node top; //head

    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            next=null;
        }
    }


    boolean isEmpty(){
        if(top == null) return true;
        else return false;
    }

    void push(int data){
        Node node = new Node(data);
        node.next = top;
        top = node;
        System.out.println("Value "+data +" Push Successfull");
    }

    int pop(){
        if(isEmpty()){
            System.out.println("Stack UnderFlow");
            return -1;
        } else {
            Node temp = top;
            top = top.next;
            temp.next = null;
            System.out.println("Value "+ temp.data +" Pop Successfull");
            return temp.data;
        }
    }

    int peek(){
        if(isEmpty()){
            System.out.println("Stack Empty");
            return -1;
        } else {
            System.out.println("Value at Top = "+top.data);
            return top.data;
        }
    }

    void deleteStack(){
        top = null;
        System.out.println("Stack deleted Successfully");
    }





    public static void main(String[] args) {
        stackByLL stack = new stackByLL();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        stack.pop();
        stack.peek();
        stack.pop();
        stack.peek();
        stack.deleteStack();
        stack.peek();
    }
}
