public class Types {

	public static void main(String[] args) {
		// [data type] [var name] = [value]
		double d = 99.5;
		float f = (float) 3222.45;
		long l = -99991919; // 64 bit integer; -2^63 to 2^63 - 1
		int i = 42; // 32 bit integer; -2^31 to 2^31 - 1
		short s = -32767; // 16 bit integer; -2^15 to 2^15 - 1
		byte b = (byte) -7; // 8 bit integer; -128 to 127
		
		char c = 'a'; // you can convert this into an int
		
		boolean b = true; // false
		
		// converting up the list is done automatically
		// no loss of data
		d = i;
		System.out.println(d);
		
		// to convert down this list, you have to
		// explicitly cast it
		i = (int)d;
		System.out.println(i);
		
		//i = 42.5; // this is going to give me an error
		
		//int i = 45; // this will give error; i is already declared above
	}

}

