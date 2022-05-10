package org.gfg;

public class LinkedList {
     Node head;
    static class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            next =null;
        }
    }

    //insertion at the beginning
    public void push(int n){
        Node new_node=new Node(n);
        new_node.next=head;
        head=new_node;
    }
    //inserting after a node
    public void insertAfter(Node prev_node,int n){
        Node new_node=new Node(n);
        if(prev_node==null)
        {
            System.out.println("Previous node can't be null");
            return;
        }
        new_node.next=prev_node.next;
        prev_node.next=new_node;
    }
    public void printList(){
        Node n=head;
        while(n!=null){
            System.out.println(n.data+" ");
            n=n.next;
        }
    }
    public static void main(String[] args) {

        LinkedList ll=new LinkedList();
        ll.push(1);
        ll.push(2);
        ll.insertAfter(ll.head.next,6);
        ll.printList();
    }

}
