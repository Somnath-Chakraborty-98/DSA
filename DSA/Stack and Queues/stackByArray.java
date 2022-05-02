public class stackByArray{
    int[] arr;
    int top;

    public stackByArray(int size){
        this.arr = new int[size];
        this.top = -1;
        System.out.println("The Stack is created with size of : "+size);
    }


    boolean isEmpty(){
        if(top == -1) return true;
        else return false;
    }

    boolean isFull(){
        if(top == arr.length-1) return true;
        else return false;
    }

    void push(int data){
        if(isFull()) System.out.println("Stack OverFlow");
        else{
            top++;
            arr[top] = data;
            System.out.println("Value "+data +" Push Successfull");
        }
    }

    int pop(){
        if(isEmpty()) {
            System.out.println("Stack UnderFlow");
            return -1;
        }
        else{
            int temp = arr[top];
            top--;
            System.out.println("Value "+ temp +" Pop Successfull");
            return temp;
        }

    }

    int peek(){
        if(isEmpty()){
            System.out.println("Stack Empty");
            return -1;
        } else {
            System.out.println("Value at Top = "+arr[top]);
            return arr[top];
        }
    }
    void deleteStack(){
        arr = null;
        System.out.println("Stack deleted Successfully");
    }







    public static void main(String[] args) {
        stackByArray stack = new stackByArray(4);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(2);
        stack.peek();
        stack.pop();
        stack.pop();
        stack.peek();
        stack.deleteStack();
    }
}