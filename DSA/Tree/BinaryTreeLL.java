import java.util.LinkedList;
import java.util.Queue;
public class BinaryTreeLL {

    int height;
    BinaryNode root;

    static class BinaryNode{
        int data;
        BinaryNode left;
        BinaryNode right;
        

        BinaryNode(int data){
            this.data=data;
        }
    }


    void preOrder(BinaryNode node){
       
        if(node == null) return;

        System.out.print(node.data + " ");

        preOrder(node.left);
        preOrder(node.right);
        
    }

    void inOrder(BinaryNode node){
        
        if(node == null) return;

        inOrder(node.left);
        System.out.print(node.data + " ");
        inOrder(node.right);
        
    }

    void postOrder(BinaryNode node){
        
        if(node == null) return;

        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.data + " ");
       
    }

    void levelOrder(BinaryNode node){

        if(node == null) return;

        Queue<BinaryNode> queue= new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            BinaryNode presentNode = queue.remove();
            System.out.print(presentNode.data + " ");

            if(presentNode.left != null){
                queue.add(presentNode.left);
            }
            if(presentNode.right != null){
                queue.add(presentNode.right);
            }
        }
    }


    void search(BinaryNode node, int value){
        //Level Order Traversal
        if(node == null) return;

        Queue<BinaryNode> queue= new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            BinaryNode presentNode = queue.remove();
            if(presentNode.data == value){
                System.out.println("Search Successfull, Found the value");
                return;
            }
            else{
                if(presentNode.left != null){
                    queue.add(presentNode.left);
                }
                if(presentNode.right != null){
                    queue.add(presentNode.right);
                }
            }
        }
        System.out.println("Search Unsuccessfull, Value not found");
    }

    void insert(int data){
        BinaryNode newNode = new BinaryNode(data);

        if(root == null){
            root = newNode;
            System.out.println("Inserted New Node to Tree at Root");
            return;
        }
        //Level Order Traversal 
        Queue<BinaryNode> queue= new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()){
            BinaryNode presentNode = queue.remove();
            if(presentNode.left == null){
                presentNode.left = newNode;
                System.out.println("Inserted New Node to Tree");
                break;
            }
            else if(presentNode.right == null){
                presentNode.right = newNode;
                System.out.println("Inserted New Node to Tree");
                break;
            }
            else{
                queue.add(presentNode.left);
                queue.add(presentNode.right);
            }
        }
    }


    void delete(int value){
        Queue<BinaryNode> queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()){
            BinaryNode presentNode = queue.remove();
            if(presentNode.data == value){
                presentNode.data = getDeepestNode().data;
                deleteDeepestNode();
                System.out.println("Node Deleted");
                return;
            } else {
                if(presentNode.left != null){
                    queue.add(presentNode.left);
                }
                if(presentNode.right != null){
                    queue.add(presentNode.right);
                }
            }
        }
        System.out.println("Node doesnot exist");
    }

    // Get Deepest Node
    BinaryNode getDeepestNode(){
        Queue<BinaryNode> queue = new LinkedList<>();
        queue.add(root);
        BinaryNode presentNode = null;

        while(!queue.isEmpty()){
            presentNode = queue.remove();
            if(presentNode.left != null){
                queue.add(presentNode.left);
            }
            if(presentNode.right != null){
                queue.add(presentNode.right);
            }
        }
        return presentNode;
    }

    //Delete deepest Node
    void deleteDeepestNode(){
        Queue<BinaryNode> queue = new LinkedList<>();
        queue.add(root);
        BinaryNode presentNode = null;
        BinaryNode prevNode = null;

        while(!queue.isEmpty()){
            prevNode = presentNode;
            presentNode = queue.remove();

            if(presentNode.left == null){
                presentNode.right = null;
                return;
            }
            else if(presentNode.right == null){
                presentNode.left = null;
                return;
            }
            queue.add(presentNode.left);
            queue.add(presentNode.right);
        }
    }

    void deleteTree(){
        root = null;
        System.out.println("Tree has been Deleted");
    }




    public static void main(String[] args) {
        BinaryTreeLL bt = new BinaryTreeLL();

        BinaryNode N1 = new BinaryNode(1);
        BinaryNode N2 = new BinaryNode(2);
        BinaryNode N3 = new BinaryNode(3);
        BinaryNode N4 = new BinaryNode(4);
        BinaryNode N5 = new BinaryNode(5);
        BinaryNode N6 = new BinaryNode(6);
        BinaryNode N7 = new BinaryNode(7);
        BinaryNode N8 = new BinaryNode(8);
        BinaryNode N9 = new BinaryNode(9);

        N1.left=N2;
        N1.right=N3;
        N2.left=N4;
        N2.right=N5;
        N3.left=N6;
        N3.right=N7;
        N4.left=N8;
        N4.right=N9;

        bt.root=N1;
        System.out.println("PreOrder :-");
        bt.preOrder(bt.root);
        System.out.println("");
        System.out.println("InOrder :-");
        bt.inOrder(bt.root);
        System.out.println("");
        System.out.println("PostOrder :-");
        bt.postOrder(bt.root);
        System.out.println("");
        System.out.println("LevelOrder :-");
        bt.levelOrder(bt.root);
        System.out.println("");

        bt.search(bt.root, 10);



        BinaryTreeLL btInsert = new BinaryTreeLL();
        btInsert.insert(1);
        btInsert.insert(2);
        btInsert.insert(3);
        btInsert.insert(4);
        btInsert.insert(5);
        btInsert.insert(6);

        System.out.println("LevelOrder :-");
        btInsert.levelOrder(btInsert.root);
        System.out.println("");

        System.out.println("Deepest Node :- " + btInsert.getDeepestNode().data);
        btInsert.delete(3);

        System.out.println("LevelOrder :-");
        btInsert.levelOrder(btInsert.root);
        System.out.println("");
    }
}
