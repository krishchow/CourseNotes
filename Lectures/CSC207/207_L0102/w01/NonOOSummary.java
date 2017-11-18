// pieces, class file, program, java javac
public class NonOOSummary {
	public static void main(String [] args){
		// Start of execution, printing
		System.out.print("Hello ");
		System.out.println("World!");

		// Primitive types, declaring variables
		// 123 - automatically a short integer
		// 9999.2 - automatically a double

		double d=9991991.2344;
		// d = "This"; // This is a comment
		float f=(float)3222.45; 
		long l=-99991919; // -9223372036854775808 to 9223372036854775807
		int i=8236,num_IndexCounter=-17; // -2147483648 to 2147483647 
		short s=-32767; //-32768 to 32767
		byte b=(byte)-7; //-128 to 127
		// IS-A reads up the above list

		// can do   s = b;
		// can't do b = s;
		// can do b = (byte)s; // casting

		char c='T'; // 0..65535 IS-A int or above
		boolean bo=false; // IS-NOT any of the above

		// Assignment statements, expressions
		/*
		 * Converting, casting
		 *
		 * Expression evaluated left to right, each sub-expression
		 *	converted AS NECESSARY. Think of = as an operator!
		 * Converting done automatically up the list 
		 * 	x to y if x IS-A y, if no info lost
		 * Casting required to move down the list
		 */

		d=i; f=b; b=(byte)d; // Assignment expressions 
		i=23+19*2; c=(char)b; d=3.14159*12*12;

		d=(1/2)+(double)1/2+1/2+(1/2.0); System.out.println(d);
		i=(int)((1.0/2)+((double)1/2));  System.out.println(i);

		// Strings (not primitive)
		String s0="Hey There!",s1=null,s2="";
		s0="i="+i+" and d="+d;
		s0=s0+" and b="+b;
		System.out.println("In total "+s0);
		System.out.println("s0.length="+s0.length());
		//System.out.println("s1.length="+s1.length());
		System.out.println("s2.length="+s2.length());

		
		/* Operations which return a boolean (true/false)
		 * i==j i<j i<=j i>j i>=j i!=j
		 * Operations on booleans  !   &&   ||  ^
		 *                        NOT  AND  OR XOR
		 */ 
		
		boolean bo1,bo2=(99<d);
		bo1=true;
		bo=(!(12>23))||(bo1&&bo2&&true);
		System.out.println("bo1="+bo1+" bo2="+bo2+" d="+d+" bo="+bo);
		// That is, b=(!(false))||(true && false && true)) which is 
		// (true || false) which is true

		// if-statement
		int n=17;
		if(i>n){
			int temp=i;  // BLOCK
			i=n;
			n=temp; 
		} else {
			i=0; n=100; // BLOCK
		}

		// method calls, arguments, pass by VALUE
		System.out.println("i="+i+" n="+n);
		i=sum(n); // NOTE: n unchanged
		System.out.println("i="+i+" n="+n);

		// if, while, for-loops 
		//	if BLOCK has 1 statement, { and } can be left off

		// Recursion, stack
		n=10; n=factorial(n);
		System.out.println(n);
		// n=factorial(-3); // OOPS
	} // end of main

	// Method definition, return type, parameters, local variables
	// additional parameters comma separated
	static int sum(int n){
		// while and break
		int x=0;
		int i=2;
		while(i<=n){ // sum=2+...+i-1
			x=x+i;
			i=i+1;
		}
		n=0; // Won't affect argument!
		return(x); // evaluate, assign back, return control
	}

	// for-loop
	static int sum2(int n){
		int sum=0;
		                     // Same as
		int i;               // int i; 
		                     // i=2; 
		for(i=2;i<n+1;i=i+1){ // while(i<n+1){
			sum=sum+i;   //     sum=sum+i;
		                     //     i=i+1;
		}                    // }
		return(sum);
	}

	// Recursion
	// Returns i!=i*(i-1)*...*2*1
	static int factorial(int i){
		int retVal=1;        // 1
		if(i==0){            // 2
			// Solve simple problem
			retVal=1;    // 3
		} else { 
			// Complex problem solved using simpler ones
			retVal=i*factorial(i-1); //4
		}
		return(retVal);      //5
	}
}
