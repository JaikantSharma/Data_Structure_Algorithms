
package peace;

/*
 * Program is written by Jaikant
 * 
 * This is for Cutting Road using Recursion
 * 
 * Its not making use of dynamic programming or memoization yet
 * 
 * [1,3]---->[1,2]-->[1,1] & [2,2] and then return back for recursion stack
 * 
 * Then move to [2,3] and further recursion 
 * 
 * Most difficult is to design an recursion
 * 
 * Because Visualization a Recusrion Stack is not easy & not directly mapped to theory
 */

class Cutting_Rod_Recursion
{
	
	public static int rodCut(int[] price, int n)
	{
		// base case
		if (n == 0) {
			return 0;
		}

		int maxValue = Integer.MIN_VALUE;

		
		for (int i = 1; i <= n; i++)
		{
			// rod of length i has a cost price[i-1]
			
			System.out.println("Recursion Stack i , n "+i+" "+n);
			int cost = price[i - 1] + rodCut(price, n - i);
			System.out.println("Deeper into Recursion Stack i+ , n+ "+i+" "+n);
			
			System.out.println("Cost"+cost);
			
			if (cost > maxValue) {
				
				maxValue = cost;
				
			}
			System.out.println("maxValue "+maxValue);
		}

		return maxValue;
	}

	// main function
	public static void main(String[] args)
	{
		// length[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
		int price [] = { 1, 5, 8, 9, 10, 17, 17, 20 };

		// rod length
		int n = 3;

		System.out.println("Profit is " + rodCut(price, n));
	}
}
