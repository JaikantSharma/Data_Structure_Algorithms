package tech;

import java.util.Arrays;

/*
 * Program is written by Jaikant
 * 
 * This is for Quick sort 
 * 
 * Its divide & Conquer Algorithm
 * 
 * Its made use of recursive
 * 
 * Even though on paper Merge Sort is considered faster than quick sort
 * 
 * But practically quick sort implemented wise & use wise preferred over merge sort
 */

public class Quick_Sort {
	
	//This is bit confusing but prettiest part of quick sort
	//Idea is to put all elements less than pivot on left side & greater
	//than on right side but not in order for e.g. {1, 3,2, 5(pivot), 6,9,11}
	
	//To do this we do two exchanges
	
	//One involves between i=-1 or low-1 & comparing j vs pivot
	//Second one to bring pivot in the middle using i+1
	public int partition(int[] arr, int low, int high) {
		
		int pivot= arr[high];
		int i=low-1;
		
		for(int j=low; j<high;j++) {
			if(arr[j]<=pivot) {	
				i++;
				int temp= arr[j];
				arr[j] =arr[i];
				arr[i]= temp;
				
			}
		}
		
		int temp= arr[i+1];
		arr[i+1]= arr[high];
		arr[high]= temp;
		
		
		return i+1;
	}
	
	public void sort(int[] arr, int low, int high) {
		
		int partition;
		
		//Recursive end condition
		//low & high is important : will help in splitting
		if(low<high) {
			
			partition= partition(arr, low, high);
			sort(arr, low, partition-1);
			sort(arr, partition+1, high);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {10, 7, 8, 9, 1, 5}; 
        int n = arr.length; 
  
        Quick_Sort ob = new Quick_Sort(); 
        ob.sort(arr, 0, n-1); 
  
        System.out.println("sorted array : "+ Arrays.toString(arr)); 
        
	}

}
