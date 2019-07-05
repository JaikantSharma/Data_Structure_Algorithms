

import java.util.Arrays;

/*
 * Program is written by Jaikant
 * 
 * This is for Stack Implementation
 * 
 * Stack Implementation is done using dynamic Array using Copy Method
 * 
 * 
 */

public class Stack_With_Dynamic_Array {
	
	private static int[] stack;
	
	//Stack Top tracker
	//Without its hard to implement stack with Array
	private static int top;
	
	public Stack_With_Dynamic_Array() {
		stack= new int[3];
		top=-1;
	}
	
	public static void increase_capacity(int capacity, int[] stack_old) {
	
		stack= Arrays.copyOf(stack_old, 3*capacity);
	}

	public static void main(String[] args) {
		Stack_With_Dynamic_Array stack_with_dynamic_array= new Stack_With_Dynamic_Array();
		
		stack_with_dynamic_array.push(4);
		stack_with_dynamic_array.push(5);
		System.out.println("Elements at Stack : "+Arrays.toString(stack_with_dynamic_array.stack));
		stack_with_dynamic_array.push(8);
		stack_with_dynamic_array.push(9);
		stack_with_dynamic_array.push(10);
		System.out.println("Pop at Stack : "+ stack_with_dynamic_array.pop());
		stack_with_dynamic_array.push(8);
		
		System.out.println("Elements at Stack : "+Arrays.toString(stack_with_dynamic_array.stack));
		
	}
	
	public void push(int k) {
		if(top+1>=stack.length) {
			Stack_With_Dynamic_Array.increase_capacity(stack.length/3+1,stack);
		}
		stack[++top]=k;
		System.out.println("Push at Stack : "+stack[top]);
	}
	
	public int pop() {
		return stack[top--];
	}

	

}
