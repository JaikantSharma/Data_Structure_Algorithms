package tech;

import java.util.Arrays;

/*
 * Program is written by Jaikant
 * 
 * This is for Bubble Sort 
 * 
 * Its to sort using comparing adjacent element
 */

public class Bubble_Sort {
	
	public static int[] bubble_sort(int[] to_sort) {
		int[] sorted=to_sort;
		//This for loop is interesting to write
		//Normally for loop written one element to compare with another element
		//but here i here just represents number of times loop to execute
		//and j takes care about to compare adjacent element
		
		for(int i=0;i<to_sort.length;i++) {
			for(int j=0;j<to_sort.length-1;j++) {
				if(sorted[j]>sorted[j+1]) {
					int temp=sorted[j];
					sorted[j]=sorted[j+1];
					sorted[j+1]=temp;
				}
			}
		}
		
		
		return sorted;
		
		
	}
	
	public static void main(String[] args) {
		int[] to_sort= {2,65,89,3,1};
		int[] sorted=bubble_sort(to_sort);
		
		System.out.println(Arrays.toString(sorted));
		
	}

}
