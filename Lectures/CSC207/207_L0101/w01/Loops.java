/**
 * Simple examples of loops.
 */
 public class Loops {
 

	/**
	 Return sum of even numbers from 0 to given n.
	 @param n   number to sum up to
	 @return  sum of even numbers from 0 to n
	*/
	public static int sumEven(int n) {
	
		int s = 0;
		int i = 2;
		while (i <= n) {
			s += i;
			i = i + 2;
		}
		
		return s;
	}

	/**
	 Return sum of all odd numbers from 0 to given n.
	 @param n   number to sum up to
	 @return  sum of odd numbers from 0 to n
	*/
	public static int sumOdd(int n) {
		int s = 0;
		// start, end condition, step
		for (int i = 1; i <= n; i = i + 2) {
			s += i;
		}
		
		return s;
	}
	
	/**
	 Return a list of the first n odd numbers
	 @param n   number of odd numbers to return
	 @return  list of n odd numbers
	*/
	public static int[] getOddNums(int n) {
		int[] nums = new int[n];
		int index = 0;
		int num = 1;

		while (index < n) {
			nums[index] = num;
			index++;
			num+=2;
		}
		
		return nums;
	}
}
