package org.gfg.linkedlist;

import java.util.HashSet;

public class DetectLoopInLinkedList {
    static  Node head;
    static class Node{
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
            next=null;
        }
    }
    //this method will hash set for detecting the loop
    public static boolean detectLoopUsingHashing(Node head){

        HashSet<Node> set=new HashSet<>();
        while(head!=null){
            // If we have already this node
            // in hashmap it means there is a cycle
            // (Because you are encountering the node second time).
                if(set.contains(head))
                    return true;
                set.add(head);
                head=head.next;
        }
        return false;
    }
    public static boolean detectLoopUsingFloydCycleFindingAlgo(){
        Node slow_p=head;
        Node fast_p=head;
        boolean flag=false;
        while(slow_p!=null && fast_p!=null && fast_p.next!=null){
            slow_p=slow_p.next;
            fast_p=fast_p.next.next;
            if(slow_p==fast_p){
                flag=true;
                break;
            }
        }
        return flag;
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
        DetectLoopInLinkedList dl=new DetectLoopInLinkedList();
        dl.push(20);
        dl.push(4);
        dl.push(15);
        dl.push(10);
        printList();
        dl.head.next.next.next.next=dl.head;
        if(detectLoopUsingHashing(head))
            System.out.println("Loop found");
        else
            System.out.println("no loop");

        System.out.println(detectLoopUsingFloydCycleFindingAlgo());
    }
}
