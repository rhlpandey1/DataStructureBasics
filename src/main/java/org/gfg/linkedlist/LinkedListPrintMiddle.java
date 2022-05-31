package org.gfg.linkedlist;

public class LinkedListPrintMiddle {
    Node head;

    class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            next=null;
        }
    }

    public void printMiddle(){

        Node slow_ptr=head;
        Node fast_ptr=head;
        while(slow_ptr!=null && fast_ptr.next!=null){
            fast_ptr=fast_ptr.next.next;
            slow_ptr=slow_ptr.next;
        }
        System.out.println("The middle node is "+slow_ptr.data);
    }
    public void push(int n){
        Node new_node=new Node(n);
        new_node.next=head;
        head=new_node;
    }
    public void printList(){
        Node h = head;
        while(h!=null){
            System.out.println(h.data);
            h=h.next;
        }
    }

    public static void main(String[] args) {
        LinkedListPrintMiddle ll=new LinkedListPrintMiddle();
        ll.push(1);
        ll.push(2);
        ll.push(3);
        ll.push(4);
        ll.push(5);
        ll.printList();
        ll.printMiddle();

    }
}
