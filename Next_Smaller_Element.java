package tech;

import java.util.Arrays;
import java.util.Stack;

/*
 * Program is written by Jaikant
 * 
 * This is for next smaller element
 * 
 * Ideally it has to be previous smaller element
 * 
 * It has Stack magic as well as abstraction magic which has initially bluffed me to explain the 
 * solution in one liner
 */
public class Next_Smaller_Element {
	

	public static void main(String[] args) {
		
		int[] arr_in= {4,5,2,10,8};
		
		System.out.println("Input Array : "+Arrays.toString(arr_in));
		
		int[] arr_out=next_smaller_element(arr_in);
		
		System.out.println("Output Array : "+Arrays.toString(arr_out));
		
	}
	
	public static int[] next_smaller_element(int[] arr_in) {
		
		Stack<Integer> stack=new Stack();
		
		int[] arr_out=new int[arr_in.length];
		
		for(int k=0;k<arr_in.length;k++) {
			//Pop whatever possible
			while(!stack.empty() && stack.peek()>arr_in[k]) {
				stack.pop();
			}
			
			//This should be when all possible popped
			if(stack.empty()) {
				arr_out[k]=-1;
			}
			
			else {
				arr_out[k]=stack.peek();
			}
			//Push so that one remain behind
			stack.push(arr_in[k]);
		}
		return arr_out;
	}

}
