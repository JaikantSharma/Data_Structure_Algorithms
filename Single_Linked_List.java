package tech;

/*
 * Program is written by Jaikant
 * 
 * This is for implementation of Single link list
 * 
 * We are inserting new node at the end....Remember node can be inserted anywhere
 * 
 * Based on below reference any method for linked list can be written
 */

public class Single_Linked_List {
	
	public static class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data= data;
			this.next=null;
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
		
		while(current.next !=null) {
		current=current.next;
		}
		
		current.next=inserted;
	}
	
	public void print() {
		Node current=head;
		
		while(current.next !=null) {
		current=current.next;
		System.out.println(current.data);
		}
		
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Node node1= new Node(1);
		Node node2= new Node(2);
		Node node3= new Node(3);
		
		Single_Linked_List singly_linked_list= new Single_Linked_List();
		
		
		singly_linked_list.insert(node1);
		singly_linked_list.insert(node2);
		singly_linked_list.insert(node3);
		
	
		
		singly_linked_list.print();
		
		

	}

}
