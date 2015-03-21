/*
 * The prime factors of 13195 are 5, 7, 13 and 29.
 * What is the largest prime factor of the number 600851475143 ?
 */
public class LargestPrimeFactor
{
	public static void main (String[] args) throws java.lang.Exception
	{
		long number = 600851475143L;
		long maxFactor = Long.MIN_VALUE;
		
		while(number % 2 == 0){
			System.out.println("2");
			number /= 2;
		}
		
		if(maxFactor <= 2)
			maxFactor = 2;
		
		for(int i = 3; i < Math.sqrt(number); i += 2){
			while(number % i == 0){
				if(maxFactor <= i)
					maxFactor = i;
				System.out.println(i);
				number /= i;
			}
		}
		
		if(number > 2)
			System.out.println(number);
		
		if(maxFactor <= number)
			maxFactor = number;
			
		System.out.println("maxFactor = "+maxFactor);
	}
}