package tech;

/*
 * Program is written by Jaikant
 * 
 * This is for Factorial calculation using Recursion 
 * 
 * This is easiest to understand Recursion
 */

public class Factorial_Recursion {
	
	public static int cal(int n) {
		
		//Base condition
		//Two return : one for base & another for recursion
		if(n==0) {
			return 1;
		}
		
		//5*cal(4)
		//4*cal(3)
		//3*cal(2)
		//2*cal(1)
		//1*cal(0)
		//Thats how we push into recursive stack
		//Then pop becomes once we reach base condition
		//1*1
		//2*1*1
		//3*2*1*1
		//4*3*2*1*1
		//5*4*3*2*1*1=120
		return n*cal(n-1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(cal(5));

	}

}
