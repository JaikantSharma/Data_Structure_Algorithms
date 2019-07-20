package tech;

import java.util.Arrays;

/*
 * Program is written by Jaikant
 * 
 * This is for Stock Span 
 * 
 * {100, 70, 60, 80, 90} ====>  {1, 1, 1, (1+1+1), (1+ 1 + 1 +1) }
 * 
 * Its like how many consecutive numbers less including own
 * 
 * For e.g. for 80 numbers are {80,60,70}
 */


public class Iterative_Stock_Span {
	
	static int[] span;
	
	public static int[] stock_span(int[] stocks) {
		
		//initialize result with same size of stocks
		span= new int[stocks.length];
		
		for(int i=0; i<stocks.length;i++) {
			//Initialize comparing numbers in reducing starting with same number
			for(int j=i; j>=0;j--) {
				//Checking if same or greater than
				if(stocks[i] >=stocks[j]) {
					span[i]= span[i]+1;
				}
				else
					break;
			
			}
		}
		
		return span;
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] stocks= {100,70,60,80,90};
		
		int[] results= stock_span(stocks);
		
		System.out.println(Arrays.toString(results));
		
		

	}

}
