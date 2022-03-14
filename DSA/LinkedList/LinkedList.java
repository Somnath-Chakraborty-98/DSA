import javax.sound.midi.Track;

public class LinkedList {
    Node head;

    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
            next=null;
        }
    }
//Node Creation Complete

    boolean isEmpty(){
        return head == null;
    }

    void traverse (Node head){
        Node temp = head;

        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
    }

    void add(int data){
        
    }
    

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();

        
    }
}
