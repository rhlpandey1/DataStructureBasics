package org.gfg.linkedlist;

public class RotateLinkedList {
    static Node head;
    class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            next=null;
        }
    }
    public void push(int new_data){
        Node new_node=new Node(new_data);
        new_node.next=head;
        head=new_node;
    }
    public static void printList(){
        Node n=head;
        while(n!=null){
            System.out.print(n.data+" ");
            n=n.next;
        }
    }
    public static void rotate(int k){
        if(k==0)
            return;
        Node current =head;
        int count=1;
        while(count<k && current!=null){
            current=current.next;
            count++;
        }
        if (current==null)
            return ;

        Node kth=current;
        while (current.next!=null){
            current=current.next;
        }
        current.next=head;
        head=kth.next;
        kth.next=null;

    }
    public static void main(String[] args) {
        RotateLinkedList ll=new RotateLinkedList();
        ll.push(9);
        ll.push(8);
        ll.push(7);
        ll.push(4);
        ll.push(2);
        printList();
        System.out.println();
        rotate(3);
        printList();
    }
}
