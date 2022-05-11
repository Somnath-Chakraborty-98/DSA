import java.util.Stack;
public class queueUsingStack{

    Stack<Integer> stackNew, stackOld;

    public queueUsingStack(){
        stackNew = new Stack<>();
        stackOld = new Stack<>();
    }

    public int size(){
        return stackNew.size() + stackOld.size();
    }

    void enQueue(int data){
        stackNew.push(data);
    }

    int deQueue(){
        shiftStack();
        return stackOld.pop();
    }

    int peek(){
        shiftStack();
        return stackOld.peek(); 
    }

    void shiftStack(){
        if(stackOld.isEmpty()){
            while(!stackNew.isEmpty()){
                int popData = stackNew.pop();
                stackOld.push(popData);
            }
        }
    }







    public static void main(String[] args) {
        
    }
}