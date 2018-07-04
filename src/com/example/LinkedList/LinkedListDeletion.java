package com.example.LinkedList;

public class LinkedListDeletion {

	Node head;

	static class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
			next = null;
		}
	}
	
	public static void main(String [] args) {
		LinkedListDeletion llist = new LinkedListDeletion();
		
		llist.head = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);
		Node fourth = new Node(4);
		Node fifth = new Node(5);
		
		llist.head.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next = fifth;
		
		llist.deleteNode(5);
		llist.deleteNode(3);
		llist.deleteNode(1);
		llist.printList();
	}

	private void deleteNode(Integer key) {

		// Store head node
        Node temp = head, prev = null;
        
        // If head node itself holds the key to be deleted
        if (temp != null && temp.data == key)
        {
            head = temp.next; // Changed head
            return;
        }
        // Search for the key to be deleted, keep track of the
        // previous node as we need to change temp.next
        while (temp != null && temp.data != key)
        {
            prev = temp;
            temp = temp.next;
        }    
        
        // If key was not present in linked list
        if (temp == null)
        	return;
 
        // Unlink the node from linked list
        prev.next = temp.next;
		
	}

	private void printList() {
		Node node = head;
		
		while(node != null){
			System.out.println(node.data);
			node = node.next;
		}
	}

}
