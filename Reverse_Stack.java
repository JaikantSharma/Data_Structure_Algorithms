package tech;
/*
 * Program is written by Jaikant
 * 
 * This is for Reversing Stack 
 * 
 * It made use of linked list implementing stack to save space
 */ 

public class Reverse_Stack { 
	public static void main(String[] args) 
	{ 
		Stack_Impl s = new Stack_Impl(); 
		s.push(5); 
		s.push(6); 
		s.push(7); 
		s.push(8); 
		System.out.println("Stack"); 
		
		s.display();

		
		s.reverse(); 

		System.out.println("Reversed Stack"); 
		s.display(); 
	} 
} 
class Stack_Impl_Node { 
	int data; 
	Stack_Impl_Node next; 
	public Stack_Impl_Node(int data) 
	{ 
		this.data = data; 
		this.next = null; 
	} 
} 

class Stack_Impl { 
	Stack_Impl_Node top; 


	public void push(int data) 
	{ 
		if (this.top == null) { 
			top = new Stack_Impl_Node(data); 
			return; 
		} 
		Stack_Impl_Node s = new Stack_Impl_Node(data); 
		s.next = this.top; 
		this.top = s; 
	} 
	public Stack_Impl_Node pop() 
	{ 
		Stack_Impl_Node s = this.top; 
		this.top = this.top.next; 
		return s; 
	} 


	public void display() 
	{ 
		Stack_Impl_Node s = this.top; 
		while (s != null) { 
			System.out.print(s.data + " "); 
			s = s.next; 
		} 
		System.out.println(); 
	} 


	public void reverse() 
	{ 
		Stack_Impl_Node prev, cur, succ; 
		cur = prev = this.top; 
		cur = cur.next; 
		prev.next = null; 
		while (cur != null) { 

			succ = cur.next; 
			cur.next = prev; 
			prev = cur; 
			cur = succ; 
		} 
		this.top = prev; 
	} 
} 


