package org.gfg.linkedlist;

import java.util.HashSet;

public class RemoveLoopInLinkedList {
    static  Node head;
    static class Node{
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
            next=null;
        }
    }
    public static boolean detectAndRemoveLoopUsingHashing(Node head){
        // code here
        // remove the loop without losing any nodes
        HashSet<Node> set=new HashSet<>();
        Node prev=null;
        while(head!=null){
            if(set.contains(head)){
                prev.next=null;
                return true;
            }
            else{
                set.add(head);
                prev=head;
                head=head.next;
            }
        }
        return false;

    }
    static  public  void  push(int new_data){
        Node newNode=new Node(new_data);
        newNode.next=head;
        head=newNode;
    }
    public static void printList(){
        Node n=head;
        while(n!=null){
            System.out.println(n.data);
            n=n.next;
        }
    }
    public static void main(String[] args) {
        RemoveLoopInLinkedList dl=new RemoveLoopInLinkedList() ;
        dl.push(20);
        dl.push(4);
        dl.push(15);
        dl.push(10);
        printList();
        dl.head.next.next.next.next=dl.head;
        System.out.println("------------------------------");
        if((detectAndRemoveLoopUsingHashing(head))){
            System.out.println("After removing loop");
            printList();
        }
        else
            System.out.println("loop is not found");
    }
}
