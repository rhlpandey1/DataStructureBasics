package org.gfg.linkedlist;

import org.w3c.dom.Node;

class LinkedList {
    Node head;
    static class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            next = null;
        }
    }
    public void printList()
    {
        Node n = head;
        while (n != null) {
            System.out.print(n.data + " ");
            n = n.next;
        }
    }
    public void push(int new_data)
    {
    /* 1 & 2: Allocate the Node &
              Put in the data*/
         Node new_node = new Node(new_data);

        /* 3. Make next of new Node as head */
        new_node.next = head;

        /* 4. Move the head to point to new Node */
        head = new_node;
    }
    public void insertAfter(Node prev_node, int new_data)
    {
        /* 1. Check if the given Node is null */
        if (prev_node == null) {
            System.out.println(
                    "The given previous node cannot be null");
            return;
        }

    /* 2. Allocate the Node &
    3. Put in the data*/
        Node new_node = new Node(new_data);

        /* 4. Make next of new Node as next of prev_node */
        new_node.next = prev_node.next;

        /* 5. make next of prev_node as new_node */
        prev_node.next = new_node;
    }
    public void append(int new_data)
    {
    /* 1. Allocate the Node &
       2. Put in the data
       3. Set next as null */
        Node new_node = new Node(new_data);

    /* 4. If the Linked List is empty, then make the
           new node as head */
        if (head == null)
        {
            head = new Node(new_data);
            return;
        }

    /* 4. This new node is going to be the last node, so
         make next of it as null */
        new_node.next = null;

        /* 5. Else traverse till the last node */
        Node last = head;
        while (last.next != null)
            last = last.next;

        /* 6. Change the next of last node */
        last.next = new_node;
        return;
    }
    public static void main(String[] args) {
        LinkedList linkedList=new LinkedList();
        /*linkedList.head=new Node(1);
        Node second=new Node(2);
        Node third=new Node(3);
        linkedList.head.next=second;
        second.next=third;*/
        // Insert 6.  So linked list becomes 6->NUllist
        linkedList.append(6);
        // Insert 7 at the beginning. So linked list becomes
        // 7->6->NUllist
        linkedList.push(7);
        // Insert 1 at the beginning. So linked list becomes
        // 1->7->6->NUllist
        linkedList.push(1);
        // Insert 4 at the end. So linked list becomes
        // 1->7->6->4->NUllist
        linkedList.append(4);
        // Insert 8, after 7. So linked list becomes
        // 1->7->8->6->4->NUllist
        linkedList.insertAfter(linkedList.head.next, 8);
        //printing the linked list
        linkedList.printList();
        //insertions

    }
}
