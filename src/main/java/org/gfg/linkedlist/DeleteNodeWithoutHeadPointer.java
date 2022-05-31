package org.gfg.linkedlist;

public class DeleteNodeWithoutHeadPointer {

    static Node head;
    static class Node {

        int data;
        Node next;
        Node(int d)
        {
            data = d;
            next = null;
        }
    }
    public void push(int new_data){
        Node new_node=new Node(new_data);
        new_node.next=head;
        head=new_node;
    }

    void printList()
    {
        Node node=head;
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }

    void deleteNode(Node node)
    {
        Node temp = node.next;
        node.data = temp.data;
        node.next = temp.next;
        System.gc();
    }

    // Driver code
    public static void main(String[] args)
    {
        DeleteNodeWithoutHeadPointer list = new DeleteNodeWithoutHeadPointer();
        /*list.head = new Node(1);
        list.head.next = new Node(12);
        list.head.next.next = new Node(1);
        list.head.next.next.next = new Node(4);
        list.head.next.next.next.next = new Node(1);*/
        list.push(1);
        list.push(12);
        list.push(1);
        list.push(4);
        list.push(1);
        System.out.println("Before Deleting ");
        list.printList();

        /* I m deleting the head itself.
         You can check for more cases */
        list.deleteNode(head);
        System.out.println("");
        System.out.println("After deleting ");
        list.printList();
        }
    }

