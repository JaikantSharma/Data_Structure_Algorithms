package tech;

import java.util.Stack;

/*
 * Program is written by Jaikant
 * 
 * This is for finding redundant brackets 
 * 
 * Initial hypothesis there is redundancy, unitil we get the evidence using operators
 * 
 * Stack has been used
 */

public class Redundant_Brackets_Stack {
	
	public static boolean check_redundancy(String test) {
		
		//We have to work on char, smaller unit of String as visible
		//Neglecting case of white space
		//Will add in future : Its easy to strip down whitespace or any other cleaning if we have to do
		char[] char_test= test.toCharArray();
		
		Stack<Character> stk= new Stack<>();
		
		for(char c:char_test) {
			
			if(c==')') {
				
				char top= stk.peek();
				
				//Initial hypothesis there is  redundancy until evidences is there
				//It helps in many cases which we don't have to take
				boolean result= true;
				
				while(top!='(') {
					if(top=='+' || top=='-'||top=='*'||top=='/') {
						result= false;
					}
					
					top=stk.peek();
					stk.pop();
					
				}
				//We did't get proof of getting no redundancy which only operators can provide
				if(result==true) {
					return true;
				}
				
			}
			else {
				stk.push(c);
			}
		}
		
		
		return false;
	}

	public static void main(String[] args) {
		// There can be many test cases i believe
		// I am considering five now
		// May be I will increase test cases in future
		String test1= "((a+b))";
		
		if(check_redundancy(test1)==true) {
			System.out.println("Redundant brackets are there for String "+test1);
		}
		else {
			System.out.println("Redundant brackets are not there for String "+test1);
		}
		
		String test2= "((a))";
		
		if(check_redundancy(test2)==true) {
			System.out.println("Redundant brackets are there for String "+test2);
		}
		else {
			System.out.println("Redundant brackets are not there for String "+test2);
		}
		
		String test3= "(a+b)";
		
		if(check_redundancy(test3)==true) {
			System.out.println("Redundant brackets are there for String "+test3);
		}
		else {
			System.out.println("Redundant brackets are not there for String "+test3);
		}
		
		String test4= "(a)";
		
		if(check_redundancy(test4)==true) {
			System.out.println("Redundant brackets are there for String "+test4);
		}
		else {
			System.out.println("Redundant brackets are not there for String "+test4);
		}
		
		String test5= "a";
		
		if(check_redundancy(test5)==true) {
			System.out.println("Redundant brackets are there for String "+test5);
		}
		else {
			System.out.println("Redundant brackets are not there for String "+test5);
		}



	}

}
