package tech;

/*
 * Program is written by Jaikant
 * 
 * This is for Balanced brackets like {, [, ( 
 * 
 * Solved using Stack which first pushes everything whatever it can & then pop whatever it can balance
 * 
 * Other cases taken care of that
 */
public class BalanceParaenthesis {
	
	//Build my own as I believe existing Stack class in Java does't support that
	static class Stack_Without_Dynamic_Array_character {
		
		private char[] stack;
		
		//Stack Top tracker
		//Without its hard to implement stack with Array
		private int top;

		public Stack_Without_Dynamic_Array_character() {
			stack= new char[100];
			top=-1;
		}
		
	
		
		public void push(char k) {
			stack[++top]=k;
			//System.out.println("Push at Stack : "+stack[top]);
		}
		
		public char pop() {
			return stack[top--];
		}
		
		public boolean isEmpty()  
        { 
            return (top == -1) ? true : false; 
        } 
		
		boolean isMatchingPair(char character1, char character2) 
	    { 
	       if (character1 == '(' && character2 == ')') 
	         return true; 
	       else if (character1 == '{' && character2 == '}') 
	         return true; 
	       else if (character1 == '[' && character2 == ']') 
	         return true; 
	       else
	         return false; 
	    } 
	}
	
	public static boolean checkBalanced(char[] test1) {
		
		Stack_Without_Dynamic_Array_character stackBracket= new Stack_Without_Dynamic_Array_character();
		
		for(int i=0; i<test1.length;i++) {
			if(test1[i]=='{' || test1[i]=='(' || test1[i]=='[') {
				stackBracket.push(test1[i]);
			}
			
			if(test1[i]=='}' || test1[i]==')' || test1[i]==']') {
				
				//This is important because it checks if nothing pushes
				if(stackBracket.isEmpty()) {
					
					return false;
					
				}
				
				else if ( !stackBracket.isMatchingPair(stackBracket.pop(), test1[i]) ) 
	               { 
	                   return false; 
	               } 
				
				
			}
			
			
		}
		
		if (stackBracket.isEmpty()) 
	         return true; 
	       else
	         {   
	             return false; 
	         }  
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String test1= "{[()]}";
		
		String test2= "{[()]";
		
		char[] test3= test1.toCharArray();
		
		boolean check= checkBalanced(test3);
		
		System.out.println("String : " +test1);
		if(check ==true) {
			System.out.println("Balanced");
		}
		else {
			System.out.println("Un-Balanced");
		}
		System.out.println("String : " +test2);
		
		test3= test2.toCharArray();
		
		check= checkBalanced(test3);
		
		if(check ==true) {
			System.out.println("Balanced");
		}
		else {
			System.out.println("Un-Balanced");
		}

	}

}
