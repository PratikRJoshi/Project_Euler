/*
 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
 * What is the 10 001st prime number?
 */
import java.util.*;

public class Sieve
{
	public static void main (String[] args) throws java.lang.Exception
	{
		List<Long> primes = new ArrayList<Long>();
		primes.add(2l);
		
		long num = 3l;
		int index = 10001;
		while(primes.size() <= index){
			boolean composite = false;
			double sqrt = Math.sqrt(num);
			
			for(long p: primes){
				if(p > sqrt)
					break;
				if(num % p == 0){
					composite = true;
					break;
				}
			}
			
			if(!composite){
				primes.add(num);
			}
			num++;
		}
		
		System.out.println(primes.get(index - 1));
	}
}