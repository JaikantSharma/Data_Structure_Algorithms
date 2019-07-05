package tech;

import java.util.Arrays;

/*
 * Program is written by Jaikant
 * 
 * This is for Stack Implementation
 * 
 * Stack Implementation is done using Single Big Array
 * 
 * So without Dynamic Array, Which is not good implementation
 */

public class Stack_Without_Dynamic_Array {
	
	private int[] stack;
	
	//Stack Top tracker
	//Without its hard to implement stack with Array
	private int top;

	public Stack_Without_Dynamic_Array() {
		stack= new int[100];
		top=-1;
	}
	
	public static void main(String[] args) {
		Stack_Without_Dynamic_Array stack_without_dynamic_array= new Stack_Without_Dynamic_Array();
		
		stack_without_dynamic_array.push(4);
		stack_without_dynamic_array.push(5);
		System.out.println("Pop at Stack : "+ stack_without_dynamic_array.pop());
		stack_without_dynamic_array.push(8);
		
		System.out.println("Elements at Stack : "+Arrays.toString(stack_without_dynamic_array.stack));
		
	}
	
	public void push(int k) {
		stack[++top]=k;
		System.out.println("Push at Stack : "+stack[top]);
	}
	
	public int pop() {
		return stack[top--];
	}
}
