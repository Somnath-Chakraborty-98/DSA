public class threeInOne{

    private int numberOfStacks = 3;
    private int stackCapacity;
    private int[] values;
    private int[] sizes;

    public threeInOne(int stackSize){
        stackCapacity = stackSize;
        values = new int[stackSize * numberOfStacks];
        sizes = new int[numberOfStacks];
    }

    boolean isFull(int stackNum){
        if(sizes[stackNum] == stackCapacity) return true;
        else return false;
    }

    boolean isEmpty(int stackNum){
        if(sizes[stackNum] == 0) return true;
        else return false;
    }

    //index of top
    int indexTop(int stackNum){
        int offSet = stackNum * stackCapacity;
        int size = sizes[stackNum];
        return offSet + size -1;
    }

    void push(int stackNum, int data){
        if(isFull(stackNum)) System.out.println("Stack is Full");
        else{
            sizes[stackNum]++;
            values[indexTop(stackNum)] = data;
        }
    }

    int pop(int stackNum){
        if(isEmpty(stackNum)) {
            System.out.println("Stack is Empty");
            return -1;
        } else {
            int topIndex = indexTop(stackNum);
            int temp = values[topIndex];
            values[topIndex] = 0;
            sizes[stackNum]--;
            System.out.println("Pooped = " +temp);
            return temp;
        }
    }

    int peek(int stackNum){
        if(isEmpty(stackNum)) {
            System.out.println("Stack is Empty");
            return -1;
        } else {
            return values[indexTop(stackNum)];
        }
    }






    public static void main(String[] args) {
        threeInOne stack = new threeInOne(3);

        System.out.println(stack.isFull(0));
        stack.push(0, 1);
        stack.push(0, 1);
        stack.push(0, 1);
        stack.push(1, 2);
        stack.push(1, 2);
        stack.push(1, 2);
        stack.pop(0);
        
    }
}