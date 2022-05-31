public class BinaryTreeArray {

    String[] arr;
    int lastUsedIndex;

    BinaryTreeArray(int size){
        arr = new String[size+1];
        this.lastUsedIndex=0;
        System.out.println("Binary Tree of Size " + size +" has been created");

    }

    boolean isFull(){
        if(arr.length-1 == lastUsedIndex) return true;
        else return false;
    }

    void insert(String data){
       if(!isFull()){
           arr[lastUsedIndex+1]=data;
           lastUsedIndex++;
           System.out.println("Insertion Successfull = "+data);
        } else System.out.println("Binary Tree is Full"); 
    }

    void preOrder(int index){
        if(index > lastUsedIndex) return;

        System.out.print(arr[index] + " ");
        preOrder(index*2);
        preOrder((index*2) +1);
    }

    void inOrder(int index){
        if(index > lastUsedIndex) return;

        inOrder(index*2);
        System.out.print(arr[index] + " ");
        inOrder((index*2) +1);
    }

    void postOrder(int index){
        if(index > lastUsedIndex) return;

        postOrder(index*2);
        postOrder((index*2) +1);
        System.out.print(arr[index] + " ");
    }

    void levelOrder(int index){
        if(index > lastUsedIndex) return;

        for(int i=1;i<=lastUsedIndex;i++){
            System.out.print(arr[i] + " ");
        }
    }

    int search(String value){
        for(int i=1;i<=lastUsedIndex;i++){
            if(arr[i].equals(value)){
                System.out.println("Search Successfull, Found the value");
                return i;
            }
        }
        System.out.println("Search Unsuccessfull, Value not found");
        return -1;
    }

    void deleteNode(String value){
        int position = search(value);
        if(position == -1) return;
        arr[position] = arr[lastUsedIndex];
        arr[lastUsedIndex]=null;
        lastUsedIndex--;
        System.out.println("Node deletion Successfull");
    }

    void deleteTree(){
        try{
            arr=null;
            System.out.println("Deleted Binary Tree, Successfully");
        } catch(Exception e){
            System.out.println("Deletion of Binary Tree, Unsuccessfull ");
        }
    }



    
    public static void main(String[] args) {
        BinaryTreeArray bt = new BinaryTreeArray(9);

        bt.insert("1");
        bt.insert("2");
        bt.insert("3");
        bt.insert("4");
        bt.insert("5");
        bt.insert("6");
        bt.insert("7");
        bt.insert("8");
        bt.insert("9");

        System.out.println("PreOrder :-");
        bt.preOrder(1);
        System.out.println("");

        System.out.println("InOrder :-");
        bt.inOrder(1);
        System.out.println("");

        System.out.println("PostOrder :-");
        bt.postOrder(1);
        System.out.println("");

        System.out.println("LevelOrder :-");
        bt.levelOrder(1);
        System.out.println("");

        bt.search("9");

        bt.deleteNode("3");

        System.out.println("LevelOrder :-");
        bt.levelOrder(1);
        System.out.println("");
        
        bt.deleteTree();

    }
}
