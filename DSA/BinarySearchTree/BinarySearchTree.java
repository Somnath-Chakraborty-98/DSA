import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTree{

    BinaryNode root = null;
    int height;
    
    static class BinaryNode{
        int data;
        BinaryNode left;
        BinaryNode right;
        
        BinaryNode(int data){
            this.data=data;
        }
        
    }
    BinaryNode insert(BinaryNode currentNode, int value){
        
        if(currentNode == null){
            BinaryNode newNode= new BinaryNode(value);
            System.out.println("The Value inserted Successfully");
            return newNode;
        } else if(value <= currentNode.data){
            currentNode.left=insert(currentNode.left, value);
            return currentNode;
        } else{
            currentNode.right=insert(currentNode.right, value);
            return currentNode;
        }
    }

    void insertNode(int value){
        if(root == null){
            BinaryNode newNode= new BinaryNode(value);
            root = newNode;
            System.out.println("Inserted New Node to Tree at Root");
            return;
        }
        insert(root, value);
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


    BinaryNode search(BinaryNode node, int value){
        if(node == null){
            System.out.println("Value not found in BST");
            return null;
        }
        else if(node.data == value){
            System.out.println("Value : "+value+" found in BST");
            return node;
        } 
        else if(value < node.data){
            return search(node.left, value);
        } 
        else {
            return search(node.right, value);
        }
    }

    BinaryNode deleteNode(BinaryNode node, int value){
        if(node == null){
            System.out.println("Value not found in BST");
            return null;
        }
        if(value<node.data){
            node.left=deleteNode(node.left, value);
        } else if(value > node.data){
            node.right=deleteNode(node.right, value);
        } else{

            if(node.left != null && node.right != null){
                BinaryNode temp =node;
                BinaryNode minNodeRight = minNode(temp.right);
                node.data = minNodeRight.data;
                root.right = deleteNode(node.right, minNodeRight.data);
            }
            else if(node.left != null){
                node = node.left;
            } 
            else if(node.right != null){
                node = node.right;
            }
            else{
                node = null;
            }
        }
        return node;
    }

    BinaryNode minNode(BinaryNode root){
        if(root.left == null) return root;
        else{
            return minNode(root.left);
        }
    }

    void deleteBST(){
        root = null;
        System.out.println("BST deleted");
    }




    public static void main(String[] args) {
        BinarySearchTree bst= new BinarySearchTree();

        bst.insertNode(70);
        bst.insertNode(50);
        bst.insertNode(90);
        bst.insertNode(30);
        bst.insertNode(80);
        bst.insertNode(60);
        bst.insertNode(20);
        bst.insertNode(100);
        bst.insertNode(40);

        System.out.println("PreOrder :-");
        bst.preOrder(bst.root);
        System.out.println("");

        System.out.println("InOrder :-");
        bst.inOrder(bst.root);
        System.out.println("");

        System.out.println("PostOrder :-");
        bst.postOrder(bst.root);
        System.out.println("");

        System.out.println("LevelOrder :-");
        bst.levelOrder(bst.root);
        System.out.println("");

        bst.search(bst.root, 75);
    }
}