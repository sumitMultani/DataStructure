package com.example.LinkedList;

public class LinkedListInsertion {
	
	Node head;
	
	static class Node {
		int data;
		Node next;
		
		Node(int d) {
			this.data = d;
			next=null;
		}
	}
	
	public static void main(String[] args) {
		
		LinkedListInsertion llist = new LinkedListInsertion();
		llist.head = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);
		Node fourth = new Node(5);
		
		llist.head.next = second;
		second.next = third;
		third.next = fourth;
		
		// perform insertion operation
		llist.insertAfter(third,4);
		llist.printList();
	}

	public void printList() {
		
		Node n = head;
		while(n != null) {
			System.out.println(n.data);
			n = n.next;
		}
	}
	
	public void insertAfter(Node prev_node, int new_data)
	{
	    /* 1. Check if the given Node is null */
	    if (prev_node == null)
	    {
	        System.out.println("The given previous node cannot be null");
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
}
