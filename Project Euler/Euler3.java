/* 
 * A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
 * Find the largest palindrome made from the product of two 3-digit numbers.
 * 
 */


public class Euler3 {

	public static boolean numberPalindrome(int input){
		int numberOfDigits = 0;
		int temp = input;
		
		while(temp > 0){
			temp /=10;
			numberOfDigits++;
		}
		
		while(input !=0){
			int left = input % 10;
			int right = (int)(input / Math.pow(10, numberOfDigits - 1));
			
			if(left != right)
				return false;
			input = (int)((input % Math.pow(10, numberOfDigits - 1))/10);
			numberOfDigits -=2;
		}
		return true;
	}
	
	public static void main(String[] args) {
		int max = Integer.MIN_VALUE;
		for(int i = 999; i > 0; i--){
			for(int j = 999; j > 0; j--){
				if(numberPalindrome(i * j)){
					if((i * j) > max)
						max = i * j;
				}
			}
		}
		System.out.println(max);

	}

}
