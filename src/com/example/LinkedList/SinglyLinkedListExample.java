package com.example.LinkedList;

public class SinglyLinkedListExample {
	
 Node head;  // head of list

 /* Linked list Node.  This inner class is made static so that
    main() can access it */
 static class Node {
     int data;
     Node next;
     
     Node(int d)  { 
    	 data = d; 
    	 next=null;
     } // Constructor
 }

 /* method to create a simple linked list with 3 nodes*/
 public static void main(String[] args)
 {
     /* Start with the empty list. */
	 SinglyLinkedListExample llist = new SinglyLinkedListExample();

     llist.head  = new Node(1);
     Node second = new Node(2);
     Node third  = new Node(3);

     /* Three nodes have been allocated  dynamically.
       We have refernces to these three blocks as first,  
       second and third

       llist.head        second              third
          |                |                  |
          |                |                  |
      +----+------+     +----+------+     +----+------+
      | 1  | null |     | 2  | null |     |  3 | null |
      +----+------+     +----+------+     +----+------+ */

     llist.head.next = second; // Link first node with the second node

     /*  Now next of first Node refers to second.  So they
         both are linked.

      llist.head        second              third
         |                |                  |
         |                |                  |
     +----+------+     +----+------+     +----+------+
     | 1  |  o-------->| 2  | null |     |  3 | null |
     +----+------+     +----+------+     +----+------+ */

     second.next = third; // Link second node with the third node

     /*  Now next of second Node refers to third.  So all three
         nodes are linked.

      llist.head        second              third
         |                |                  |
         |                |                  |
     +----+------+     +----+------+     +----+------+
     | 1  |  o-------->| 2  |  o-------->|  3 | null |
     +----+------+     +----+------+     +----+------+ */
     
     llist.printList();
 }
 
 /* This function prints contents of linked list starting from head */
 public void printList()
 {
     Node n = head;
     while (n != null)
     {
         System.out.print(n.data+" ");
         n = n.next;
     }
 }
}
