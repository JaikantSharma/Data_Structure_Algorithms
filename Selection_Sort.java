package tech;

import java.util.Arrays;

/*
 * Program is written by Jaikant
 * 
 * This is for Selection Sort 
 * 
 * Its to sort using taking one element at time comparing with other elements
 */

public class Selection_Sort {
	
	public static int[] selection_sort(int[] to_sort) {
		int[] sorted=to_sort;
		//Even though first sort taught is bubble
		//but actually this is the method to apply using pen and paper
		//using normal for loop
		//just take care of boundary conditions
		for(int i=0;i<to_sort.length-1;i++) {
			for(int j=i+1;j<to_sort.length;j++) {
				if(sorted[i]>sorted[j]) {
					int temp=sorted[j];
					sorted[j]=sorted[i];
					sorted[i]=temp;
				}
			}
		}
		
		
		return sorted;
		
		
	}
	
	public static void main(String[] args) {
		int[] to_sort= {2,65,89,3,1};
		int[] sorted=selection_sort(to_sort);
		
		System.out.println(Arrays.toString(sorted));
		
	}

}
