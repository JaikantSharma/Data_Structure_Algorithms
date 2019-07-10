package tech;


/*
 * Program is written by Jaikant
 * 
 * This is for implementation of Circular link list
 * 
 * We are inserting new node at the end....Remember node can be inserted anywhere
 * 
 * Based on below reference any method for linked list can be written
 */

public class Circular_Linked_List {
	
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
		
		//i believe there will be two cases :
		//one for null
		//one for head
		
		if(current.next==null) {
			current.next=inserted;
			current.next.next=head;
			return;
		}
		
		
		while(current.next !=head) {
		
		current=current.next;
		
		
		}
		
		current.next=inserted;
		current.next.next=head;
		
	}
	
	public void print() {
		Node current=head;
		
		System.out.println("Printing in forward direction");
		
		while(current.next !=head) {
		current=current.next;
		
		
		System.out.println(current.data);
		}
		//current=current.previous;
		System.out.println("Printing in forward direction again as its circular");
		current=current.next;
		
		while(current.next !=head) {
			current=current.next;
			
			System.out.println(current.data);
			
			}
			
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Node node1= new Node(1);
		Node node2= new Node(2);
		Node node3= new Node(3);
		
		Circular_Linked_List circular_linked_list= new Circular_Linked_List();
		
		
		circular_linked_list.insert(node1);
		circular_linked_list.insert(node2);
		circular_linked_list.insert(node3);
		
	
		
		circular_linked_list.print();
		
		

	}

}
