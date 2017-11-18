public class Practice {

	// [accessability] [return type] [class name]
	// public vs private
	public static int random(int i) {
	
		int num = 99;
		if (i > num) {
			int temp = i;
			i = num;
			num = temp;
		} else {
			i = 0;
			num = 100;
		}
		
		return i;
	}
	
	/**
	 Return sum of numbers from 0 to given n.
	 @param n   number to sum up to
	 @return  sum of numbers from 0 to n
	*/
	public static int mystery1(int n) {
	
		int s = 0;
		int i = 2;
		while (i <= n) {
			s += i;
			i = i + 2;
		}
		
		return s;
	}
	
	public static int mystery2(int n) {
		int s = 0;
		// start, end condition, step
		for (int i = 1; i <= n; i = i + 2) {
			s += i;
		}
		
		return s;
	}
	
	public static void main(String[] args) {
		// main method
		System.out.println(random(5));
		System.out.println(mystery2(8));
	}
	

}