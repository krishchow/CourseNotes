public class Adding {

    public static void main(String[] args) {

    	double x = 1.5;
    	double x2 = 0.5;
    	double sum = x + x2;
    	System.out.println(sum == 2.0);
    	
    	x = 1.25;
    	x2 = 1.0;
    	sum = x + x2;
    	System.out.println(sum == 2.25);
    	
        x = 0.1;
        sum = x + x + x;
        System.out.println(sum == 0.3);
        System.out.println(sum);
        
    }
}
