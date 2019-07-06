package tech;

/*
 * Program is written by Jaikant
 * 
 * This is for Fibonacii calculation using Recursion 
 * 
 * This is easy to calculate final value but not easy to calculate series
 * 
 * its required optimization
 */

public class Fibonacii_Recursion {
	
	
	public static int cal(int n) {
		
		//Base condition
		//Two return : one for base & another for recursion
		if(n==0 || n==1) {
			return 1;
		}
			
		return cal(n-1)+ cal(n-2);
	}

	public static void main(String[] args) {
		
		//To calculate final value
		System.out.println(cal(10));
		
		//To calculate for series
		for(int i=0;i<=10;i++) {
			System.out.print(cal(i)+" ");
		}
		

	}

}
