package tech;

/*
 * Program is written by Jaikant
 * 
 * This is for implementation of Doubly link list
 * 
 * We are inserting new node at the end....Remember node can be inserted anywhere
 * 
 * Based on below reference any method for linked list can be written
 */

public class Doubly_linked_list {
	
	public static class Node{
		int data;
		Node next;
		//previous node is required
		Node previous;
		
		Node(int data){
			this.data= data;
			this.next=null;
			this.previous=null;
		}
		//This is for Head
		//Head also to be initialized else null pointer exception will happen
		Node(){
			this.next=null;
		}
	}
	
	//Head is special as its like node but without data
	//Kind of reference point or starting point
	
	//It has to be outside as other method will also access that
	Node head =new Node();
	
	public void insert(Node inserted) {
		
		//Current node is like temp node
		Node current=head;
		
		//At this stage we don't care about previous as we have to move forward
		//this is the beauty of this
		
		while(current.next !=null) {
		
		current=current.next;
		
		
		}
		//here only previous is required
		current.next=inserted;
		inserted.previous=current;
	}
	
	public void print() {
		Node current=head;
		
		System.out.println("Printing in forward direction");
		
		while(current.next !=null) {
		current=current.next;
		
		
		System.out.println(current.data);
		}
		
		System.out.println("Printing in reverse direction");
		
		while(current.previous !=null) {
			
			System.out.println(current.data);
			current=current.previous;
			}
			
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Node node1= new Node(1);
		Node node2= new Node(2);
		Node node3= new Node(3);
		
		Doubly_linked_list singly_linked_list= new Doubly_linked_list();
		
		
		singly_linked_list.insert(node1);
		singly_linked_list.insert(node2);
		singly_linked_list.insert(node3);
		
	
		
		singly_linked_list.print();
		
		

	}

}
