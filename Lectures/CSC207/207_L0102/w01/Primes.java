public class Primes {
	public static void main(String [] args){
		/**
		int i;
		for(i=0;i<100;i=i+1){
        		System.out.println(i+" "+isPrime(i));
		}
		**/
		System.out.println(primes(10000)[9999]);
	}
	public static boolean isPrime(int n){
        	if(n<2){
                	return false;
        	} else {
                	for(int i=2;i<n;i=i+1){
                        	if(n%i==0){
                                	return false;
				}
			}
                	return true;
		}
	}

	public static int [] primes(int n){
        	int current = 2;
		int num_primes=0;
        	int [] list_of_primes = new int[n];

        	while(num_primes<n){
                	if(isPrime(current)){
                        	list_of_primes[num_primes] = current;
				num_primes = num_primes+1;
			}
                	current = current + 1;
		}
        	return list_of_primes;
	}
}
