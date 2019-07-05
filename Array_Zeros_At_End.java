import java.util.Arrays;

/*
 * Program is written by Jaikant
 * 
 * This is for Array 
 * 
 * Its to Transform into array where all zeros at the end
 */
public class Array_Zeros_At_End {

	public static void main(String[] args) {
		
		//Passed simple input array
		//Ideally passed through Console or written with multiple test cases
		
		int[] x= {1,23,0,45,0,0,0,1,2};
		
		int[] y= sortAllZeros(x);
		
		System.out.println(Arrays.toString(y));
		

	}
	
	//This will sort all zeros at the end
	//Will update soon through time complexity
	
	public static int[] sortAllZeros(int[] x) {
		int i= 0;
		int j= x.length-1;
		int temp=0;
		
		while(i<=j) {
			if(x[i]==0 && x[j]!=0) {
				temp= x[j];
				x[j] = x[i];
				x[i]=temp;
			}
			else if (x[i]!=0){
				i++;
			}
			else if ( x[j]==0) {
				j--;
			}
			
			//What if both zeros: but this condition will not arrive

		}
		
		return x;
	}

}
